package com.eomcs.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import com.eomcs.pms.table.BoardTable;
import com.google.gson.Gson;

// 역할
// - 클라이언트와 통신하는 일을 담당한다.
// - 클라이언트 요청이 들어오면 그 요청을 처리할 객체를 찾아 실행하는 일을 한다.
// - 클라이언트 요청 정보를 객체에 보관하고, 응답 기능을 수행할 객체를 만드는 일을 한다.

public class RequestProcessor implements AutoCloseable{

	Socket socket;
	PrintWriter out;
	BufferedReader in;

	BoardTable boardTable = new BoardTable();



	public RequestProcessor(Socket socket) throws Exception{
		this.socket = socket;
		out = new PrintWriter(socket.getOutputStream());
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		try {out.close();} catch (Exception e) {} 
		try {in.close();} catch (Exception e) {} 
		try {socket.close();} catch (Exception e) {} 
	}

	public void service() throws Exception {
		while(true) {
			String command = in.readLine(); // 클라이언트에서 한 줄의 문자열을 보낼 때까지 기다린다.
			System.out.println("===> " + command);

			if (command.equalsIgnoreCase("quit")) {
				in.readLine(); // 클라이언트가 quit 명령을 보낼 때 이어지는 값으로 빈 문자열을 데이터로 보낸다.
				out.println("success");
				out.println("goodbye");
				out.flush();
				break;

			} else if (command.startsWith("/board/")) {
				Request request = new Request(command, in.readLine());
				Response response = new Response();



				boardTable.execute(request, response);
				out.println(response.status);
				if(response.getValue() != null) {
					out.println(new Gson().toJson(response.getValue()));
				}else {
					out.println();
				}

				out.flush();

			}
			else {
				in.readLine();
				out.println("success");
				out.println(command);
				out.flush();
			}
		}
	}

}
package com.bit.exam2;
//Shirt에 대한 정보를 가지고 있는 클래스
public class Shirt {
	private String brandName;
	private boolean longSleeved;
	private double price;
	
	
	//exam1에서 setShirt() 함수를 이용했다면 이제는 생성자를 통한 필드 초기화
	public Shirt(String brandName, boolean longSleeved, double price) {
		super();
		this.brandName = brandName;
		this.longSleeved = longSleeved;
		this.price = price;
	}

	public String getShirt() {
		return brandName+" "+longSleeved+","+price;
	}
	
	public void discount(double per) { 			
		double discountPrice = price * (1- (per/100));
		System.out.println(per+"% 할인가격은 "+discountPrice+" 달라입니다.");
		
	}
	
}

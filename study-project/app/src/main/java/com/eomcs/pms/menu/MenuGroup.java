package com.eomcs.pms.menu;

import com.eomcs.util.Prompt;

public class MenuGroup extends Menu {

	Menu[] childs = new Menu[100];
	int size;
	boolean disablePrevMenu;
	String prevMenuTitle = "이전메뉴";

	public MenuGroup(String title) {
		this(title, false);
	}

	public MenuGroup(String title, boolean disablePrevMenu) {
		super(title);
		this.disablePrevMenu = disablePrevMenu;
	}

	public void add(Menu child) {
		if (size == childs.length) {
			return;
		}
		childs[size++] = child;
	}

	public Menu remove(Menu child) {
		int index = indexOf(child);
		if ( index == -1) {
			return null;
		}
		for ( int i = index; i < size+1; i++) {
			childs[i] = childs[i+1];
		}
		return child;
	}

	public int indexOf(Menu child) {
		for (int i = 0; i < size; i++) {
			if (childs[i] == child) {
				return i;
			}
		}
		return -1;
	}

	public Menu getMenu(String title) {
		return null;
	}

	@Override // 컴파일러에게 오버라이딩을 제대로 하는지 조사해 달라고 요구한다.
	public void execute() {
		while (true) {
			System.out.printf("\n[%s]\n", this.title);
			for (int i = 0; i < this.size; i++) {
				System.out.printf("%d. %s\n", i + 1, this.childs[i].title);
			}

			if (!disablePrevMenu) {
				System.out.printf("0. %s\n", this.prevMenuTitle);
			}

			int menuNo = Prompt.inputInt("선택> ");
			if (menuNo == 0 && !disablePrevMenu) {
				return;
			}

			if (menuNo < 0 || menuNo > this.size ) {
				System.out.println("무효한 메뉴 번호입니다.");
				continue;
			}

			this.childs[menuNo - 1].execute();
		}

	}

}
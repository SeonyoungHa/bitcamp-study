package com.bit.exam1;
//Shirt에 대한 정보를 가지고 있는 클래스
public class Shirt {
  private String brandName;
  private boolean longSleeved;
  private double price;


  //1. 메소드의 인자값(로컬변수)와 필드(멤버변수)의 이름이 같다...같아야 하는 이유?
  //2. 필드 앞에 붙이는 this 키워드의 용도?
  //3. 메소드의 리턴 타입이 void인 이유?
  public void setShirt(String brandName, boolean longSleeved, double price) {
    this.brandName = brandName;
    this.longSleeved = longSleeved;
    this.price = price;
  }

  //4. 메소드의 리턴타입이 String인 것에 대한 정리 할수 있어야 한다.
  public String getShirt() {
    return brandName+","+longSleeved+","+price;
  }

  // 인자값으로 각각의 할인율에 해당하는 값을 직접 입력한다...
  // 10% 할인률은 인자값이 10으로 입력하는 것이 0.9로 입력하는 것보다 가독성이 높음..
  public void discount(double per) { 			
    double discountPrice = price * (1- (per/100));
    System.out.println(per+"% 할인가격은 "+discountPrice+" 달라입니다.");

  }

}

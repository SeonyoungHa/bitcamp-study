package com.bit.exam;

public class Shirt {

  String brandName;
  boolean longSleeved;
  double price;
  //double discountPrice;

  public void setShirt(String t1, boolean t2, double t3) {
    brandName = t1;
    longSleeved = t2;
    price = t3;
  }

  public String getShirt() {
    return brandName +","+ longSleeved +","+ price;
  }

  public void discount(double d) {
    // discountPrice = d;
    d = price * 0.9;
    //discountPrice = discountPrice * 0.9;
    System.out.printf("할인가격은 %f", d);
  }
}

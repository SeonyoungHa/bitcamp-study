package com.bit.exam.Test;

import com.bit.exam.Shirt;

public class ShirtTest {

  public static void main(String args[] ) {

    Shirt t1 = new Shirt();
    Shirt t2 = new Shirt();
    Shirt t3 = new Shirt();

    t1.setShirt("chanel", true, 100.9);
    t2.setShirt("Givency", true, 40.9);
    t3.setShirt("Bvgrl", true, 70.9);


    System.out.print(t1.getShirt());
    t1.discount(100.9);
    System.out.println();
    
    System.out.print(t2.getShirt());
    t1.discount(40.9);
    System.out.println();

    System.out.print(t3.getShirt());
    t1.discount(70.9);
    // System.out.print(",");
  }

}


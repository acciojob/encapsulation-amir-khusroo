package com.driver;

import java.sql.SQLOutput;

public class Main {
  public static void main(String[] args) {
    RWOnly rw = new RWOnly();
//    System.out.println(rw.name); //'name' has private access in 'com.driver.RWOnly'
    rw.setName("Amir Khusroo");
    System.out.println(rw.getName());

  }
}
package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
      Voter v1=new Voter();
      v1.setName("Don");
      System.out.println("Hello "+v1.getName());

      v1.output();

    }
}
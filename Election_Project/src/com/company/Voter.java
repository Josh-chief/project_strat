package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Voter {
    private String name;
    private String fname;
    public int age;
    private int id;
    public String county_location;
    public boolean gender;

    public Voter()
    {
        //Default constructor
    }
    public Voter(String name,int age,String fname,int id,String county_location,boolean gender)
    {

        this.name=name;
        this.fname=fname;
        this.age=age;
        this.id=id;
        this.county_location=county_location;
        this.gender=gender;

    }

    public void setName(String name)//encapsulation
    {
        this.name = name;
    }

    public String getName()//encapsulation
    {
        return name;
    }

    public  void output()
    {
        System.out.println("Please enter your age :");
        Scanner scanner=new Scanner(System.in);
        this.age= scanner.nextByte();

        //this.age=age;
        //this.age=2020-age;

        if (age>=18) {
            System.out.println("Viable to vote more questions");
        }
        else
            {
            System.out.println("Not viable to vote");
        }
        System.out.println("Please enter your Full Name :");
        Scanner scanner1=new Scanner(System.in);
        this.fname = scanner1.nextLine();

        System.out.println("Please enter your ID Number :");
        Scanner scanner2=new Scanner(System.in);
        this.id= scanner2.nextInt();

        System.out.println("Please enter your Country location :");
        Scanner scanner3=new Scanner(System.in);
        this.county_location = scanner3.nextLine();

        System.out.println("Please enter your Gender male or female:");//TRICKY BOOLEAN
        Scanner scanner4=new Scanner(System.in);
        this.gender = scanner4.nextBoolean();





    }


}




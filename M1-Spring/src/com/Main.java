package com;

public class Main {
    public static void main(String[] args) {
//        Demo d = () -> {
//            System.out.println("Methods Implied using lambda by using Expression");
//        };
//        d.sample();
//
//        Demo d1 = ()->
//            System.out.println("Methods Implied using lambda by using Expression");
//        d1.sample();
//
//        Demo d = (num,num1)->{
//            System.out.println("For Argument number "+(num+num1));
//        };
//        d.sample(1,2);

        Demo d1 = (num1,num2) -> num1+num2;
        System.out.println(d1.sample(1000,2000));
    }
}

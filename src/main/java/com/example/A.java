package com.example;

import org.w3c.dom.ls.LSOutput;



public class A {
    public static void main(String[] args) {
        A obj = new A();
       int val = obj.test();
        System.out.println(val);
    }
    public int test(){
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        return 100;
    }
}

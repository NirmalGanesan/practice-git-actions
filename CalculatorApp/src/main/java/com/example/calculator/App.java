package com.example.calculator;


public class App 
{
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        return a/b;
    }
    public static void main( String[] args )
    {
        int result = add(9,8);
        System.out.println("Result addition: " + result);  
    } 
}

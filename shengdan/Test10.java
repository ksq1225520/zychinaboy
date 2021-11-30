package com.ksq.shengdan;

public class Test10 {
    public static void main(String[] args) {
        for(int i=5;i<1000;i++){
        if(i%3==2&&i%5==2&&i%7==4){
            System.out.println(i);
            break;
        }
        }
    }
}

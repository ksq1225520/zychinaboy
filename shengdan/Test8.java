package com.ksq.shengdan;
import java.util.Scanner;
public class Test8 {
    public static void main(String[] args) {
        System.out.println("宝贝请输入一个数");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("无法输出");
        } else {
            for (int i = 1; i <=n; i++) {
            if(i%3==0&&i%5!=0){
                System.out.println("fizz");
            }else if(i%5==0&&i%3!=0){
                System.out.println("buzz");
                }else if(i%3==0&&i%5==0){
                System.out.println("fizzbuzz");
            }else {
                System.out.println(i);
            }
            }
        }
    }
}

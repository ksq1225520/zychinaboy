package com.ksq.shengdan;
import java.util.Scanner;
public class Test9 {
    public static void main(String[] args) {
        System.out.println("宝贝请输入一个数");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("不是素数");
                break;
            }else if(i==n-1){
                System.out.println("素数");
        }
        }
    }
}

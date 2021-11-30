package com.ksq.shengdan;
import java.util.Locale;
import java.util.Scanner;
public class Test11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一串英文");
        String s= sc.nextLine();
        Big(s);
    }
    public static void Big(String s){
        String[] split=s.split(" ");
        for(int i=0;i< split.length;i++){
           String s2=split[i].substring(0,1).toUpperCase()+split[i].substring(1);
            System.out.println(s2+"");
        }
    }
}

package com.ksq.shengdan;
import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        String username="wangkang";
        String password="wangkang123";
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名");
        String name=sc.nextLine();
        System.out.println("请输入密码");
        String pas=sc.nextLine();
        if(name.equals(username)&&pas.equals(password)){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }
    }
}

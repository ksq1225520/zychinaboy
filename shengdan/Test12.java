package com.ksq.shengdan;
import java.util.Scanner;
public class Test12 {
    public static void main(String[] args) {
        System.out.println("请输入一串字符");
        Scanner arr = new Scanner(System.in);
        String s = arr.nextLine();
        String p = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >='a' && s.charAt(i) <= 'z') {
                if (i == 0 || s.charAt(i - 1) ==' ') {
                    p += (char) (s.charAt(i) - 32);
                } else {
                    p+=s.charAt(i);
                }
            } else {
                p+=s.charAt(i);
            }
        }
        System.out.println(p);
    }
}


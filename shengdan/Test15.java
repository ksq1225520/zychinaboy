package com.ksq.shengdan;
import java.util.*;
import java.util.Scanner;
public class Test15 {
    public static void main(String[] args) {
        System.out.println("请输入第一个数");
        Scanner sc=new Scanner(System.in);
        int g= sc.nextInt();
        System.out.println("请输入第二个数");
        Scanner sn=new Scanner(System.in);
        int p= sn.nextInt();
        System.out.println("请输入第三个数");
        Scanner sm=new Scanner(System.in);
        int o= sm.nextInt();
        test227(g,p,o);
    }
    public static void test227(int n, int s, int d) {
        List<String> list=new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add("犯人"+i);
        }
        int now=s-1;
        System.out.println(list);
        while(list.size()>1){
            now=(now+d-1)%list.size();
            list.remove(now);
            System.out.println(list);
        }
        System.out.println("活下来的是 "+list.get(0));
    }
}

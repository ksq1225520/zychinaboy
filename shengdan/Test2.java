package com.ksq.shengdan;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("请输入五个数");
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int start=0,end= arr.length-1;start<=end;end++,start--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        arrlist(arr);
    }
    public static void arrlist(int[] arr){
        for(int i=0;i<arr.length;){
            if(i==arr.length-1){
                System.out.println(arr[i]);
            }else {
                System.out.println(arr[i]+",");
            }
        }
    }
}

package com.ksq.shengdan;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("请输入六个分数");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max=getMax(arr);
        int min=getMin(arr);
        int sum=getSum(arr);
        int aver=(sum-max-min)/4;
        System.out.println("平均分为："+aver);
    }

    public static int getMax(int[] arr){
        int max=arr[0];
        for(int x=1;x< arr.length;x++){
            if(arr[x]>arr[0]){
                max=arr[x];
            }
        }
        return max;
    }
    public static int getMin(int[] arr){
        int min=arr[0];
        for(int x=1;x< arr.length;x++){
            if(arr[x]<arr[0]){
                min=arr[x];
            }
        }
        return min;
    }
    public static int getSum(int[] arr){
        int sum=0;
        for(int y=0;y<arr.length;y++){
            sum+=arr[y];
        }
        return sum;
    }

}

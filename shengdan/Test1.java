package com.ksq.shengdan;

public class Test1 {
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        int[] arr2={2,1,4,5,3};
        for(int x=0;x< arr1.length;x++){
            for(int y=0;y< arr2.length;y++){
                if (arr1[x] == arr2[y]){
                    System.out.println("相同");
                }else{
                    System.out.println("不相同");
                }
            }
        }
    }
}

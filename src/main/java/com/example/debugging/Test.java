package com.example.debugging;

public class Test {
    public static void main(String[]args){
        System.out.println("debugging java application");

        int myarr[]={2,3,5,6};

        int sum =getSum(myarr);

        System.out.println("sum=" + sum);

    }
    public static int getSum(int arr[]){
        int  s =0;
        for (int i=0; i<arr.length;i++) {
            s = s + arr[i];
        }

        s=s+10;

    return s;
    }
}

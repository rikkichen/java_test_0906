package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("java_0906_1");
        int n;
       Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int j,sum=0;
        for(j=0;j<=n;j++)
            sum+=j;
        System.out.println("sum="+sum);
        System.out.println(1);

    }
}

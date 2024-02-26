package com.ohggiraffers.section4.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // 숫자를 하나 입력받고 그 수가 몇자리수인지 출력하는 알고리즘 짜기

        Scanner sc = new Scanner(System.in);
        String x = sc.next(); // "1000"
        int y = Integer.parseInt(x); // 1000
        y++;
        int length =0;
        /*
        while(x > 0){
            x /= 10; // x = 0
            length++; // 4
        }*/

        System.out.println(x.length());
        System.out.println(y);
    }
}

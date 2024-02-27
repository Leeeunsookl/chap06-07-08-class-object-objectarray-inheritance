package com.ohgiraffers.section02.userexception;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. 사용자 정의의 예외클래스를 정의 후 발생한 사용자 정의의 예외를 처리할 수 있다. */

        /* 필기.
        *   사전에 정의된 예외 클래스 외에 개발자(여러분)가 원하는 명칭의 예외 클래스를 작성하는 것이
        *   가능하다.
        *   extends Exception */



        ExceptionTest et = new ExceptionTest();
        try {
//            et.checkEnoughMoney(-50000,50000);        //상품의 가격을 음수로 입력한 경우
//            et.checkEnoughMoney(50000,-10000);      //가진 돈을 음수로 입력한 경우
//            et.checkEnoughMoney(50000,10000);       //가진 돈이 상품의 가격보다 적을 때
            et.checkEnoughMoney(10000,50000);       //정상적으로 구매가 가능한 경우

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

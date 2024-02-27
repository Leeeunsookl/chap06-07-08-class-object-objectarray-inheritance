package com.ohgiraffers.section01.exception;

public class Application03 {

    public static void main(String[] args) {

        /* 목차. 3. try-catch를 이용한 방법(예외 발생) */

        /* 상품가격 50000원, 가지고 있는 돈 10000원 */
        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnoughMoney(50000,10000);
            System.out.println("==========상품 구입 가능===========");
        } catch (Exception e) {
            System.out.println("==========상품 구입 불가능==========");

        }
        System.out.println("프로그램이 종료됩니다.");
        //try에서 어? 에러가 났네 -> catch에서 잡아채고 프로그램 종료
    }

}

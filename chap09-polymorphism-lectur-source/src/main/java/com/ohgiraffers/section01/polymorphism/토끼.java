package com.ohgiraffers.section01.polymorphism;

public class 토끼 extends 동물 {

    @Override
    public void 먹기(){
        System.out.println("토끼가 먹이를 먹습니다. ");
    }

    @Override
    public void 달리기(){
        System.out.println("토끼가 달리기 시작합니다. ");
    }
    @Override
    public void 울기(){
        System.out.println("토끼가 울기 시작합니다. ");
    }

    public void 점프(){
        System.out.println("토끼가 뛰기 시작합니다. ");
    }


}

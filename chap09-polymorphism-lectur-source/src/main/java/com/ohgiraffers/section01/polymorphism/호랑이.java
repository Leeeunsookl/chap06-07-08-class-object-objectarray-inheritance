package com.ohgiraffers.section01.polymorphism;

public class 호랑이 extends 동물 {
    @Override
    public void 먹기(){
        System.out.println("호랑이가 먹이를 먹습니다. ");
    }
    @Override
    public void 달리기(){
        System.out.println("호랑이가 달리기 시작합니다. ");
    }
    @Override
    public void 울기(){
        System.out.println("호랑이가 울기 시작합니다. ");
    }

    public void 물어뜯기(){
        System.out.println("호랑이가 물어뜯기 시작합니다. ");
    }

}

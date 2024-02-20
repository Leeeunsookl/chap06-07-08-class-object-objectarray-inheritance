package com.ohgiraffers.section06.statickeyword;

public class StaticMethodTest {

    private int count;

    public void nonStaticMethod(){

        this.count++;
        System.out.println("nonStaticMethod 호출됨");
    }

    public static void staticMethod(){

//        this.count++; (static은 인스턴스 생성 x 그래서 this의 주소가 없는것!)
//                       인스턴스를 생성하지 않고 사용하는 메소드이기 때문에 this에는 주소가 들어갈 수 없다.
        System.out.println("staticMethod 호출됨...");

    }

}

package com.ohgiraffers.section03.interfaceimplements;

public interface InterProduct {

    /* 필기.
    *   인터페이스가 인터페이스를 상속 받을 시에는 extends 키워드를
    *   이용한다.
    *   여러 인터페이스를 다중 상속 받을 수 있다.
    *  */

    /* 필기.
    *   인터페이스는 상수 필드만 작성이 가능하다.
    *   public static final <-- 이것을 상수필드라고 부른다.
    *   반드시 선언과 동시에 초기화를 해줘야 한다.
    *  */

    //필기. 상수필드만 가질 수 있기 때문에 모든 필드는 묵시적으로 public static final이다.
    public static final int MAX_NUM=100;
    int MIN_NUM=10;

    //필기. 인터페이스는 생성자를 가질 수 없다. (추상클래스는 가질 수 있던 반면에)
//    public InterProduct(){} <-- 오류나버림

    /* 필기. 인터페이스는 구현부가 있는 non-static 메소드를 가질 수 없다. */
//    public void nonStaticMethod(){}  <__구현부{} x

    /* 필기. 추상 메소드만 작성이 가능하다. */
    public abstract void nonStaticMethod();         //abstract 어차피 디폴트값임 묵시적 생략

    /* 필기.
    *   인터페이스 안에 작성한 메소드는 묵시적으로 public abstract의 의미를 가진다.
    *   (다른 접근제한자 사용 불가)
    *   따라서 인터페이스의 메소드를 오버라이딩 하는 경우
    *   반드시 접근제한자를 public으로 해야 오버라이딩이 가능하다.
    *  */
    void absMethod();

    /* 필기. 하지만 static 메소드는 작성이 가능하다. */
    public static void staticMethod(){
        System.out.println("InterProduct 클래스의 staticMethod 호출됨...");
    }         //몸통이 있는데도!!! static은 시작하자마자 작동하니까
}

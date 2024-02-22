package com.ohjgiraffers.section01.object.run;

import com.ohjgiraffers.section01.object.book.Book;

public class Application03 {

    public static void main(String[] args) {

        /* 수업목표. Object 클래스의 hashcode() 메소드 오버라이딩 목적을 이해하고 활용할 수 있다. */

        /* 필기.
        *   Object 클래스의 명시에 작성된 규약에 따르면
        *   equals() 메소드를 재정의하는 경우 반드시 hashcod()를 재정의하게 되어 있다.
        *   만약 재정의하지 않으면, 같은 값을 가지는 동등 객체는 같은 해시코드를 가져야 한다는 규약에 위반
        *  */

        Book book1 = new Book(1,"홍길동전","허균",50000);
        Book book2 = new Book(1,"홍길동전","허균",50000);

        System.out.println("book1 해쉬코드 : " + book1.hashCode());
        System.out.println("book2 해쉬코드 : " + book2.hashCode());
        //Book 클래스에서 해쉬코드를 equals 로 만들어서 동일하게 나온거

    }

}



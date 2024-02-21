package com.ohgiraffers.section01.init;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 객체 배열에 대해 이해 */
        /* 필기.
        *   객체배열은 레퍼런서 변수에 대한 배열이다.
        *   생성한 인스턴스도 배열을 이용해서 관리하면
        *   동일한 타입의 여러개 인스턴스를 각각 취급하지 않고 연속 처리할 수 있어서 유용하다.
        *   또한 반환값(return)은 1개의 값만 반환할 수 있기 때문에
        *   동일한 타입의 여러 인스턴스를 반환해야 하는 경우 객체 배열을 이용할 수 있다.
        *  */

        Car car1=new Car("페라리",300);
        Car car2=new Car("소나타",200);
        Car car3=new Car("부가티",400);
        Car car4=new Car("그랜져",200);
        Car car5=new Car("모닝",500);

        car1. driveMaxSpeed();
        car2. driveMaxSpeed();
        car3. driveMaxSpeed();
        car4. driveMaxSpeed();
        car5. driveMaxSpeed();

        System.out.println("=====================================");

        Car[] carArray= new Car[5];

        carArray[0] = new Car("페라리",300);
        carArray[1] = new Car("소나타",200);
        carArray[2] = new Car("부가티",400);
        carArray[3] = new Car("그랜져",200);
        carArray[4] = new Car("모닝",500);
//        carArray[5] = new Car("모닝",800);

        for(int i = 0; i < carArray.length; i++){
            carArray[i].driveMaxSpeed();
        }

        /* 필기. 객체배열도 할당과 동시에 초기화 할 수 있다. */
        Car[]carArray2 = {
                new Car("페라리",300)
                ,new Car("소나타",200)
                ,new Car("부가티",400)
                ,new Car("그랜져",200)
                ,new Car("모닝",300)

        };

        //향상된 for문도 사용이 가능하다.
        for(Car c:carArray2){
            c.driveMaxSpeed();
        }

    }

}

package com.ohgiraffers.section02.extend;

public class WildCardFarm {

    /* 필기. 매개변수로 받는 토끼농장을 구현할 때, 어던 토끼든 상관 없다.
    *   ?로 어떤 애가 와도 된다고 말한거*/
    public void anyType(RabbitFarm<?> farm){

        farm.getAnimal().cry();
    }


    /* 필기. 토끼농장의 토끼는 Bunny이거나 그의 후손들만 가능하다. */
    public void extendType(RabbitFarm<? extends Bunny > farm){

        farm.getAnimal().cry();
    }

    /* 필기. 토끼농장의 토끼는 Bunny거나 그 부모타입으로 만들어진 토끼만 매개변수로 사용 */
    public void superType(RabbitFarm<? super Bunny> farm){

        farm.getAnimal().cry();
    }

}

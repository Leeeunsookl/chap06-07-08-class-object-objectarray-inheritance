package com.ohgiraffers.section02.overriding;

public class Subclass extends Superclass {

    /* 목차. 1. 메소드의 이름 변경 */
//    @Override
//    public void method2(int num){}        //이름이 달라서 안됨 method mothod2
    /* 목차. 2. 메소드의 리턴타입 변경하면 에러 발생 */
//    @Override
//    public int method(int num){return 0;}     //메소드 시그니쳐는 같지만 avoid return 차이로 안됨
    /* 목차. 3. 매개변수 갯수나, 타입이 변경되면 에러 발생 */
//    @Override
//    public void method(String num){}      //매개변수의 타입이 바뀌어도 에러가 발생
    /* 목차. 4. 메소드 이름, 리턴타입, 매개변수 갯수, 타입, 순서 일치의 경우 성립  */
    @Override
    public void method(int num){}
    /* 목차. 5. private 메소드는 오버라이딩 불가 */
//    @Override
//    private void privateMethod(){}        //부모 private라 인식 불가함
    /* 목차. 6. final 키워드 메소드 오버라이딩 불가 */
//    @Override
//    public final void finalMethod(){}       //final자체가 마지막이기 때문에 변경 불가함
    /* 목차. 7. 부모 메소드의 접근제한자와 같거나 더 넓은 범위로 오버라이딩 가능 */
//    @Override
//    void protectedMethod(){}      //default 더 좁은 범위는 불가
//    @Override
//    protected void protectedMethod(){}      //같은 범위는 가능
    @Override
    public void protectedMethod(){}     //더 넓은 범위 가능

    //결국 축소만 불가, 확장은 가능
}

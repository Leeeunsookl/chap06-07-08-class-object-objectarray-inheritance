package com.ohgiraffers.section03.superkeyword;

import java.util.Date;

public class Computer extends Product {

    //컴퓨터는 하나의 제품이지만, 모든 제품이 컴퓨터는 아니다. (IS-A)

    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;


    public Computer() {
        System.out.println("Computer 기본 생성자 호출함...");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {

        //부모의 기본생성자 호출
//        super() : 부모 생성자를 호출하는 구문으로 인자와 매개변수의 타입, 갯수, 순서가
//                일치하는 부모의 생성자를 호출하게 된다. this()가 해당 클래스 내의
//                다른 생성자를 호출하는 구문이라면, super()는 부모클래스가 가지는
//                private 생성자를 제외한 나머지 생성자를 호출할 수 있다.
        super();

        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        System.out.println("Computer 클래스의 모든 필드를 초기화 하는 생성자 호출함...");
    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate,
                    String cpu, int hdd, int ram, String operationSystem) {
        //부모의 모든 필드를 초기화하는 생성자로 Product 클래스가 가진 필드를 초기화한 값 전달.
        super(code, brand, name, price, manufacturingDate);

        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        System.out.println("Computer 클래스의 부모필드도 같이 초기화 하는 생성자 호출함...");
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String getInfo() {
        return super.getInfo()
                + "Computer["
                + "cpu=" + this.cpu
                + ", hdd=" + this.hdd
                + ", ram=" + this.ram
                + ", operationSystem=" + this.operationSystem
                + "]";

    }
}

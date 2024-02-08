package com.ohgiraffers.section2.abstractclass;

public class SmartPhone extends Product {

// extends 키워드는 단일 상속

    public SmartPhone() {}

    @Override
    public void abstractMethod() {
        System.out.println("Product 클래스의 abstractMethod를 오버라이딩 한 메소드 호출함..");
    }

    public void printSmartPhone() {
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출함...");
    }


}

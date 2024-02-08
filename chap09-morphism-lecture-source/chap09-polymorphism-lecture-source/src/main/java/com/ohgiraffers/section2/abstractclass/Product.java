package com.ohgiraffers.section2.abstractclass;

public abstract class Product {



        private int nonStaticField; // 추상클래스도 필드를 가질 수 있다.
        private static int staticField;
        public Product() {}

        public void nonStaticField() {
            System.out.println("Product 클래스의 nonStaticMethod 호출함...");
        }

        public static void staticMethod() {
            System.out.println("Product 클래스의 staticMethod 호출함...");
        }

        public abstract void abstractMethod();









}

package com.ohgiraffer.section08.initblock;

public class Product {

    private String name = "갤럭시";
    private int price = 1000000;
    private static String brand = "삼송";

    {
    name = "사이엔";
    price = 900000;
    brand = "사과";
    System.out.println("인스턴스 초기화 블럭 동작함...");

    }

    static  {
//        name = "아이퐁";
//        price = 90000;
        brand = "헬지";  // static이 붙은 키워드만 사용할 수 있다.
        System.out.println("정적 초기화 블럭 동작함...");
    }

    public Product() {

        System.out.println("기본 생성자 호출됨..");
    }
    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 있는 생성자 호출됨...");


    }

    public String getInformation() {
        return "Product [name=" + this.name + ", price=" + this.price + ", brand=" + Product.brand + "]";


    }

}

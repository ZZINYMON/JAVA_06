package com.ohgiraffer.section06.statickeyword;

public class StaticMethodTest {

    private int count;

    public void nonStaticMethod() {
        this.count++;

        System.out.println("nonStaticMethod 호출됨...");

    }

    public static void staticMethod() {    // this는 주소를 넣어주기 위한 변수인데 인스턴스가 생성되지 않고 this에도 주소값이 생성되지 않기 때문에 static에서는 this 사용 x

        // this.count++;

        System.out.println("staticMethod 호출됨..");
    }



}

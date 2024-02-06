package com.ohgiraffer.section05.parameter;

import org.w3c.dom.ls.LSOutput;

public class ParameterTest {

    public void testPrimaryTypeParameter(int num) {

        System.out.println("매개변수로 전달받은 값 : " + num);

    }

    public void testPrimaryTypeArrayParameter(int[] iarr) {

        System.out.println("매개변수로 전달받은 값 : " + iarr);

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i] + " ");

        }
        System.out.println();

        iarr[0] = 99;

        System.out.println("변경 후 배열의 값 출력 : ");
        for (int i = 0; 1 < iarr.length; i++) {
        System.out.println(iarr[i] + " ");
    }
        System.out.println();
    }

    public void testClassTypeParameter(RectAngle rectAngle) {
        System.out.println("매개변수로 전달되는 값 : " + rectAngle);

        System.out.println("변경 전 사각형의 넓이와 둘레 ===========");
        rectAngle.calcArea();
        rectAngle.calcRound();

        rectAngle.setWidth(100);
        rectAngle.setHeight(100);

        System.out.println("변경 후 사각형의 넓이와 둘레 ===========");
        rectAngle.calcArea();
        rectAngle.calcRound();
    }

    public void testVariableLengthArrayParameter(String name, String...hobby) {

        System.out.println("이름 : " + name);
        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.println("취미 : ");
        for(int i =0; i < hobby.length;i++) {
            System.out.println(hobby[i] + " ");
        }
        System.out.println();

    }

//    ... => 가변인자





}

package com.ohgiraffer.section06.statickeyword;

public class StaticFieldTest {

    private int nonStaticCount;
    private static int staticCount; // static은 자료형 앞에 붙혀준다.
    public StaticFieldTest() {}

    public int getNonStaticCount() {
        return this.nonStaticCount;
    }

    public int getStaticCount() {

        /* static 필드에 접근하기 위해서는 클래스명, 필드명 으로 접근한다. */
       return StaticFieldTest.staticCount;
    }

    /* 호출 할 때마다 두 필드 값을 1씩 증가시키기 위한 용도의 메소드 생성 */
    public void increaseNonStaticCount() {
        this.nonStaticCount++;
    }

    public void increaseStaticCount() {
        StaticFieldTest.staticCount++;
    }




}

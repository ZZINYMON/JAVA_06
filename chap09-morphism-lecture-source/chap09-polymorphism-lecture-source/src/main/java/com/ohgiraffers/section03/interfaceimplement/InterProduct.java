package com.ohgiraffers.section03.interfaceimplement;

public interface InterProduct {

    /* 필기.
    * 인터페이스가 인터페이스를 상속받을 시에는 extends 키워드를 이용하여
    * 이 때는 여러 인터페이스를 다중 상속 받을 수 있다.
    *
    * */

    /* 인터페이스는 상수 필드만 작성 가능하다.
    * public static final 제어자 조합을 상수 필드라고 부른다.
    * 반드시 선언과 동시에 초기화를 해줘야 한다.
    *
     */

    public static final int MAX_NUM = 100;  // 선언과 동시에 초기화

    /* 상수 필드만을 가질수 있기 때문에 모든 필드는 묵시적으로 public static final 이다 */
    int MIN_NUM = 10; // 앞에 public static final 이 생략되어 있음. */

    /* 인터페이스는 생성자를 가질 수 없다. */
//    public InterProduct() {}

   /* 인터페이스는 구현부가 있는 non-static 메소드를 가질 수 없다. */
   public void nonStaticMethod() {}

    /* 추상 메소드만 작성이 가능하다. */
    public abstract void nonStaticMethod();


    /* 인터페이스 안에 작성한 메소드는 묵시적으로 public abstract 의 의미를 가진다. (다른 접근제한자 사용 불가)
    * void abstMethod();
    * 반드시 접근자를 public으로 해야 오버라이딩이 가능하다.
    *  */

    void abstMethod();

    /* 구현부가 있는 staticMethod
    * static 메소드는 작성이 가능하다. (JDK 1.8 추가된 기능) */

    public static void stsaticMethod() {
        System.out.println("InterProduct 클래스 staticMethod 호출됨...");
    }

    public default void defaultMethod() {
        System.out.println("InterProduct 클래스의 defaultMethod 호출됨...");
    }

}

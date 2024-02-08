package com.ohgiraffers.section1.polymorphism;

public class Application1 {

    public static void main(String[] args) {

         /* 수업목표. 다형성과 타입 형변환에 대해 이해할 수 있다. */
         /* 필기.
         * 다형성이란 하나의 인스턴스가 여러 가지 타입을 가질 수 있는 것을 의미한다.
         * 그렇기 때문에 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있기도 하고,
         * 하나의 메소드 호출로 객체별로 각기 다른 방법으로 동작하게 할 수 있다.
         *
         * 다형성은 객체지향 프로그래밍의 3대 특징 (캡슐화, 상속, 다형성) 중 하나이며,
         * 객체지향 프로그래밍의 꽃이라고 불리울 정도로 활용성이 높고 장점이 많다.
         * 하지만 학습하기 어렵다는 단점을 가지고 있다.
         *
         * 다형성 장점
         * 1.여러 타입의 객체를 하나의 타입으로 관리할 수 있기 때문에 유지보수성과 생산성이 증가된다.
         * 2. 상속을 기반으로 한 기술이기 때문에 상속관계에 있는 모든 객체는 동일한 메세지를 수신할 수 있다.
         *    이런 동일한 메세지를 수신받아 처리하는 내용을 객체별로 다르게 할 수 있다는 장점을 가지고 있다.
         *    (다양한 기능을 사용하는데 있어서 관리해야 할 메세지 종류가 줄어들게 된다.)
         *    하나의 호출로 여러 가지 동작을 수행할 수 있다는 측면에서 오버로딩을 다형성으로 보기도 한다.
         *    다형성을 이해하기 쉬운 가장 좋은 예 이기도 하다.
         *    하지만 이 부분은 이견이 많이 존재하기 때문에 다형성을 이해하는데 참고로만 활용하자.
         * 3. 확장성이 좋은 코드를 작성할 수 있다.
         * 4. 결합도를 낮춰서 유지보수성을 증가시킬 수 있다.
         * */

        System.out.println("======= Animal 생성 =======");
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println("======= Rabbit 생성 =======");
        Rabbit rabbit =new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        System.out.println("======= tiger 생성 =======");
        Tiger tiger =new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        Animal a1 = new Rabbit();
        Animal a2 = new Tiger();

//        Rabbit r = new Animal();
//        Tiger t = new Animal();

       /* 동적바인딩
       * 컴파일 당시에는 해당 타입의 메소드와 연결되어 있다가,
       * 런타임 당시 실제 객체가 가진 오버라이딩된 메소드로 바인딩이 바뀌어 동작하는 것을 의미한다.
        */

        System.out.println();
        a1.cry();
        a2.cry();

//        a1.jump();
//        a2.bite();

        System.out.println();
        ((Rabbit)a1).jump();
        ((Tiger)a2).bite();

//        ((Tiger a1)).bite();  // 클래스 형변환을 잘못했음. a1 = rabbit

        /* instanceof 연산자 사용 확인 */
        System.out.println("========instanceof 확인=======");
        System.out.println("a1이 Tiger 타입인지 확인 : " + (a1 instanceof Tiger));
        System.out.println("a1이 Rabbit 타입인지 확인 : " + (a1 instanceof Rabbit));
        System.out.println("a1이 Animal 타입인지 확인 : " + (a1 instanceof Animal));
        System.out.println("a1이 Object 타입인지 확인 : " + a1 instanceof Object);  //모든 클래스는 Object의 후손이다. 그래서 토끼도 호랑이도 동물도 true가 나온다.

        if (a1 instanceof Rabbit) {
            ((Rabbit) a1).jump();
        }

        if (a1 instanceof Tiger)

        if (a2 instanceof Tiger) {
            ((Tiger) a2).bite();
        }

        /* 클래스 형변환은 up-casting과 down-casting으로 구분할 수 있다.
        * up-casting : 상위 타입으로 형변환
        * down-casting : 하위 타입으로 형변환
        * 또한 작성 여부에 따라 명시적과 묵시적 두 가지로 구분된다.
        * */

        Animal animal1 = (Animal) new Rabbit(); // up-casting 상위타입으로 형변환으로 한 것이고, 명시적
        Animal animal2 = new Rabbit();          // up-casting 묵시적




        /*
        *
        * */








    }

}
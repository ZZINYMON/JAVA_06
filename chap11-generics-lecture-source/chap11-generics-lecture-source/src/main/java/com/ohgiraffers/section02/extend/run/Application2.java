package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application2 {

    public static void main(String[] args) {

        /* 와일드 카드에 대해 이해할 수 있다. */
        /* 필기.
        * 와일드카드(wildCard)
        * 제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때,
        * 그 객체의 타입 변수를 제한할 수 있다.
        * <?> : 제한 없음.
        * <? extend Type> : 와일드카드의 상한 제한(Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 사용 가능)
        * <? super Type> : 와일드카드의 하한 제한(Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용 가능)
        *  */

        WildCardFarm wildCardFarm = new WildCardFarm();

//        wildCardFarm.anyType(new RabbitFarm<Mammal>(new Mammal()));  //Mammal, Snake은 RabbitFarm에 포함되지 않는 애라서 매개변수로 사용할 수 x
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

//        wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));  // extend 사용 >> 상한
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));  // super 사용 >> 하한
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));  // 바니의 하위 타입이어서 매개변수로 x


    }

}

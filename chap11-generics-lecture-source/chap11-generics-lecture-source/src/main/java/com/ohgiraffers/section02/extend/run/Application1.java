package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. extend 키워드를 이용하여 특정 타입만 사용하도록 제네릭 범위를 제한할 수 있다. */

//        RabbitFarm<Animal> farm0 = new RabbitFarm<Animal>();  // 토끼나 토끼팜만 되도록 해서
//        RabbitFarm<Mammal> farm1 = new RabbitFarm<>();
//        RabbitFarm<Snake> farm2 = new RabbitFarm<>();
        RabbitFarm<Rabbit> farm3 = new RabbitFarm<>();  // 토끼타입이나 토끼후손 타입만 가능하도록 걸어놨기 때문에
        RabbitFarm<Bunny> farm4 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm5 = new RabbitFarm<>();

//        farm2.setAnimal(new Snake());

//        farm3.setAnimal(new Rabbit());
        ((Rabbit) farm3.getAnimal()).cry();  // setter나 getter를 쓸 때에도 타입에 맞는 애를 써야함.

        farm4.setAnimal(new Bunny());
        ((Bunny) farm4.getAnimal()).cry();
        farm4.getAnimal().cry();

        farm5.setAnimal(new DrunkenBunny());
        ((DrunkenBunny) farm5.getAnimal()).cry();
        farm5.getAnimal().cry();






    }

}

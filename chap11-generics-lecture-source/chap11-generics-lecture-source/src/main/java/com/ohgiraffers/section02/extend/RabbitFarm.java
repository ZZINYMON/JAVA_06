package com.ohgiraffers.section02.extend;

public class RabbitFarm <T extends Rabbit>{   // interface 시에도 implement 아닌 extend 사용!


//    두 개를 상속받고 싶을 때는 &

    private T animal;

    public RabbitFarm() {}

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
    return this.animal;
}

}

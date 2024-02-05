package com.ogiraffers.section02.encapsulation.problem1;

public class Monster {

    // 1. 필드로 몬스터 이름과 체력을 저장할 공간을 선언한다. (필드 : 여기서 name, hp)
//    String name;
//    int hp;


    // 2. setHP를 이용해 필드에 간접 접근하기
    String name;
    int hp;

    public void setHP(int hp) {

        if(hp > 0) {
            System.out.println("양수값이 입력되어 몬스터의 체력을 입력한 값으로 변경합니다.");
            this.hp = hp;     // public ~ int hp<-의 hp랑 this hp 의 hp가 같다고 해주고 간접적으로 접근을 해서 값 출력
                              // this는 자기 자신의 주소
        } else {
            System.out.println("0보다 작거나 같은 값이 입력되어 몬스터의 체력을 0으로 변경합니다.");
            this.hp = 0;

        }

    }

}

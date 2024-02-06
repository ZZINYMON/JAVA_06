package com.ohgiraffer.section06.singleton;

public class EagerSingleton {

    private static EagerSingleton eager = new EagerSingleton();  // 선언과 객체(new EagerSingleTon)만들기 같이 하긩

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return eager;
    }






}

package com.ohgiraffers.section01.array;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 배열? & 배열의 사용목적 */
        /* 필기.
        * 배열이란?
        * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도) 이다.
        * 배열은 heap 영역에 new 연산자를 이용하여 할당한다. */

        /* 배열의 선언 및 할당 */
        int[] arr = new int[5]; // 정수형 변수 묶음을 만들겠다. (연속된 메모리 공간_5칸 짜리 만들겠다.)

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for(int i = 0, value = 0; i < arr.length; i++) {
            // index 넘버는 만들어진 메모리 공간 -1 이니까 ex. Int[] arr = new int[5] 일 경우 index 넘버는 0, 1, 2, 3,4
            // 이므로 조건식에서 i < arr.length 이다. 만약에 <= 해버리면 메모리공간의 갯수 만큼 index 넘버가 부여되니(5개) 부등호는 <
            // value = 0을 해주는 이유 : 초기화 해주는 과정이고, 초기화를 해줘야 하는 변수들이 여러개니까(변수들의 묶음인 배열)

            arr[i] = value += 10;


        }

    }

}

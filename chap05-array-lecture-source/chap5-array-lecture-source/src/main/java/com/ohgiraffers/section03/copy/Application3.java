package com.ohgiraffers.section03.copy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. 깊은 복사에 대해 이해할 수 있다. */
        /* 필기.
        * 깊은 복사는 heap에 생성된 배열이 가지고 있는 값을
        * 또 다른 배열에 복사를 해 놓은 것이다.
        * 서로 같은 값을 가지고 있지만, 두 배열은 서로 다른 배열이기에
        * 하나의 배열에 변경을 하더라도 다른 배열에는 영향을 주지 않는다.
        *
         */

        /* 깊은 복사를  하는 방법
        * 1. for문을 이용한 동일한 인덱스의 값 복사
        * 2. Object의 clone()을 이용한 복사
        * 3. System의 arraycopy()를 이용한 복사
        * 4. Arrarys의 copyOf()를 이용한 복사
        * 이 중 가장 높은 비율로 순수 배열의 복사를 위해 만들어진 arraycopu() 메소드이고
        * 가장 많이 사용되는 방식은 좀 더 유연한 방식인 copyOf() 메소드이다.
        * clone()은 이전 배열과 같은 배열밖에 만들 수 없다는 특징을 가지고
        * 그 외 3가지 방법은 복사하는 배열의 길이를 마음대로 조정할 수 있다는 특징을 가지고 있다.
        *  */

        int[] originArr = new int[] {1, 2, 3, 4, 5};    // 초기화의 의미 : 값을 넣어줬다.


        print(originArr);

        /* for문을 이용한 동일한 인덱스의 값 복사 */
        int[] copyArr1 = new int[10];

        for (int i = 0; i < originArr.length; i++) {
            copyArr1[i] = originArr[i];

        }

        print(copyArr1);

        /* Object의 clone()을 이용한 복사 */
        int[] copyArr2 = originArr.clone();

        print(copyArr2);    // 동일한 길이, 동일한 값을 가지는 배열이 생성되어 복사되며, 다른 주소를 가지고 있다.

        /* System의 arrarycopy()를 이용한 복사 */
        int[] copyArr3 = new int[10];

        System.out.println(originArr, 0, copyArr3, 3, originArr.length);

        print(copyArr3);

        /* Arrarys의 copuOf()를 이용한 복사 */  // 시작위치부터 원하는 위치까지 배열을 만들 수 있다.
        int[] copyArr4 = Arrays.copyOf(originArr, 7);   // import 해줘야한다..???????

        print(copyArr4);

    }

    public static void print(int[] iarr) {

        System.out.println("iarr의 hashcode : " + iarr.hashCode());

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i] + " ");
        }
        System.out.println();

    }



}







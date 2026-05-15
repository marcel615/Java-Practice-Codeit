package oop.stream.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        List<String> nick = new ArrayList<>();

        /*
        Collections.addAll: 이미 만들어진 컬렉션에 여러 요소를 추가하는 메서드

        Arrays.asList: add, remove 불가. set()으로 요소 변경은 가능. null 요소 허용
        List.of: add, remove, set 불가. null 요소 불허. (java 9버전)
         */

        List<Integer> score = new ArrayList<>();

        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> integerList2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collections.addAll(score, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);





    }
}

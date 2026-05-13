package oop.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static oop.stream.Menu.*;

public class Mapping {
    public static void main(String[] args) {

        // map : 리스트에서 원하는 데이터만 추출
        // original : [ {}, {}, {}, {}, {} ]
        // filter   : [ {}, {}, {} ]
        // map      : [ "", "", "", "", "" ]

        //요리 이름만 출력
        List<String> collect = MENU_LIST.stream()
                .map(dish -> dish.getName())
                // toList(): 자바 16부터 쓸 수 있음. 불변 리스트 -> 수정 안됨!
                // collect(Collectors.toList()): 자바 8부터 존재하던 방식 -> 수정 자유로움
                .collect(Collectors.toList());
        collect.add("dd");
        collect.forEach(System.out::println);

        System.out.println("=========================\n");

        List<String> browsers = List.of("safari", "chrome", "ms edge", "firefox", "opera");

        // 문자열의 길이만 추출
        List<Integer> list = browsers.stream()
                .map(b -> b.length())
                .toList();
        System.out.println(list);

        System.out.println("=========================\n");

        List<Character> list2 = browsers.stream()
                .map(b -> b.toUpperCase().charAt(0))
                .toList();
        System.out.println(list2);

        System.out.println("=========================\n");

        List<SimpleDish> simpleDishes = MENU_LIST.stream()
                .map(SimpleDish::new)
                .toList();
        simpleDishes.forEach(System.out::println);

        System.out.println("=========================\n");

        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요. -> DishDetail이라는 객체로 맵핑
            단, 타입은 MEAT의 경우 육류라고 저장
            FISH는 어류라고 저장, OTHER는 기타라고 저장
         */
        List<DishDetail> dishDetails = MENU_LIST.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(dish -> new DishDetail(dish))
                .toList();
        System.out.println(dishDetails);

        System.out.println("=========================\n");

        Map<String, String> map = MENU_LIST.stream()
                .filter(dish -> dish.getCalories() > 500)
                .collect(Collectors.toMap(dish -> dish.getName(), dish -> dish.getType().getDesc()));
        System.out.println(map);

        System.out.println("=========================\n");

        //메뉴 목록에 있는 요리들의 총 칼로리 구하기
        int sum = MENU_LIST.stream()
                .mapToInt(dish -> dish.getCalories())
                .sum();
        System.out.println(sum);

        System.out.println("=========================\n");

        // 육류 메뉴의 평균 칼로리 구하기
        double asDouble = MENU_LIST.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT)
                .mapToInt(dish -> dish.getCalories())
                .average()
                .getAsDouble();
        System.out.println(asDouble);

        System.out.println("=========================\n");
        // 모든 요리 이름에 포함된 알파벳을 중복 없이 추출.
        // flatMap: map처럼 변환을 하긴 하는데, 그 결과는 반드시 stream 이어야 한다.
        // 여러개의 스트림을 단일 스트림으로 합쳐줍니다.
        List<String> list1 = MENU_LIST.stream()
                .map(dish -> dish.getName().split(""))
                .flatMap(arr -> Arrays.stream(arr))
                .filter(s -> !s.isBlank())
                .distinct()
                .toList();
        System.out.println(list1);


    }
}

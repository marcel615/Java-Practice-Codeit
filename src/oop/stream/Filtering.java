package oop.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static oop.stream.Menu.*;

public class Filtering {
    public static void main(String[] args) {

        // 요리 메뉴 중, 채식주의자가 먹을 수 있는 요리만 필터링
        Stream<Dish> stream = MENU_LIST.stream();
        Stream<Dish> dishStream = stream.filter(dish -> dish.isVegetarian());
        List<Dish> dishList = dishStream.toList();
        for (Dish dish : dishList) {
            System.out.println(dish);
        }

        System.out.println("=========================\n");

        MENU_LIST.stream()
                .filter(dish -> dish.isVegetarian())
                .toList()
                .forEach(dish -> System.out.println(dish));

        System.out.println("=========================\n");

        MENU_LIST.stream()
                .filter(Dish::isVegetarian)
                .toList()
                .forEach(System.out::println);

        System.out.println("=========================\n");

        // 메뉴 목록중에 육류이면서 600칼로리 미만인 요리를 필터링해서 출력
        MENU_LIST.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT && dish.getCalories() < 600)
                .toList()
                .forEach(System.out::println);

        System.out.println("=========================\n");

        // 메뉴 목록에서 요리 이름이 4글자인 것만 필터링 해서 출력해줘
        MENU_LIST.stream()
                .filter(dish -> dish.getName().length() == 4)
                .toList()
                .forEach(System.out::println);

        System.out.println("=========================\n");

        // 칼로리가 300칼로리보다 큰 요리 중에 앞에 3개만 가져와
        MENU_LIST.stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3)
                .toList()
                .forEach(System.out::println);

        System.out.println("=========================\n");

        // 칼로리가 300칼로리보다 큰 요리 중에 처음 2개 이후 것들 가져와
        MENU_LIST.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2)
                .toList()
                .forEach(System.out::println);

        System.out.println("=========================\n");

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 4, 8, 6, 10);

        //리스트에서 짝수만 필터링 (중복은 제거해서)
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .distinct()
                .forEach(System.out::println);
    }
}

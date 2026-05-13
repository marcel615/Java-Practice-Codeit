package oop.stream;

import java.util.Comparator;

import static oop.stream.Menu.*;

public class Sorting {
    public static void main(String[] args) {

        MENU_LIST.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT)
                .sorted(Comparator.comparing(dish -> dish.getCalories()))
                .forEach(System.out::println);
        System.out.println("=========================\n");

        MENU_LIST.stream()
                .sorted(Comparator.comparing(Dish::getName).reversed())
                .forEach(System.out::println);


        System.out.println("=========================\n");
        // 300칼로리 이상인 요리 중, 칼로리가 낮은 탑3 요리를 필터링
        MENU_LIST.stream()
                .filter(dish -> dish.getCalories() >= 300)
                //칼로리 오름차순, 칼로리가 같다면 이름 오른차순
                .sorted(Comparator.comparing(Dish::getCalories).thenComparing(Dish::getName, Comparator.reverseOrder()))
                .limit(3)
                .forEach(System.out::println);

//        System.out.println("=========================\n");

//        System.out.println("=========================\n");

//        System.out.println("=========================\n");
    }
}

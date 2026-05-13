package oop.stream;

import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static oop.stream.Menu.*;

public class Grouping {
    public static void main(String[] args) {

        // 채식요리가 아닌 요리로 메뉴를 나눠보자
        // 두 분류로 나누어 줌. (분류 기준을 논리값(Boolean)으로 전달해 주어야 한다)
        Map<Boolean, List<Dish>> veggieMenu = MENU_LIST.stream()
                .collect(Collectors.partitioningBy(dish -> dish.isVegetarian()));
        System.out.println("veggieMenu = ");
        veggieMenu.get(true).forEach(System.out::println);
        System.out.println("Not veggieMenu = ");
        veggieMenu.get(false).forEach(System.out::println);

        System.out.println("=========================\n");

        //요리를 종류(Type)별로 그룹화 해줘
        Map<Dish.Type, List<Dish>> menuTypeMap = MENU_LIST.stream()
                .collect(Collectors.groupingBy(dish -> dish.getType()));

        for (Dish.Type type : menuTypeMap.keySet()) {
            System.out.println("type = " + type);
            menuTypeMap.get(type).forEach(System.out::println);
        }

        System.out.println("=========================\n");

        //종류별로 나눈 메뉴를 칼로리 기준(500 넘으면 고칼로리, 나머지는 저칼로리)으로 한 번 더 그룹화
        Map<Dish.Type, Map<String, List<Dish>>> group1 = MENU_LIST.stream()
                .collect(Collectors.groupingBy(Dish::getType, //첫 번째 분류 조건
                        Collectors.groupingBy(dish -> {
                            if (dish.getCalories() > 500)
                                return "고칼로리";
                            else
                                return "저칼로리";
                        })
                ));

        for (Dish.Type type : group1.keySet()){
            System.out.println("type = " + type);
            for (String name : group1.get(type).keySet()){
                System.out.println(name + ": ");
                group1.get(type).get(name).forEach(System.out::println);
            }
            System.out.println();
        }
        System.out.println("=========================\n");

        //종류 별 요리 개수
        Map<Dish.Type, Long> dishCount = MENU_LIST.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));
        for (Dish.Type type : dishCount.keySet()){
            System.out.println("type = " + type);
            System.out.println(dishCount.get(type));
        }

        System.out.println("=========================\n");

        // 종류별 요리 총 칼로리
        Map<Dish.Type, Integer> totalCalByType = MENU_LIST.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.summingInt(Dish::getCalories)));
        for (Dish.Type type : totalCalByType.keySet()){
            System.out.println("type = " + type);
            System.out.println(totalCalByType.get(type));
        }

        System.out.println("=========================\n");

        //
        Map<Dish.Type, IntSummaryStatistics> dishCalorySummary = MENU_LIST.stream()
                .collect(Collectors.groupingBy(Dish::getType,
                        Collectors.summarizingInt(Dish::getCalories)));

        for (Dish.Type type : dishCalorySummary.keySet()){
            System.out.println("type = " + type);
            System.out.println(dishCalorySummary.get(type));
        }


        System.out.println("=========================\n");

    }
}

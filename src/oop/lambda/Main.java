package oop.lambda;

import java.util.Arrays;
import java.util.List;

import static oop.lambda.Color.*;

public class Main {
    public static void main(String[] args) {// 사과 바구니 생성

        // List.of -> 고정형 리스트 생성 (Arrays.asList와 유사)
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );

        System.out.println(FilterApple.filterAppleByColor(appleBasket, Color.GREEN));
        System.out.println("================================================");

        System.out.println(FilterApple.filterApple(appleBasket, new LightApplePredicate()));

        System.out.println("================================================");

        // 녹색이면서 100g 이하인 사과만 필터링
        // 우리는 이제 익명클래스를 통해, 새 클래스 파일 생성 없이 즉석에서 보낼 수 있다!
        // 근데... 어짜피 인터페이스에 추상메서드 하나 아니냐?
        // 그럼 이름을 굳이 언급할 필요 있나? -> 람다식 쓰자!
        List<Apple> appleBasket2 = FilterApple.filterApple(appleBasket,
                apple ->
                        apple.getColor() == GREEN && apple.getWeight() <= 100
        );
        System.out.println(appleBasket2);
        System.out.println("================================================");

        List<Apple> appleBasket3 = FilterApple.filterApple(appleBasket,
                apple ->
                        (apple.getColor() == RED || apple.getColor() == GREEN)
                        && apple.getWeight() > 150
                );
        System.out.println(appleBasket3);
        System.out.println("================================================");

        //여러가지 타입의 객체를 필터링
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> basket = FilterApple.filter(numbers,
                n -> n % 2 == 0
                );
        System.out.println(basket);

        List<String> foods = List.of("짜장면", "짬뽕", "탕수육", "피자", "삼겹살", "파스타");
        List<String> basket2 = FilterApple.filter(foods,
                str -> str.length() == 3
                );
        System.out.println(basket2);
    }
}

package oop.lambda;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class FilterApple {
    /**
     * @solution - try1: 사과바구니에서 녹색 사과만 필터링하자
     * @param1 - 전체 사과가 들어있는 바구니
     * @return - 녹색 사과만 필터링 된 바구니
     *
     * @problem - 만약에 다른 색깔의 사과를 필터링 해야 한다면??
     *          새로운 메서드를 계속 선언해야 함...
     */

    public static List<Apple> filterAppleByColor(List<Apple> apples, Color color) {

        List<Apple> Basket = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getColor() == color) {
                Basket.add(apple);
            }
        }
        return Basket;
    }
    /**
     * @ solution - try2: 색상을 파라미터화 하자!
     * @ problem - 만약 필터 기준이 색상이 아니라 무게라면?
     */

    /**
     * @solution - try3: 동작을 파라미터화 하면 해결된다!
     *              - 함수를 전달 받을 수 있다면?
     *              - 자바는 함수를 전달할 수 있는가?
     *                  -> 불가능하다. 자바의 함수는 일급 객체가 아닙니다.
     *                  -> 함수 개념이 아니라 객체에 소속된 메서드 개념.
     *              - 그런데 전달되는 함수가 고정되어 있는가?
     *                  -> 필터 조건에 따라 함수 내용이 달라야 한다.
     *                  -> 그러면 어떻게 함수 이름이 통일 되면서
     *                      다른 내용을 전달할 수 있을까?
     *                      -> 오버라이딩 (상속, 인터페이스)
     */
    public static List<Apple> filterApple(List<Apple> apples, ApplePredicate applePredicate) {
        List<Apple> Basket = new ArrayList<>();
        for (Apple apple : apples) {
            if (applePredicate.test(apple)) {
                Basket.add(apple);
            }
        }

        return Basket;
    }
    /**
     * problem - 이제는 Apple 리스트만 오는게 아니다!
     *           Integer도 오고, String도 필터링 해달라고 한다....
     *
     * solution - try4: 제네릭 필터 메서드 선언
     *
     * 리턴 타입 앞에 붙는 <T>는 이 메서드가 제네릭을 사용하는 메서드고, 지금부터 T라는 임시 타입을 선언한다.
     * T는 이 메서드가 호출될 때 결정 될거야.
     */
    public static <T> List<T> filter(List<T> list, GenericPredicate<T> predicate) {
        List<T> basket = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                 basket.add(t);
            }
        }
        return basket;
    }

}

package oop.lambda;

import java.util.ArrayList;
import java.util.List;

public class MappingApple {

    // 사과의 색상만 추출
    public static <I, O> List<O> map(List<I> inputList, GenericFunction<I, O> mapper) {
        List<O> list = new ArrayList<>();
        for (I input : inputList) {
            list.add(mapper.apply(input));
        }
        return list;
    }
}

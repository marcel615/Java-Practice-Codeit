package basic.Array;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {

        int[] numbers;

        numbers = new int[5];

        numbers[0] = 50;
        numbers[1] = 77;
        numbers[2] = (int)3.14;
        numbers[3] = numbers[0] + 20;
        numbers[4] = 100;

        System.out.println("배열의 길이: " + numbers.length);

        for (int i = 0; i < numbers.length; i++){
            System.out.println("numbers[" + i+ "] = " + numbers[i]);
        }
        System.out.println("\n=================================");

        for (int num : numbers){
            System.out.println(num);
        }

        System.out.println(Arrays.toString(numbers));

        //만약 기존의 배열의 크기를 늘리거나 줄이고 싶으면 배열을 새로 만들어서 값을 옮겨야 한다.



    }
}

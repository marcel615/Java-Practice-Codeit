package basic.loop;

public class WhileExample {
    public static void main(String[] args) {

        //반복문의 필수 3요소 (begin - end - step)
        int i = 1; // begin
        while (i <= 10){   //end
            System.out.println("안녕하세요! " + i + "번 고객님!");
            i++; // step
        }

        for (int j = 0; j < 10 ; j++){
            System.out.println("안녕하세요! " + (j + 1) + "번 고객님!");
        }
        System.out.println("======================================");

        //1~100까지의 누적합계 구하기
        int total = 0;
        int k = 1;
        while (k <= 100){
            total += k;
            k++;
        }
        System.out.println(total);

        int result = 0;
        for (int num = 0; num < 100; num++){
            result += (num + 1);
        }
        System.out.println("result = " + result);

        System.out.println("======================================");

        // 특정 값이 소수인지 소수가 아닌지 판별하는 문제
        int num2 = 97;
        int n = 2;
        while (num2 % n != 0){
            n++;
        }
        if (n == num2)
            System.out.println(num2 + "는 소수이다.");
        else
            System.out.println(num2 + "는 소수가 아니다.");
        System.out.println("======================================");



    }
}

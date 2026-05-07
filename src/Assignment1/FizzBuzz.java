package Assignment1;

public class FizzBuzz {
    public static void main(String[] args) {
        // 1부터 100까지 반복하며 조건에 따라 출력
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                if (i % 3 == 0)
                    System.out.print("Fizz");
                if (i % 5 == 0)
                    System.out.print("Buzz");
                System.out.println("");
            }
            else System.out.println(i);
        }
    }
}


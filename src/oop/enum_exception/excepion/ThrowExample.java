package oop.enum_exception.excepion;

public class ThrowExample {

    static int calTotal(int end) throws ArithmeticException {
        if (end <= 0){
            throw new ArithmeticException("매개값은 양수로 주세요!");
        }
        int total = 0;
        for (int i = 1; i < end + 1 ; i++){
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        try {
            System.out.println(calTotal(-3));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("종료");

    }
}

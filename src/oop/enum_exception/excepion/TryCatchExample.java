package oop.enum_exception.excepion;

public class TryCatchExample {
    public static void main(String[] args) {
        int i = 19, j = 0;

        try {
            System.out.println(i + " / " + j + " = " + (i / j));
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        System.out.println("End");
    }
}

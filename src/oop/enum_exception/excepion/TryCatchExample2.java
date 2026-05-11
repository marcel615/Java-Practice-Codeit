package oop.enum_exception.excepion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];

        try {
            System.out.println("정수: ");
            int n = scanner.nextInt();

            int result = 100 / n;

            System.out.println(arr[result]);

            String s = null;
            s.equals("메롱");
        } catch (InputMismatchException | ArithmeticException e){
            System.out.println("오류 발생");
        } catch (Exception e) {
            System.out.println("다른 예외 발생");
        } finally {
            scanner.close();
        }




    }

}

package Assignment1;

public class StarPattern {
    public static void main(String[] args) {
        //패턴 출력
        int count = 1;
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}


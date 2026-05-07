package loop;

public class BreakExample {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            if (i == 5)
                break;
            System.out.print(i + " ");

        }
        System.out.println("\n=================================");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j)
                    break;
                System.out.println(i + "-" + j);
            }
        }
    }
}

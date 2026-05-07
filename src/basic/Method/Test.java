package basic.Method;

public class Test {

    static int calcTotal(int x, int y){
        int total = 0;
        for (int i = x; i <= y; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(calcTotal(1, 100));
        System.out.println(calcTotal(1, 200));
        System.out.println(calcTotal(1, 300));
        System.out.println(calcTotal(1, 400));
        System.out.println(calcTotal(47, 98));
    }
}

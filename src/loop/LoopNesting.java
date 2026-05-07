package loop;

public class LoopNesting {

    public static void main(String[] args) {

        // 30 ~ 100 사이의 소수가 몇 개 있는지 세봐! (for)
        int notPrimeNum = 0;

        for (int i = 30 ; i < 101 ; i++){
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    notPrimeNum ++;
                    break;
                }
            }
        }
        System.out.println(71 - notPrimeNum + "개가 소수인 개수이다.");

    }
}

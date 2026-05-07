package Assignment1;

public class SumCalculator {
    public static void main(String[] args) {
        // 미리 정의된 입력값들
        int[] inputs = {10, 20, 30, 0};
        int inputIndex = 0;
        int sum = 0;

        // while문을 사용하여 0이 입력될 때까지 합계 계산
        while (inputs[inputIndex] != 0){
            sum += inputs[inputIndex];
            inputIndex++;
        }

        System.out.println("합계: " + sum);
    }
}


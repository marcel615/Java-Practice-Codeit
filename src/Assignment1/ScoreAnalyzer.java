package Assignment1;

public class ScoreAnalyzer {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] arr = {85, 90, 78, 92, 88};
        // 평균 계산
        int sum = 0;

        for (int num : arr){
            sum += num;
        }
        double avg = (double) sum / arr.length;

        // 평균보다 높은/낮은 점수 개수 세기
        int higherGrade = 0;
        int lowwerGrade = 0;
        for (int num : arr){
            if (num > avg)
                higherGrade++;
            if (num < avg)
                lowwerGrade++;
        }
        System.out.println("평균: " + avg);
        System.out.println("평균보다 높은 점수 개수: " + higherGrade);
        System.out.println("평균보다 낮은 점수 개수: " + lowwerGrade);
    }
}

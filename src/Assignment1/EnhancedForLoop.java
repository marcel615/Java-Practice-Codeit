package Assignment1;

public class EnhancedForLoop {
    public static void main(String[] args) {
        // 점수 배열 선언 및 초기화
        int[] arr = {85, 90, 78, 92, 88};


        // 향상된 for문으로 출력
        for (int grade : arr){
            System.out.println(grade + "점");
        }
    }
}

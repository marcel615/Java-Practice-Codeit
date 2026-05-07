package Assignment1;

public class MinMaxFinder {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] arr = {3, 7, 2, 9, 1, 5, 8};


        // 최댓값과 최솟값 찾기
        int max = arr[0];
        int min = arr[0];
        for (int num : arr){
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }
        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);
    }
}

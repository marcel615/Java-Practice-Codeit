package Assignment1;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // 3x3 2차원 배열 선언 및 초기화
        int [][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        // 2차원 배열 출력
        for (int i = 0; i < arr.length; i++){
            for (int num : arr[i]){
                System.out.print(num + " ");
            }
            System.out.println("");
        }
    }
}

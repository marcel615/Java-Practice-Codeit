package Assignment1;

public class SeasonChecker {
    public static void main(String[] args) {
        int month = 7;
        String season = "";

        // switch문을 사용하여 계절 판단
        switch (month){
            case 3, 4, 5:
                season = "봄";
                break;
            case 6, 7, 8:
                season = "여름";
                break;
            case 9, 10, 11:
                season = "가을";
                break;
            case 12, 1, 2:
                season = "겨울";
                break;

        }

        System.out.println(month + "월은 " + season + "입니다.");
    }
}


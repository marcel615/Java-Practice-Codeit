package constate;

public class SwitchExample {
    public static void main(String[] args) {
        String gender = "F";

        switch (gender){
            case "m": case "M": case "남":
                System.out.println("남성");
                break;

                //java 14버전 이후 개선된 case문
            case "f", "F", "여":
                System.out.println("여성");
                break;
            default:
                System.out.println("잘못된 성별입니다.");
                break;
        }


    }
}

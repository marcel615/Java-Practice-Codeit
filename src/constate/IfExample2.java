package constate;

public class IfExample2 {
    public static void main(String[] args) {

        int age = 10;

        //다중 분기 조건문
        if (age >= 20){
            //중첩 조건문
            if (age <= 40){
                System.out.println("청년입니다.");
            } else {
                System.out.println("중년 이상입니다.");
            }
        } else if (age >= 17){
            System.out.println("고등학생입니다.");
        } else if (age >= 14){
            System.out.println("중학생입니다.");
        } else if (age >= 8){
            System.out.println("초등학생입니다.");
        } else {
            System.out.println("미취학 아동입니다.");
        }
    }
}

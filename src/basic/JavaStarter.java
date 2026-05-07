package basic;

public class JavaStarter {
    public static void main(String[] args) {
        //주석(comments)
        // 출력 메서드 자동완성: sout
        System.out.println("Hello World");
        /*
        ddd
        gferwgw

        gw
         */

        String title = "Java 변수와 자료형";
        int studyMinutes = 90;
        int targetMinutes = 120;
        int extraMinutes = 60;

        studyMinutes = 80;
        char level = 'A';
        double progressRate = (double) studyMinutes / targetMinutes;

        boolean isEnoughStudy = studyMinutes >= 60;

        // 문자열의 덧셈 연산의 결과는 항상 문자열!
        System.out.println("제목: " + title);
        System.out.println("학습 시간: " + studyMinutes);
        System.out.println(targetMinutes);
        System.out.println(extraMinutes);
        System.out.println(level);
        System.out.println(progressRate);
        System.out.println("충분히 학습했나요?: " + isEnoughStudy);



    }
}

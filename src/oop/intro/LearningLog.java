package oop.intro;

public class LearningLog {

    // 객체의 속성을 필드(field)
    String title;
    int minutes;
    boolean publicLog;

    void printSummary() {
        System.out.println(title + " - " + minutes + "분");
    }

    boolean needsReview() {
        return minutes < 60;
    }


}
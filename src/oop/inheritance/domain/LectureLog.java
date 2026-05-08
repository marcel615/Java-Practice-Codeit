package oop.inheritance.domain;

public class LectureLog extends LearningActivity{

    //필드
    private String instructorName;

    //ctor
    public LectureLog(String title, int minutes, boolean publicActivity, String instructorName) {
        super(title, minutes, publicActivity);
        this.instructorName = instructorName;
    }

    //method
    @Override
    public void printSummary() {
        System.out.println("[강의] #" + getId() + " " + getTitle() + " - " + getMinutes()
                + "분 - 강사: " + instructorName);
    }
    @Override
    public boolean isNeedReview() {
        return super.isNeedReview();
    }
    public void method1(){
        System.out.println("Example~~~~");
    }
}

package oop.abstract_interface.domain;

import oop.abstract_interface.policy.Reviewable;
import oop.abstract_interface.policy.Shareable;

public class LectureLog extends LearningActivity implements Reviewable, Shareable {

    //필드
    private String instructorName;

    //ctor
    public LectureLog(String title, int minutes, boolean publicActivity, String instructorName) {
        super(title, minutes, publicActivity);
        this.instructorName = instructorName;
    }

    //abstract
    @Override
    public String getActivityType() {
        return "강의";
    }

    @Override
    public String getDetailText() {
        return "강사: " + instructorName;
    }


    //interface
    @Override
    public boolean needsReview() {
        return getMinutes() < 60;
    }
    @Override
    public void printReviewTarget() {
        System.out.println("[복습 권장] " + getTitle() + " (" + getMinutes() + "분)");
    }

    @Override
    public boolean canShare() {
        return isPublicActivity();
    }
    @Override
    public String getShareTitle() {
        return getTitle();
    }

    //method
    public void method1(){
        System.out.println("Example~~~~");
    }

}

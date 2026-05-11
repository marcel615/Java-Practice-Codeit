package oop.inner_anonymous.domain;

import oop.inner_anonymous.policy.Reviewable;
import oop.inner_anonymous.policy.Shareable;

public class LectureLog extends LearningActivity implements Reviewable, Shareable {

    //필드
    private String instructorName;

    //ctor
    public LectureLog(String title, int minutes, Visibility visibility, String instructorName) {
        super(title, minutes, visibility, ActivityCategory.LECTURE);
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
        return getCategory().isShortStudy(getMinutes());
    }
    @Override
    public void printReviewTarget() {
        System.out.println("[복습 권장] " + getTitle() + " (" + getMinutes() + "분)");
    }

    @Override
    public boolean canShare() {
        return getVisibility() == Visibility.PUBLIC;
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

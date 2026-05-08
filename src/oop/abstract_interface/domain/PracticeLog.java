package oop.abstract_interface.domain;

import oop.abstract_interface.policy.Reviewable;
import oop.abstract_interface.policy.Shareable;

public class PracticeLog extends LearningActivity implements Reviewable, Shareable {

    //필드
    private int completionRate;

    //ctor
    public PracticeLog(String title, int minutes, boolean publicActivity, int completionRate) {
        super(title, minutes, publicActivity);
        this.completionRate = completionRate;
    }

    //getter, setter
    public int getCompletionRate() {
        return completionRate;
    }
    public void setCompletionRate(int completionRate) {
        this.completionRate = normalizeCompletionRate(completionRate);
    }


    //abstract
    @Override
    public void printSummary() {
        System.out.println("[실습] #" + getId() + " " + getTitle() + " - " + getMinutes()
                + "분 - 완료율: " + completionRate + "%");
    }

    //interface
    @Override
    public boolean needsReview() {
        return (getMinutes() < 60 || completionRate < 70);
    }
    @Override
    public void printReviewTarget() {
        printSummary();
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
    private int normalizeCompletionRate(int completionRate) {
        if (completionRate < 0){
            return 0;
        }
        if (completionRate > 100){
            return 100;
        }

        return completionRate;
    }

}

package oop.abstract_interface.domain;

import oop.abstract_interface.policy.Reviewable;
import oop.abstract_interface.policy.Shareable;

public class ReadingLog extends LearningActivity implements Reviewable, Shareable {

    //필드
    private String bookTitle;

    //ctor
    public ReadingLog(String title, int minutes, boolean publicActivity, String bookTitle) {
        super(title, minutes, publicActivity);
        this.bookTitle = bookTitle;
    }

    //abstract
    @Override
    public void printSummary() {
        System.out.println("[독서] #" + getId() + " " + getTitle() + " - " + getMinutes()
                + "분 - 책: " + bookTitle);
    }

    //interface
    @Override
    public boolean needsReview() {
        return false;
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

}

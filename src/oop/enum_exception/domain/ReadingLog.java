package oop.enum_exception.domain;

import oop.enum_exception.policy.Reviewable;
import oop.enum_exception.policy.Shareable;

public class ReadingLog extends LearningActivity implements Reviewable, Shareable {

    //필드
    private String bookTitle;

    //ctor
    public ReadingLog(String title, int minutes, Visibility visibility, String bookTitle) {
        super(title, minutes, visibility, ActivityCategory.READING);
        this.bookTitle = bookTitle;
    }

    //abstract
    @Override
    public String getActivityType() {
        return "독서";
    }

    @Override
    public String getDetailText() {
        return "책: " + bookTitle;
    }

    //interface
    @Override
    public boolean needsReview() {
        return false;
    }
    @Override
    public void printReviewTarget() {
        System.out.println("[복습 권장] " + getTitle() + " (" + bookTitle + ")");
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

}

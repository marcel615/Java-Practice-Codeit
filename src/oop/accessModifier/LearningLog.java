package oop.accessModifier;

public class LearningLog {
    //필드
    private String title;
    private int minutes;
    private boolean publicFlag;

    //ctor
    public LearningLog(){
    }
    public LearningLog(String title, int minutes){
        this(title, minutes, true);
    }
    public LearningLog(String title, int minutes, boolean publicFlag){
        this.title = title;
        this.minutes = minutes;
        this.publicFlag = publicFlag;
    }

    //getter, setter
    public String getTitle(){
        return title;
    }
    public int getMinutes(){
        return minutes;
    }
    public boolean getPublicFlag(){
        return publicFlag;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setMinutes(int minutes){
        if (minutes <= 0) {
            System.out.println("잘못된 공부 시간입니다.");
            return;
        }
        this.minutes += minutes;
    }
    public void setPublicFlag(boolean publicFlag){
        this.publicFlag = publicFlag;
    }


    //method
    public void printSummary(){
        System.out.println(title + " - " + minutes + "분");
    }
    public boolean isNeedReview(){
        return (minutes < 60);
    }




}
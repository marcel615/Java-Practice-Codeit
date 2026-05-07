package oop.intro;

public class LearningLog {
    //필드
    private String title;
    private int minutes;
    private boolean publicFlag;

    //ctor
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

    //method
    public void printSummary(){
        System.out.println(title + " - " + minutes + "분");
    }
    public boolean isNeedReview(){
        return (minutes < 60);
    }




}
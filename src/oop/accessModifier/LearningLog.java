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
        this.title = normalizeTitle(title);
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
    public boolean isPublicFlag(){
        return publicFlag;
    }
    public void setTitle(String title){
        this.title = normalizeTitle(title);
    }
    public void setMinutes(int minutes){
        if (minutes <= 0) {
            System.out.println("잘못된 공부 시간입니다.");
            return;
        }
        this.minutes = minutes;
    }
    public void setPublicFlag(boolean publicFlag){
        this.publicFlag = publicFlag;
    }


    //method
    public void printSummary(){
        String visibility = publicFlag ? "공개" : "비공개";
        System.out.println(title + " - " + minutes + "분 - " + visibility);
    }
    public boolean isNeedReview(){
        return (minutes < 60);
    }
    public void extendMinutes(int minutes){
        if (minutes <= 0) {
            System.out.println("잘못된 추가 공부 시간입니다.");
            return;
        }
        this.minutes += minutes;
    }
    public void changeTitle(String title){
        this.title = normalizeTitle(title);
    }
    public void openToPublic(){
        setPublicFlag(true);
    }
    public void hideToPublic(){
        setPublicFlag(false);
    }
    // 이 클래스에서만 사용하는 메서드 -> private
    private String normalizeTitle(String title){
        if (title == null || title.isBlank()) {
            return "제목 없음";
        }
        return title;
    }




}
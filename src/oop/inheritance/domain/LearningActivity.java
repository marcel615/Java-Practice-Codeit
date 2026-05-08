package oop.inheritance.domain;

public class LearningActivity {
    //필드
    private static final int REVIEW_THRESHOLD_MINUTES = 60;
    private static int totalObjectCreateCount = 0;

    private final long id;
    private String title;
    private int minutes;
    private boolean publicActivity;

    
    //ctor
    public LearningActivity(String title, int minutes){
        this(title, minutes, true);
    }
    public LearningActivity(String title, int minutes, boolean publicActivity){
        this.id = totalObjectCreateCount;
        this.title = normalizeTitle(title);
        this.minutes = minutes;
        this.publicActivity = publicActivity;
        totalObjectCreateCount++;
    }

    //getter, setter
    public long getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public int getMinutes(){
        return minutes;
    }
    public boolean ispublicActivity(){
        return publicActivity;
    }
    public static int getTotalObjectCreateCount(){
        return totalObjectCreateCount;
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
    public void setpublicActivity(boolean publicActivity){
        this.publicActivity = publicActivity;
    }


    //method
    public void printSummary(){
        String visibility = publicActivity ? "공개" : "비공개";
        System.out.println("#" + id + ". " + title + " - " + minutes + "분 - " + visibility);
    }
    public boolean isNeedReview(){
        return (minutes < REVIEW_THRESHOLD_MINUTES);
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
        setpublicActivity(true);
    }
    public void hideToPublic(){
        setpublicActivity(false);
    }
    // 이 클래스에서만 사용하는 메서드 -> private
    private String normalizeTitle(String title){
        if (title == null || title.isBlank()) {
            return "제목 없음";
        }
        return title;
    }




}
package oop.abstract_interface.domain;

public abstract class LearningActivity {
    //필드
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
    public boolean isPublicActivity(){
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
    public void setPublicActivity(boolean publicActivity){
        this.publicActivity = publicActivity;
    }

    //abstract method
    public abstract void printSummary();

    //method
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
        setPublicActivity(true);
    }
    public void hideToPublic(){
        setPublicActivity(false);
    }
    // 이 클래스에서만 사용하는 메서드 -> private
    private String normalizeTitle(String title){
        if (title == null || title.isBlank()) {
            return "제목 없음";
        }
        return title;
    }




}
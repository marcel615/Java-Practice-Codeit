package oop.static_final;

public class LearningLog {
    //필드
    private final long id;
    private String title;
    private int minutes;
    private boolean publicFlag;

    private static int totalObjectCreateCount = 0;
    private static final int REVIEW_THRESHOLD_MINUTES = 60;

    //ctor
    public LearningLog(String title, int minutes){
        this(title, minutes, true);
    }
    public LearningLog(String title, int minutes, boolean publicFlag){
        this.id = totalObjectCreateCount;
        this.title = normalizeTitle(title);
        this.minutes = minutes;
        this.publicFlag = publicFlag;
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
    public boolean isPublicFlag(){
        return publicFlag;
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
    public void setPublicFlag(boolean publicFlag){
        this.publicFlag = publicFlag;
    }


    //method
    public void printSummary(){
        String visibility = publicFlag ? "공개" : "비공개";
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
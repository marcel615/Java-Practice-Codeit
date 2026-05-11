package oop.enum_exception.domain;

public abstract class LearningActivity {
    //필드
    private static int totalObjectCreateCount = 0;

    private final long id;
    private String title;
    private int minutes;
    private Visibility visibility;
    private final ActivityCategory category;

    
    //ctor
    /*
    public LearningActivity(String title, int minutes){
        this(title, minutes, Visibility.PUBLIC);
    }
    */
    public LearningActivity(String title, int minutes, Visibility visibility, ActivityCategory category){
        this.id = totalObjectCreateCount;
        this.title = normalizeTitle(title);
        this.minutes = minutes;
        this.visibility = visibility;
        this.category = category;
        totalObjectCreateCount++;
    }

    //getter, setter
    public static int getTotalObjectCreateCount(){
        return totalObjectCreateCount;
    }
    public long getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public int getMinutes(){
        return minutes;
    }
    public Visibility getVisibility(){
        return visibility;
    }
    public ActivityCategory getCategory(){
        return category;
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
    public void setVisibility(Visibility visibility){
        this.visibility = visibility;
    }

    //abstract method
    public abstract String getActivityType();
    public abstract String getDetailText();


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
        setVisibility(Visibility.PUBLIC);
    }
    public void hideToPublic(){
        setVisibility(Visibility.PRIVATE);
    }
    public String getVisibilityText(){
        return getVisibility() == Visibility.PUBLIC ? "공개" : "비공개";
    }
    // 이 클래스에서만 사용하는 메서드 -> private
    private String normalizeTitle(String title){
        if (title == null || title.isBlank()) {
            return "제목 없음";
        }
        return title;
    }




}
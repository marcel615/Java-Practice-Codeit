package oop.stream;

public class SimpleDish {
    //필드
    private final String name;
    private final int calories;

    //ctor
    public SimpleDish(Dish dish) {
        this.name = dish.getName();
        this.calories = dish.getCalories();
    }

    public SimpleDish(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    //getter
    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    //method Override
    @Override
    public String toString() {
        return "SimpleDish{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }

    //method
}

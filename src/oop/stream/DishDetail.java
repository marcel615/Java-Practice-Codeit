package oop.stream;

public class DishDetail {

    private final String dishName;
    private final String type;

    public DishDetail(String dishName, String type) {
        this.dishName = dishName;
        this.type = type;
    }

    public DishDetail(Dish dish) {
        this.dishName = dish.getName();
        this.type = dish.getType().getDesc();
    }

    public String getDishName() {
        return dishName;
    }

    public String getType() {
        return type;
    }
}

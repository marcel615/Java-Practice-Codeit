package oop.lambda;

public class Apple {

    //필드
    private int weight;
    private Color color;

    //ctor
    public Apple() {}

    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    //getter, setter
    public int getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //method override
    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }

    //method

}

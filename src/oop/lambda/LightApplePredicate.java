package oop.lambda;

public class LightApplePredicate implements ApplePredicate {

    static final int STANDARD_WEIGHT = 100;

    //interface
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() <= STANDARD_WEIGHT;
    }

}

package oop.collection.printer;

import oop.collection.domain.LearningActivity;

public class ConsoleActivityPrinter implements ActivityPrinter {


    //interface
    @Override
    public void print(LearningActivity activity) {
        System.out.println(
                "[" + activity.getActivityType() + "]"
                        + " #" + activity.getId()
                        + " " + activity.getTitle()
                        + " - " + activity.getMinutes() + "분"
                        + " - " + activity.getDetailText()
                        + " - " + activity.getVisibilityText() + " d\\^_^/b"
        );

    }

}

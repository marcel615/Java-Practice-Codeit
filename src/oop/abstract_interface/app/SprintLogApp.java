package oop.abstract_interface.app;

import oop.abstract_interface.domain.LearningActivity;
import oop.abstract_interface.domain.LectureLog;
import oop.abstract_interface.domain.PracticeLog;
import oop.abstract_interface.domain.ReadingLog;
import oop.abstract_interface.policy.Reviewable;
import oop.abstract_interface.policy.Shareable;

public class SprintLogApp {
    public static void main(String[] args) {

        LectureLog javaLecture = new LectureLog("Java 객체지향", 50, true, "박코치");
        PracticeLog gitPractice = new PracticeLog("Git 브랜치 실습", 70, true, 80);
        PracticeLog oopPractice = new PracticeLog("캡슐화 리팩터링", 40, false, 45);
        ReadingLog oopBook = new ReadingLog("객체지향의 사실과 오해", 35, true, "객체지향의 사실과 오해");

        LearningActivity[] activities = {javaLecture, gitPractice, oopPractice, oopBook};

        System.out.println("=== 학습 활동 목록 ===");
        for (int i = 0; i < activities.length; i++) {
            activities[i].printSummary();
        }

        Reviewable[] reviewables = {javaLecture, gitPractice, oopPractice, oopBook};
        System.out.println();
        System.out.println("===== 복습 필요 활동 =====");
        for (Reviewable reviewable : reviewables) {
            if (reviewable.needsReview()) {
                reviewable.printReviewTarget();
            }
        }

        Shareable[] shareables = {javaLecture, gitPractice, oopPractice, oopBook};
        System.out.println();
        System.out.println("===== 공유 가능 활동 =====");
        for (Shareable shareable : shareables) {
            if (shareable.canShare()) {
                System.out.println(shareable.getShareTitle());
            }
        }


    }
}

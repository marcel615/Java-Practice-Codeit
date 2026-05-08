package oop.inheritance.app;

import oop.inheritance.domain.LearningActivity;
import oop.inheritance.domain.PracticeLog;
import oop.inheritance.domain.LectureLog;

public class SprintLogApp {
    public static void main(String[] args) {
        // 객체들 생성
        LearningActivity javaLecture = new LectureLog("Java 객체지향", 50, true, "박코치");
        PracticeLog gitPractice = new PracticeLog("Git 브랜치 실습", 70, true, 80);
        PracticeLog oopPractice = new PracticeLog("캡슐화 리팩터링", 40, false, 45);

        LearningActivity[] logs = {javaLecture, gitPractice, oopPractice};
        for (LearningActivity log : logs) {
            log.printSummary();
        }

        System.out.println("======= 복습이 필요한 활동 =======");
        for (LearningActivity log : logs) {
            if (log.isNeedReview()) {
                log.printSummary();
            }
        }

        LectureLog tf = (LectureLog) javaLecture;
        tf.method1();

        System.out.println();
        System.out.println("==== 실습 활동만 보기 ====");
        for (LearningActivity log : logs) {
            if (log.getClass() == PracticeLog.class) {
                log.printSummary();
                System.out.println(((PracticeLog) log).getCompletionRate());
            }
            if (log instanceof PracticeLog practiceLog){
                practiceLog.printSummary();
                System.out.println(practiceLog.getCompletionRate());
            }
        }


    }
}

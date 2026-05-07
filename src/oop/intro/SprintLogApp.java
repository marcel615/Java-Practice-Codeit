package oop.intro;

public class SprintLogApp {
    public static void main(String[] args) {
        // 객체들 생성
        LearningLog javaLog1 = new LearningLog("Java 시작", 40, true);
        LearningLog javaLog2 = new LearningLog("Git 복습", 30, false);
        LearningLog javaLog3 = new LearningLog("조건문 학습", 75, true);
        LearningLog javaLog4 = new LearningLog("반복문 학습", 120, true);

        LearningLog[] javaLogs = new LearningLog[]{javaLog1, javaLog2, javaLog3, javaLog4};

        for (LearningLog log : javaLogs){
            if (log.isNeedReview())
                log.printSummary();
        }

        System.out.println("=================");
        for (LearningLog log : javaLogs){
            if (log.getPublicFlag())
                log.printSummary();
        }

    }
}

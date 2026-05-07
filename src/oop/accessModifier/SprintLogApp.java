package oop.accessModifier;

public class SprintLogApp {
    public static void main(String[] args) {
        // 객체들 생성
        LearningLog javaLog1 = new LearningLog("Java 시작", 4);
        LearningLog javaLog2 = new LearningLog("Git 복습", 30, false);
        LearningLog javaLog3 = new LearningLog("조건문 학습", 75);
        LearningLog javaLog4 = new LearningLog("반복문 학습", 120);

        LearningLog[] javaLogs = new LearningLog[]{javaLog1, javaLog2, javaLog3, javaLog4};

        for (LearningLog log : javaLogs){
            log.printSummary();
        }
    }
}

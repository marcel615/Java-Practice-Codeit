package oop.static_final;

public class SprintLogApp {
    public static void main(String[] args) {
        // 객체들 생성
        LearningLog javaLog1 = new LearningLog("Java 시작", 40);
        LearningLog javaLog2 = new LearningLog("Git 복습", 30, false);
        LearningLog javaLog3 = new LearningLog("캡슐화 연습", 90);

        LearningLog[] javaLogs = {javaLog1, javaLog2, javaLog3};

        for (LearningLog javaLog : javaLogs) {
            javaLog.printSummary();
        }

        System.out.println(LearningLog.getTotalObjectCreateCount());

    }
}

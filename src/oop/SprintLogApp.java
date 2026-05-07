package oop;

import java.util.Scanner;

public class SprintLogApp {
    public static void main(String[] args) {

        // 데이터들 생성
        String[] titles = {"Java 시작", "Git 복습", "조건문 학습", "반복문 학습"};
        int[] minutes = {40, 30, 75, 120};
        boolean[] publicFlags = {true, false, true, true};

        // 스캐너 할당
        Scanner sc = new Scanner(System.in);

        // 프로그램 가동
        outer: while (true){
            printMenu();
            // 사용자 입력
            int input = sc.nextInt();

            switch (input){
                case 1:
                    printDivider("전체");

                    for (int i = 0; i < titles.length; i++){
                        printLogItem((i+1), titles[i], minutes[i]);
                    }
                    continue;
                case 2:
                    printDivider("공개된");

                    for (int i = 0; i < titles.length; i++){
                        if (publicFlags[i])
                            printLogItem((i+1), titles[i], minutes[i]);
                    }
                    continue;
                case 3:
                    printDivider("전체 학습");
                    int total = calTotalTime(minutes);

                    System.out.println("전체 학습 시간: " + total);
                    continue;
                case 4:
                    printDivider("복습 필요");
                    total = calTotalTime(minutes);

                    for (int i = 0; i < titles.length; i++) {
                        if (minutes[i] < 60){
                            printLogItem((i+1), titles[i], minutes[i]);
                        }
                    }

                    double avg = (double) total / minutes.length;
                    System.out.println("평균 학습 시간: " + avg + "분");
                    continue;
                case 5:
                    printDivider("긴 학습");
                    for (int i = 0; i < titles.length; i++) {
                        if (minutes[i] >= 100){
                            printLogItem((i+1), titles[i], minutes[i]);
                        }
                    }
                    continue;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break outer;
            }
        }
    }

    // 메뉴 출력 메서드
    static void printMenu(){
        System.out.println();
        System.out.println("==== SprintLog ====");
        System.out.println("1. 전체 기록 출력");
        System.out.println("2. 공개 기록만 출력");
        System.out.println("3. 전체 학습 시간 출력");
        System.out.println("4. 복습 필요 기록 출력");
        System.out.println("5. 긴 학습 기록 출력");
        System.out.println("0. 종료");
        System.out.print("메뉴를 선택하세요: ");
    }
    static void printDivider(String title){
        System.out.println("========== " + title + " 기록 ==========");
    }
    static void printLogItem(int index, String title, int minutes){
        System.out.println(index + ". " + title + " - " + minutes + "분");
    }
    static int calTotalTime(int[] timeArr){
        int total = 0;
        for (int time : timeArr){
            total += time;
        }
        return total;
    }

}

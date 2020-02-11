package io;

public class ConsoleOutput {
    public static void printStartMessage() {
        System.out.println("계산기를 시작합니다.");
    }

    public static void printResult(Double result) {
        System.out.println("결과 : " + String.format("%.3f", result));
    }

    public static void printEndMessage() {
        System.out.println("계산기를 종료합니다.");
    }
}

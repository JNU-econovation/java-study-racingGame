package racinggame.util;

import java.util.Scanner;

public class InputView {
    public static String[] inputCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String inputName = scanner.next();
        String[] names = inputName.split(",");
        return names;
    }

    public static int inputTry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("시도할 횟수는 몇 회 인가요?");
        return scanner.nextInt();
    }
}
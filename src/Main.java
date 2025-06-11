import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        //입력한 값에 따른 조건문
        // if문 (숫자를 비교), 스위치 (단순히 값만 체크)

        String item = "";

        switch (choice) {
            case 1:
                item = "멜론소다";
                break;
            case 2:
                item = "콜라";
                break;
            case 3:
                item = "사이다";
                break;
            case 4:
                item = "커피";
                break;
            case 5:
                item = "보리차";
        }
        System.out.println(item);
    }
}
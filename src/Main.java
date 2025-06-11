import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("** 음료 자판기 **");
        System.out.println("오렌지주스 (1500원)");
        System.out.println("콜라 (1300원)");
        System.out.println("사이다 (1300원)");
        System.out.println("아메리카노 (1400원)");
        System.out.println("보리차 (1200원)");
        System.out.println("물 (1100원)");

        int choice = scanner.nextInt();
        int price = 0;
        String item = "";

        //입력한 값에 따른 조건문
        // if문 (숫자를 비교), 스위치 (단순히 값만 체크)

        switch (choice) {
            case 1:
                item = "오렌지주스";
                price = 1500;
                break;
            case 2:
                item = "콜라";
                price = 1300;
                break;
            case 3:
                item = "사이다";
                price = 1300;
                break;
            case 4:
                item = "아메리카노";
                price = 1400;
                break;
            case 5:
                item = "보리차";
                price = 1200;
                break;
            case 6:
                item = "물";
                price = 1100;
                break;
            default:
                System.out.println("잘못 누르셨습니다.");
                return;
        }

        System.out.println(item + "을(를) 선택하셨습니다. 금액을 넣어주세요: "); // return시 실행 안 됨
        int money = scanner.nextInt();

        if(money < price) {
            System.out.println("금액이 부족합니다. 거래를 취소합니다.");
        } else {
            int change = money - price;
            System.out.printf("%s을(를) 드립니다. 거스름돈 %d원을 가져가세요.\n", item, change);
        }
        System.out.println("안녕히 가세요.");
    }
}
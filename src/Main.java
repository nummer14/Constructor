public class Main {
    public static void main(String[] args) {
        System.out.println("\"안녕하세요?\"");
        System.out.println("Hello\nJava");
        System.out.println("들여쓰기 하고 싶니?\t네");

        System.out.printf("print로 줄바꿈 가능?");
        System.out.printf("아니오\n");

        int age = 20;
        double pi = 3.141592;

        System.out.printf("나이: %d, 원주율: %.2f", age, pi);

        /*double pi = Math.PI;
        System.out.println(pi);
        System.out.printf("%.15f", pi); // 0.5 0.25 0.125...*/
    }
}
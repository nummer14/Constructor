public class Main {
    public static void main(String[] args) {
        String name = "Son";
        int backNo = 7;

        System.out.println((name + backNo).getClass().getName());

        System.out.println(((Object) backNo).getClass().getName());

    }
}
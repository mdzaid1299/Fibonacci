import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        int a, b, c;
        a = 0;
        b = 1;
        System.out.println(a + "  ");
        System.out.println(b + "  ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter count");
        int count = scanner.nextInt();
        for (int i = 2; i < count; i++) {
            c = a + b;
            System.out.println(c + "  ");
            a = b;
            b = c;

        }
    }
}
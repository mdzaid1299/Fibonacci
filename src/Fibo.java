import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        int a, b, c;
        a = 0;
        b = 1;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter count");
        int count = scanner.nextInt();
        for (int i = 2; i < count; i++) {
            c = a + b;
            System.out.println("c = " + c);
            b = a;
            c = b;

        }
        System.out.println(a + b  );
    }
}
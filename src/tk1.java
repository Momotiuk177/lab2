import java.util.Scanner;

public class tk1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String message = (n > 50 && n < 100)
                ? String.format("Число %d міститься в проміжку (50; 100)%n", n)
                : String.format("Число %d не міститься в проміжку (50; 100)%n", n);

        System.out.println(message);
    }
}

public class tk2 {
    public static void main(String[] args) {
        int n = 123;

        int digit1 = n / 100;
        int digit2 = (n / 10) % 10;
        int digit3 = n % 10;

        int maxDigit = Math.max(Math.max(digit1, digit2), digit3);

        System.out.printf("Найбільша цифра числа %d: %d%n", n, maxDigit);
    }
}


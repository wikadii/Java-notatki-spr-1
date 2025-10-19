import java.util.Scanner;

public class SitoErastotenesa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] isPrime = new boolean[1000];
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true; // zalozenie zewszystkie liczby > 1 są pierwsze
        }
        for (int i = 2; i * i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.println("Podaj x: ");
        int x = scanner.nextInt();
        System.out.println("Podaj y: ");
        int y = scanner.nextInt();
        scanner.close();

        if (x < 0 || y >= 1000 || x > y) {
            System.out.println("zly zakres");
            System.exit(-1);
        }
        System.out.println("Liczby pierwsze w zakresie [" + x + ", " + y + "]:");
        for (int i = x; i <= y; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
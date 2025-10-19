import java.util.Scanner;

public class LiczbyPierwszeBezEratestonesa {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(isPrime(num))
            System.out.println("Liczba " + num + " to liczba pierwsza");
        else
            System.out.println("Liczba " + num + " to liczba pierwsza");

        scanner.close();
    }
    private static boolean isPrime(int num) {
        if(num <= 1) return false;
        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}

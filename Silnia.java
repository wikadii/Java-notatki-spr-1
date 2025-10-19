import java.util.Scanner;

public class Silnia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną:");
        int number = scanner.nextInt();
        scanner.close();
        if(number < 0){
            System.out.println("Nie można policzyć silni z mniejszej od 0!");
            System.exit(-1);
        }

        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        System.out.println("Suma silni cyfr liczby " + number + " wynosi: " + sum);
    }
    private static int factorial(int number) {
        if(number == 1 || number == 0) return 1;
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
    /*
    zwykla silnia
    private static int factorial(int num){
    pamietaj o num < 0
        if(num == 1 || num == 0) return 1;
        return num * factorial(num - 1);
    }
    */
}

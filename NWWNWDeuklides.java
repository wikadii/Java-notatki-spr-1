import java.util.Scanner;

public class NWWNWDeuklides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a i b żeby wyznaczyć NWD(a,b) i NWW(a,b)");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("NWD(" + num1 + ", " + num2 + ") to: " + NWD(num1, num2));
        System.out.println("NWD(" + num1 + ", " + num2 + ") to: " + (num1 * num2 / NWD(num1, num2)));
        scanner.close();
    }
    private static int NWD(int num1, int num2) {
        while(num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}

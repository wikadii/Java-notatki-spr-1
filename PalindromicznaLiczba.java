import java.util.Scanner;

public class PalindromicznaLiczba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int num = scanner.nextInt();
        System.out.println("Najbliższa liczba palindromiczna do liczby " + num + " to " + closestPalindromicNumber(num));
        scanner.close();
    }
    private static int closestPalindromicNumber(int num) {
        if(isPalindrome(num)) return num;

        int bottom = num - 1;
        int up = num + 1;

        while(true){
            if(isPalindrome(bottom)) return bottom;
            if(isPalindrome(up)) return up;
            bottom--;
            up++;
        }
    }
    private static boolean isPalindrome(int num) {
        String numString = Integer.toString(num);
        for (int i = 0; i < numString.length() / 2; i++) {
            if (numString.charAt(i) != numString.charAt(numString.length() - 1 - i))
                return false;
        }
        return true;
    }
}

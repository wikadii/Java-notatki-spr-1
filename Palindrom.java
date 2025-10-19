import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź tekst do sprawdzenia czy jest palindromem: ");
        String text = scanner.nextLine();
        checkIfPalindrome(text);
        scanner.close();
    }

    private static void checkIfPalindrome(String word){
        String wordToLower = word.toLowerCase();
        String wordReversed = reverseString(wordToLower);

        if(wordToLower.equals(wordReversed))
            System.out.println("Wyraz " + word + " jest palindromem");
        else
            System.out.println("Wyraz " + word + " nie jest palindromem");
    }

    private static String reverseString(String word){
        char[] wordButArray = word.toCharArray();
        char[] wordReversed = new char[wordButArray.length];
        for(int i = wordButArray.length - 1; i >= 0; i--){
            wordReversed[(word.length() - i) - 1] = wordButArray[i];
        }
        return new String(wordReversed);
    }
}
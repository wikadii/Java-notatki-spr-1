import java.util.Scanner;

public class SzyfrCezara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst do zaszyfrowania: ");
        String text = scanner.nextLine();
        System.out.println("Zaszyfrowany tekst to: " + encrypt(text));
        scanner.close();
    }
    private static String encrypt(String text) {
        String encrypted = "";
        int key = 3;
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            if (letter >= 'a' && letter <= 'z') {
                letter = (char) ('a' + (letter - 'a' + key) % 26);
            }else if(letter >= 'A' && letter <= 'Z') {
                letter = (char) ('A' + (letter - 'A' + key) % 26);
            }

            encrypted += letter; //dla nielitter
        }
        return encrypted;
    }
}

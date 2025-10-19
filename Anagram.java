import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowa do sprawdzenia czy są anagramami: ");

        String word = scanner.nextLine();
        String word2 = scanner.nextLine();

        if(isAnagram(word, word2))
            System.out.println("Słowa: " + word + ", " +  word2 + " są anagramami");
        else
            System.out.println("Słowa: " + word + ", " +  word2 + " nie są anagramami");
    }
    private static boolean isAnagram(String firstWord, String secondWord) {
        firstWord = firstWord.toLowerCase();
        secondWord = secondWord.toLowerCase();

        int firstWordLength = firstWord.length();
        int secondWordLength = secondWord.length();

        if(firstWordLength != secondWordLength) return false;

        char[] firstWordChars = firstWord.toCharArray();
        char[] secondWordChars = secondWord.toCharArray();

        bubbleSort(firstWordChars);
        bubbleSort(secondWordChars);

        String firstWordToString = new String(firstWordChars);
        String secondWordToString = new String(secondWordChars);

        if(firstWordToString.equals(secondWordToString))
            return true;
        else
            return false;
    }
    private static void bubbleSort(char[] word){
        for(int i = 0; i < word.length - 1; i++){
            for(int j = 0; j < word.length - 1 - i; j++){
                if(word[j] > word[j+1]){
                    char tempChar = word[j];
                    word[j] = word[j+1];
                    word[j+1] = tempChar;
                }
            }
        }
    }
}

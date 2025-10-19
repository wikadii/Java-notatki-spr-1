import java.util.Random;

public class LosoweHaslo {
    public static void main(String[] args) {
        int length = 20;
        String password = generatePassword(length);
        System.out.println("Wygenerowane hasło: " + password);
    }

    private static String generatePassword(int length) {
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String specialSigns = "!@#$%^&*()_+[]{};:,.<>?";
        String allCharacters = lowerCaseLetters + upperCaseLetters + digits + specialSigns;
        Random rand = new Random();
        char[] password = new char[length];

        password[0] = lowerCaseLetters.charAt(rand.nextInt(lowerCaseLetters.length()));
        password[1] = upperCaseLetters.charAt(rand.nextInt(upperCaseLetters.length()));
        password[2] = digits.charAt(rand.nextInt(digits.length()));
        password[3] = specialSigns.charAt(rand.nextInt(specialSigns.length()));

        for (int i = 4; i < length; i++) {
            password[i] = allCharacters.charAt(rand.nextInt(allCharacters.length()));
        }

        for (int i = length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            char temp = password[i];
            password[i] = password[j];
            password[j] = temp;
        }

        return new String(password);
    }
}

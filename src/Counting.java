import java.util.Scanner;

public class Counting {
    private static void printCharactersCount(String string) {
        int lettersCount = 0;
        int digitsCount = 0;
        int spacesCount = 0;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                lettersCount++;
            } else if (Character.isDigit(string.charAt(i))) {
                digitsCount++;
            } else if (Character.isWhitespace(string.charAt(i))) {
                spacesCount++;
            }
        }

        int otherCharsCount = string.length() - lettersCount - digitsCount - spacesCount;

        System.out.println("All letters in the string: " + lettersCount);
        System.out.println("All digits in the string: " + digitsCount);
        System.out.println("All spaces in the string: " + spacesCount);
        System.out.println("Total remaining characters in the string: " + otherCharsCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string:");
        String enteredString = scanner.nextLine();

        printCharactersCount(enteredString);
    }
}

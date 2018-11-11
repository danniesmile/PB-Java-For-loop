package loops;
 
import java.util.Scanner;
 
public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        String word = scanner.nextLine();
 
        int sumLetters = 0;
        for (int i = 0; i < word.length(); i++) {
 
            char symbol = word.charAt(i);
            switch (symbol) {
                case 'a':
                    sumLetters += 1;
                    break;
                case 'e':
                    sumLetters += 2;
                    break;
                case 'i':
                    sumLetters += 3;
                    break;
                case 'o':
                    sumLetters += 4;
                    break;
                case 'u':
                    sumLetters += 5;
                    break;
            }
 
        }
        System.out.println(sumLetters);
    }
}
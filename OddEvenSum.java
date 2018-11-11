package loops;
 
import java.util.Scanner;
 
public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int n = Integer.parseInt(scanner.nextLine());
 
        int evenSum = 0;
        int oddSum = 0;
 
 
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
 
        }
         int diff = Math.abs(evenSum - oddSum);
 
        if (diff == 0) {
         System.out.printf("Yes Sum = %d", evenSum);
         } else {
         System.out.printf("No Diff = %d", diff);
        }
    }
}
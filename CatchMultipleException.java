package ExceptionHandlingBasic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchMultipleException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        do {
            try {
                System.out.println("Enter a numerator");
                int num = input.nextInt();
                System.out.println("Enter a denominator");
                int denominator = input.nextInt();

                int result = num / denominator;
                flag =false;
                System.out.println("The result of the division is " + result);
            } catch (ArithmeticException e) {
                System.out.println(e);
                input.nextLine();
                System.out.println("Try again.");
            } catch (InputMismatchException e) {
                System.out.println(e);
                input.nextLine();
                System.out.println("Try again.");
            } catch (Exception e) {
                System.out.println(e);
                input.nextLine();
                System.out.println("Try again.");
            }
        } while (flag);
    }
}
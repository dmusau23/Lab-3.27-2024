package ExceptionHandlingBasic;

import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("Enter an integer");
                int number = input.nextInt();
                System.out.println("You entered " + number);
                break;
            } catch (Exception e) {
                System.out.println("You entered an invalid type. Please an integer.");
                input.nextLine();
            }
        }while (input.hasNextInt());
    }
}

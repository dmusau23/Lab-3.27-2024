package ExceptionHandlingBasic;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeDistribution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GradeDistribution g = new GradeDistribution();
        System.out.println("Enter a grade (you can stop by entering a letter): ");
        ArrayList<Double> results =g.gradeInput(input);
        System.out.println("Grades recorded are: ");
        for(double grade : results){
            System.out.println(grade);
        }
    }

    public ArrayList<Double> gradeInput(Scanner input){
        ArrayList<Double> grades = new ArrayList<>();
        do {
            try{
                grades.add(input.nextDouble());
            }catch (InputMismatchException e){
                System.out.println(e);
            }

        }while(input.hasNextDouble());
        return grades;
    }
}

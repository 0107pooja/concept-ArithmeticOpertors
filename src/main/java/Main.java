
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        ArithmeticOperators arithmeticOperators=new ArithmeticOperators();

        System.out.println(" Enter the First number");
        int FirstNumber=sc.nextInt();


        System.out.println(" Enter the Second number");
        int SecondNumber=sc.nextInt();

        int addition=arithmeticOperators.additionOfTwoOperand(FirstNumber, SecondNumber);
        System.out.println(addition);

        int subtraction=arithmeticOperators.subtractionOfTwoOperand(FirstNumber, SecondNumber);
        System.out.println(subtraction);

        int multiplication=arithmeticOperators.multiplicationOfTwoOperand(FirstNumber, SecondNumber);
        System.out.println(multiplication);

        int division=arithmeticOperators.divisionOfTwoOperand(FirstNumber, SecondNumber);
        System.out.println(division);

    }
}

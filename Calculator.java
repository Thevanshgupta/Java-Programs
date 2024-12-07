import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to calcultor");
        System.out.println("Select the operation");
        System.out.println("add");
        System.out.println("subtract");
        System.out.println("Multiplication");
        System.out.println("division");
        int choice = scanner.nextInt();
        System.out.println("enter first number: " );
        double num1=scanner.nextDouble();
        System.out.println("enter second number");
        double num2=scanner.nextDouble();
        double result = 0;
        boolean validOperation=true;

        switch (choice) {
            case 1:
                result=num1+num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result=num1-num2;
                System.out.println("result :" +result);
                break;
            case 3:
                result=num1*num2;
                System.out.println("result:"  +result);
                break;
            case 4:
                result=num1/num2;
                System.out.println("result: " +result);
                break;
        
            default:
            System.out.println("Invalid choice! Please select a valid operation.");
            validOperation = false;
            break;
        }
        if (validOperation) {
            System.out.println("Calculation complete.");
        }
        
        scanner.close();
    }

}

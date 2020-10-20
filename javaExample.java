import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        // nextDouble() reads the next double from the keyboard
        double first = reader.nextDouble();
        double second = reader.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        long result;
        double newResult; // new line in branch 2

        switch(operator)
        {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;
                //Added newly -- beg
            case '%':
                result = first%second;
                break;
                //Added newly -- end
                
                //Added fot the new branch -- beg
             case '!'
                 result = factorial(first); //method to be implemented later
                 break;
              
                //new case added by vinay
              case '@'
                  result = factorial(first); //method to be implemented later by vinay
                  break;
                
               
                //random comment in second branch
 //Added fot the new branch -- end
            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }

        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}



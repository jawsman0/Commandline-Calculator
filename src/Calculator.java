import java.util.scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    
    double firstNumber;
    double secondNumber;
    String operation;
    double answer;
    
    while(true) {
      System.out.println("Enter your first number");
      
      if (userInput.hasNextDouble) {
        firstNumber = userInput.nextDouble();
        
        System.out.println("Please enter your second number");
        
        if (userInput.hasNextDouble) {
          System.out.println("Please enter an operation");
          
          operation = userInput.nextLine();
          
          switch(operation) {
            case "+":
              answer = firstNumber + secondNumber;
              System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + answer);
              break;
              
            case "-":
              answer = firstNumber - secondNumber;
              System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + answer);
              break;
            
            case "*":
              answer = firstNumber * secondNumber;
              System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + answer);
              break;
              
            case "/":
              answer = firstNumber / secondNumber;
              System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + answer);
              break;
              
            default:
              System.out.println("That is not a valid operation.");
          }
        }
        
        else {
          System.out.println("That is not a valid number");
        }
      }
      
      else {
        System.out.println("That is not a valid number");
      }
    }
  }
}

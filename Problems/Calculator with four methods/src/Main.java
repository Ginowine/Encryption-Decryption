// Don't delete this import statement
import java.util.Scanner;

class SimpleCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        String operator = scanner.next();
        long num2 = scanner.nextLong();

    }

    // Implement your methods here
    public static void subtractTwoNumbers(long num1, long num2){
       long result = num1 - num2;
       System.out.println(result);
    }


    public static void sumTwoNumbers(long num1, long num2){
        long result = num1 + num2;
        System.out.println(result);
    }


    public static void divideTwoNumbers(long num1, long num2){
        if (num2 == 0){
            System.out.println("Division by 0!");
        }else {
            long result = num1 / num2;
            System.out.println(result);
        }
    }


    public static void multiplyTwoNumbers(long num1, long num2){
        long result = num1 * num2;
        System.out.println(result);
    }
}
import java.util.Scanner;

public class Main {

    public static int sign(int number) {
        // write your code here
        String status;

        if (number >= 1){
            status = "+1";
        }else if (number < 0){
            status = "-1";
        }else if (number == 0){
            status = "0";
        }else {
            status = "Enter valid number";
        }

        return Integer.parseInt(status);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}
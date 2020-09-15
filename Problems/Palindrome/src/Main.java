import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        StringBuilder builder = new StringBuilder(input);
        StringBuilder reverseString = builder.reverse();

        if (reverseString.toString().equals(input)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
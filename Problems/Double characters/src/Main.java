import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        String result = "";

        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            result = result + c + c;
        }
        System.out.println(result);
    }
}

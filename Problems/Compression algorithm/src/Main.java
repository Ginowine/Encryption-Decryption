import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        char[] chars = input.toCharArray();
        StringBuilder builder =  new StringBuilder();

        int count = 1;
        char prev = chars[0];

        for (int i = 1; i < chars.length; i++){
            char current = chars[i];
            if (current == prev){
                count++;
            }else {
                builder.append(prev).append(count);
                count =1;
            }
            prev = current;
        }

        System.out.println(builder.append(prev).append(count).toString());

    }
}
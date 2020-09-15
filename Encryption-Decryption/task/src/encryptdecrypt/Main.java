package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int key = scanner.nextInt();

        String cipherText = "";
        char alphabet;

        for (int i = 0; i < input.length(); i++){
            alphabet = input.charAt(i);

            if (alphabet >= 'a' && alphabet <= 'z'){
                alphabet = (char) (alphabet + key);

                if (alphabet > 'z'){
                    alphabet = (char) (alphabet+'a'-'z'-1);
                }
                cipherText = cipherText + alphabet;
            }else if (alphabet >= 'A' && alphabet <='Z'){
                alphabet = (char) (alphabet + key);

                if (alphabet > 'Z'){
                    alphabet = (char) (alphabet+'A'-'Z'-1);
                }
                cipherText = cipherText + alphabet;
            }else {
                cipherText = cipherText + alphabet;
            }
        }
        System.out.println(cipherText);
    }
}

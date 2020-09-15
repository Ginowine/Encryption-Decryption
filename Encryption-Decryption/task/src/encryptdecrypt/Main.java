package encryptdecrypt;

import java.util.Scanner;

public class Main {

    static String cipherText = "";
    static char alphabet;
    static String targetOperation = "";
    static String input = "";
    static int key;
    static String decryptMessage = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        targetOperation = scanner.nextLine();
        input = scanner.nextLine();
        key = scanner.nextInt();
        if (targetOperation.equals("enc")){
            encryption();
        }else if (targetOperation.equals("dec")){
            decryption();
        }

        System.out.println(cipherText);
    }

    private static void decryption() {
        for (int i = 0; i < input.length(); i++){
            alphabet = input.charAt(i);
            if (alphabet >= 'a' && alphabet <= 'z'){
                alphabet = (char) (alphabet - key);
                if (alphabet < 'a'){
                    alphabet = (char) (alphabet - 'a'+'z'+1);
                }
                //decryptMessage = decryptMessage + alphabet;
                cipherText = cipherText + alphabet;
            }else if (alphabet >= 'A' && alphabet <= 'Z'){
                alphabet = (char) (alphabet - key);

                if (alphabet < 'A'){
                    alphabet = (char) (alphabet-'A'+'Z'+1);
                }
                cipherText = cipherText + alphabet;
            }else {
                cipherText = cipherText + alphabet;
            }
            //System.out.println(cipherText);
        }
    }

    public static void encryption(){
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
        //System.out.println(cipherText);
    }
}

package encryptdecrypt;

public class Main {
    public static void main(String[] args) {
        int key = 0;
        String data = "";
        String mode = "";

        for (int i = 0; i < args.length; i += 2) {
            String command = args[i];
            switch (command) {
                case "-mode":
                    mode = args[i+1];
                    break;
                case "-data":
                    data = args[i+1];
                    break;
                case "-key":
                    key = Integer.parseInt(args[i+1]);
                    break;
            }
        }

        switch (mode) {
            case "dec":
                decrypt(data, key);
                break;
            default:
                encrypt(data, key);
        }
    }
    public static void encrypt(String message, int key) {
        for (int i = 0; i < message.length(); i++) {
            int ch = message.charAt(i);
            ch += key;
            System.out.print((char) ch);
        }
    }

    public static void decrypt(String message, int key) {
        for (int i = 0; i < message.length(); i++) {
            int ch = message.charAt(i);
            ch -= key;
            System.out.print((char) ch);
        }
    }
}
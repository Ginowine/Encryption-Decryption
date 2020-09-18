package encryptdecrypt;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String operation = scanner.nextLine();
//        String message = scanner.nextLine();
//        int key = scanner.nextInt();
//        if (operation.equals("enc")) {
//            encrypt(message, key);
//        } else if (operation.equals("dec")) {
//            decrypt(message, key);
//        }

        String mode = "";
        String key = "";
        String data = "";

        for (String arg : args) {
            switch (arg) {
                case "-mode":
                    mode = args[1];
                    break;
                case "-key":
                    key = args[3];
                    break;
                case "-data":
                    data = args[5];
                    break;
            }
        }

        if (mode.equals("enc")){
            encrypt(data, Integer.parseInt(key));
        }else if (mode.equals("dec")){
            decrypt(data, Integer.parseInt(key));
        }
    }

    public static String encrypt(String msg, int key) {
        StringBuilder encryptedMessage = new StringBuilder();
        for (int i = 0; i < msg.length(); i++) {
            int index = msg.charAt(i);
            encryptedMessage.append((char) (index + key));
        }
        System.out.println(encryptedMessage);
        return encryptedMessage.toString();
    }

    public static String decrypt(String msg, int key) {
        StringBuilder encryptedMessage = new StringBuilder();
        for (int i = 0; i < msg.length(); i++) {
            int index = msg.charAt(i);
            encryptedMessage.append((char) (index - key));
        }
        System.out.println(encryptedMessage);
        return encryptedMessage.toString();
    }
}

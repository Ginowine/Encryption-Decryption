package encryptdecrypt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        int key = 0;
        String data = "";
        String mode = "";
        String readData = "";
        String writeData = "";

        //String fileUrl = "C:\\Users\\Gino\\Documents\\JavaCodes\\gino.txt";

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
                case "-in":
                    readData = args[i+1];
                    break;
                case "-out":
                    writeData = args[i+1];
                    break;
            }
        }

        switch (mode) {
            case "dec":
                decrypt(data, key);
                break;
            default:
                encrypt(data, key, readData);
        }
    }

    public static String readFileAsString(String fileName) throws IOException{
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
    public static void encrypt(String message, int key, String readFromFile) {
        String sourceOfData = "";
        try {
            sourceOfData = readFileAsString(readFromFile);
        }catch (IOException e){
            System.out.println("Cannot read file: " + e.getMessage());
        }

        if (message.isEmpty()){
            sourceOfData = sourceOfData;
        }else {
            sourceOfData = message;
        }


        for (int i = 0; i < sourceOfData.length(); i++) {
            int ch = sourceOfData.charAt(i);
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
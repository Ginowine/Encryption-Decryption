package encryptdecrypt;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    static String writeData = "";
    static String data = "";
    static String readData = "";
    public static void main(String[] args) {
        int key = 0;
        String data = "";
        String mode = "";



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
                decrypt(data, key, writeData);
                break;
            default:
                encrypt(data, key, readData);
        }
    }

    public static void encrypt(String message, int key, String readFromFile) {
        String sourceOfData = "";
        if (message.isEmpty()){
            try {
                data = readFileAsString(readFromFile);
                sourceOfData = data;
                File file = new File(writeData);
                PrintWriter printWriter = new PrintWriter(file);
                for (int i = 0; i < sourceOfData.length(); i++){
                    int ch = sourceOfData.charAt(i);
                    ch += key;
                    printWriter.write((char) ch);
                    printWriter.flush();
                    printWriter.close();
                }
            }catch (IOException e){
                System.out.println("Error writing or reading data from file: " + e.getMessage());
            }
        }else {
            sourceOfData = message;
            for (int i = 0; i < sourceOfData.length(); i++){
                int ch = sourceOfData.charAt(i);
                ch += key;
                System.out.print((char) ch);
            }
        }
    }

    public static void decrypt(String message, int key, String readDataFromFile) {
        String sourceData = "";
        if (message.isEmpty()){
            try {
                data = readFileAsString(readDataFromFile);
                sourceData = data;

                File file = new File(readData);
                PrintWriter printWriter = new PrintWriter(file);
                for (int i = 0; i < sourceData.length(); i++){
                    int ch = sourceData.charAt(i);
                    ch += key;
                    printWriter.write((char) ch);
                    printWriter.flush();
                    printWriter.close();
                }
            }catch (IOException e){
                System.out.println("Error writing or reading data from file: " + e.getMessage());
            }
        }else {
            sourceData = message;

            for (int i = 0; i < sourceData.length(); i++) {
                int ch = message.charAt(i);
                ch -= key;
                System.out.print((char) ch);
            }
        }
    }

    public static String readFileAsString(String fileName) throws IOException{
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}
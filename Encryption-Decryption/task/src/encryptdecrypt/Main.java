package encryptdecrypt;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    static String writeData = "";
    static String data = "";
    public static void main(String[] args) {
        int key = 0;
        String data = "";
        String mode = "";
        String readData = "";


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
                }
            }catch (IOException e){
                System.out.println("Cannot find one of the file: " + e.getMessage());
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

    public static void decrypt(String message, int key) {
        for (int i = 0; i < message.length(); i++) {
            int ch = message.charAt(i);
            ch -= key;
            System.out.print((char) ch);
        }
    }

//    public static void writeDataToFile(char dataToWrite, String fileToWriteTo){
//        File file = new File(fileToWriteTo);
//        try(FileWriter writer = new FileWriter(file)){
//            writer.write(dataToWrite);
//        }catch (IOException e){
//            System.out.printf("An exception occurs %s", e.getMessage());
//        }
//
////        try(PrintWriter printWriter = new PrintWriter(file)) {
////            printWriter.println(dataToWrite);
////        }catch (IOException e){
////            System.out.printf("An exception occurs %s", e.getMessage());
////        }
//    }

    public static String readFileAsString(String fileName) throws IOException{
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}
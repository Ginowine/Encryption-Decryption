import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

class Siblings {

    public static void main(String[] args) throws IOException {

        String pathToFile = "file:\\Users\\Gino\\Documents\\JavaCodes\\dataset_91007.txt";

        System.out.print(new Scanner(new URL(pathToFile).openStream(), "UTF-8")
                .tokens()
                .mapToInt(Integer::parseInt)
                .max());
//        File file = new File(pathToFile);
//        int numbers[] = new int[];
//        int max;
//
//            try(Scanner scanner = new Scanner(file);){
//            while (scanner.hasNext()){
//                for (int i = 0; i < numbers.length; i++){
//                    numbers[i] = scanner.nextInt();
//                }
//                max = numbers[0];
//                for (int i = 0; i < numbers.length; i++){
//                    if (max < numbers[i]){
//                        max = numbers[i];
//                    }
//                }
//
//                System.out.println("Maximum value:"+ max);
//
//            }
//        }catch(FileNotFoundException e){
//            System.out.println("No file found: " + pathToFile );
//        }
    }











//    public static boolean areSiblings(File f1, File f2) {
//        // implement me
//        boolean check = false;
//        if (f1.getParent().equals(f2.getParent())){
//            check = true;
//        }
//        return check;
//    }
}
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Siblings {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Gino\\Documents\\JavaCodes\\gino.txt");
        FileWriter writer = new FileWriter(file, true);
        writer.write("Never ever give up bro\n");
        writer.write("Na there you go know say God dey\n");
        writer.close();
//        int sum = 0;
//        String pathToFile = "C:\\Users\\Gino\\Documents\\JavaCodes\\dataset_91033.txt";
//        File file = new File(pathToFile);
//        Scanner scanner = new Scanner(file);
//            while (scanner.hasNext()){
//                int i = scanner.nextInt();
//                sum += i;
//            }
//        System.out.println(sum);
        }


//        System.out.print(new Scanner(new URL(pathToFile).openStream(), "UTF-8")
//                .tokens()
//                .mapToInt(Integer::parseInt)
//                .max());
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
//}
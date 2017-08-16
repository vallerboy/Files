import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Lenovo on 16.08.2017.
 */
public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Lenovo\\Desktop\\leniwiec.png");
        File file1 = new File("C:\\Users\\Lenovo\\Desktop\\leniwiec1.png");

        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            Scanner scanner =  new Scanner(file, "UTF-8");
//            while (scanner.hasNext()){
//                System.out.println(scanner.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

//        try {
//            PrintWriter writer = new PrintWriter(file);
//            for(int i = 0; i <= 10; i++) {
//                writer.println("hej!");
//            }
//            writer.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        List<Integer> integerList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);

            int text;
            while((text = fileInputStream.read()) != -1){
                 integerList.add(text);
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fileOutputStream =  new FileOutputStream(file1);
            for (Integer integer : integerList) {
                fileOutputStream.write(integer);
            }
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

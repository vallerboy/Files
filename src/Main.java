import java.io.*;
import java.util.Scanner;

/**
 * Created by Lenovo on 16.08.2017.
 */
public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Lenovo\\Desktop\\leniwiec.png");

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

        try {
            FileInputStream fileInputStream = new FileInputStream(file);

            int text;
            while((text = fileInputStream.read()) != -1){
                System.out.print((char)text);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        try {
            File obj = new File("src/main/java/Example.txt");
            Scanner x = new Scanner(obj);
            while (x.hasNextLine()) {
                String info = x.nextLine();
                System.out.println(info);
            }
            x.close();
        } catch (FileNotFoundException n) {
            System.out.println("error.");
            n.printStackTrace();
        }

    }
}

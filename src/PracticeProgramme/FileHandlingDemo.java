package PracticeProgramme;
import java.io.File;
import java.util.Scanner;

public class FileHandlingDemo {
    public static void main(String[] args) {
        try {
            File f = new File("sample.txt");
            Scanner reader = new Scanner(f);
            while(reader.hasNextLine())
                System.out.println(reader.hasNextLine());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

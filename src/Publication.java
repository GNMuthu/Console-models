
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Publication
{
    private String title;
    private String author;
    private double version;
    private double price;

    public void getData()throws IOException
    {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter the Title , Author, Version and Price");
        this.title = br.readLine();
        this.author = br.readLine();
        this.version = Double.parseDouble(br.readLine());
        this.price = Double.parseDouble(br.readLine());
    }
    public void putData()
    {
        System.out.println("Title :\t"+title+"\nAuthor Name:\t"+author+"\nVersion:\t"+version+"\nPrice:\t"+price);
        System.out.println("welcome");
    }
}

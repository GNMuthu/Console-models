import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Book extends Publication
{
private int pageCount;
private String bookType;

    @Override
    public void getData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Book Details:");
        super.getData();
        System.out.println("Enter Page Count and Book Type");
        this.pageCount = Integer.parseInt(br.readLine());
        this.bookType=br.readLine();
    }

    public void putData()
    {
        super.putData();
        System.out.println("Page Count is\t:"+pageCount+"\nBook Type\t:"+bookType);
    }
}

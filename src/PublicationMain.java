import java.io.IOException;

public class PublicationMain
{
    public static void main(String[] args)throws IOException {
        Book book1 = new Book();
//        Book book2 = new Book();
//        Book book3 = new Book();
        Video video1 = new Video();
//        Video video2 = new Video();
        book1.getData();
        video1.getData();
        book1.putData();
        video1.putData();
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class TnjSession
{
    public static void main(String[] args) throws IOException
    {
        int n,i;
        System.out.println("Enter value for N");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        ArrayList<Integer> array1 = new ArrayList<>(n);
        ArrayList<Integer> array2 = new ArrayList<>(n);
        System.out.println("Enter Elements");
        for(i=0;i<n;i++)
        {
            array1.add(Integer.valueOf(br.readLine()));
        }
        System.out.println(array1);
//        Collections.sort();


    }
}

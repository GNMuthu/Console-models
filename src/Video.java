import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Video extends Publication
{
    private double playingTimeInMins;
    private String format;

    public void getData() throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        super.getData();
        System.out.println("Enter Playing Time in Mins and Format:");
        this.playingTimeInMins = Double.parseDouble(br.readLine());
        this.format = br.readLine();
    }

    public void putData()
    {
        super.putData();
        System.out.println("Playing Time in Mins:\t"+playingTimeInMins+"\n Format:\t"+format);
    }
}

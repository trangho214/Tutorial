package Sample;

import softs.hnt.com.batda.R;

/**
 * Created by TrangHo on 24-04-2015.
 */
public class SampleObject1 {
    public  int imageId;
    public String title;
    public String price;
    public String date;


    public  SampleObject1(String title, String price, String date)
    {
        this.title = title;
        this.price = price;
        this.date = date;
        imageId = R.drawable.ic_action_github;
    }

}

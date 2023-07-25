import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
public class Check
{
    public static void check ( int Day )
    {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK); 
        int last = day - 1;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM");
        Calendar c = Calendar.getInstance();
        String Date = "01/01";
        Date = sdf.format(c.getTime());
        int diff = 0;
        try{c.setTime(sdf.parse(Date));}catch(Exception E23){;}
        if ( Day > last )
        {
            diff = Day - last;
        }
        else 
        {
            diff = Day + 7 - last;
        } 
        String dateToIncr = Date;
        String dt="";
        try {
            c.setTime(sdf.parse(dateToIncr));
        } catch ( Exception e) {
        } 
        c.add(Calendar.DAY_OF_MONTH, diff); 
        dt = sdf.format(c.getTime());
        System.out.println(dt);
    }
}

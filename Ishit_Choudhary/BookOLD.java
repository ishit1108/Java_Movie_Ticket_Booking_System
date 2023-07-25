/**import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
public class BookOLD
{
    static String Food [][] = new String [3][25];
    static
    public int book ()
    {
        Scanner Sc = new Scanner ( System.in);
        Movie M = new Movie ();
        Day D = new Day ();
        Show S = new Show ();
        Seat s = new Seat ();
        Bill B = new Bill ();
        int MovieCode = M.choice ();
        int Day = D.choice ();
        int audi;
        int time;
        int re;
        String Price [][];




        if(time==1)

        {
            System.out.println("ERROR");
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
            return 1;
        }
        else
        {
            audi = Ac.Check(MovieCode,Day,time);
            if(audi==0)
            {
                System.out.println("ERROR");
                try{
                    Thread.sleep(3000);}
                catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                System.out.print("\u000C");
                return 1;
            }
            else
            {
                Price = SSc.SelectSeat(audi,Day,time,MovieCode);
            }
        }
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
        int i = B.Bill1(Price,Food,MovieCode,dt,time,audi,Day);
        return 1;
    }
}*/
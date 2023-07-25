import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
public class Book
{
    static String Food [][] = new String [3][25];
    public int book ()
    {
        Scanner Sc = new Scanner ( System.in);
        Movie M = new Movie ();
        Day D = new Day ();
        Show_Book S = new Show_Book ();
        Seat s = new Seat ();
        Bill B = new Bill ();
        int MovieCode = 0; 
        MovieCode = M.choice ();
        int Day = 0;
        Day = D.choice ();
        int audi =0;
        int time =0;
        int re =0;
        String AT = S.Show(MovieCode,Day);
        if(AT.equals("NO")){return 1;}
        audi = Integer.valueOf(AT.substring(0,1));
        int l = AT.length();
        time = Integer.valueOf(AT.substring(1,l));
        String Price [][];
        Price = s.SelectSeat(audi,Day,time,MovieCode);
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
}
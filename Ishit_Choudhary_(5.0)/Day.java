import java.util.*;
import java.text.*;
public class Day
{
    public int choice ()
    { 
        SimpleDateFormat df = new SimpleDateFormat("dd/MM"); 
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DAY_OF_WEEK);
        day = day - 1;
        Date myDate = new Date(); 
        System.out.println("Please select the day you want to see the movie");
        System.out.println();
        if( day == 1 )
        {
            System.out.println("1. Monday  " + df.format(myDate));myDate = addDays(myDate, 1);
            System.out.println("2. Tuesday  "+ df.format(myDate));myDate = addDays(myDate, 1);
            System.out.println("3. Wednesday  "+ df.format(myDate));myDate = addDays(myDate, 1);
            System.out.println("4. Thursday  "+ df.format(myDate));myDate = addDays(myDate, 1);
            System.out.println("5. Friday  "+ df.format(myDate));myDate = addDays(myDate, 1);
            System.out.println("6. Saturday  "+ df.format(myDate));myDate = addDays(myDate, 1);
            System.out.println("7. Sunday  "+ df.format(myDate));
        }
        else if ( day == 2)
        {
            myDate = addDays(myDate, 6);
            System.out.println("1. Monday    (" +df.format(myDate)+")");myDate = new Date();
            System.out.println("2. Tuesday   ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("3. Wednesday ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("4. Thursday  ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("5. Friday    ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("6. Saturday  ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("7. Sunday    ("+ df.format(myDate)+")");
        }
        else if ( day == 3)
        {
            myDate = addDays(myDate, 5);
            System.out.println("1. Monday    (" +df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("2. Tuesday   ("+ df.format(myDate)+")");myDate = new Date();
            System.out.println("3. Wednesday ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("4. Thursday  ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("5. Friday    ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("6. Saturday  ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("7. Sunday    ("+ df.format(myDate)+")");
        }
        else if ( day == 4)
        {
            myDate = addDays(myDate, 4);
            System.out.println("1. Monday    (" +df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("2. Tuesday   ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("3. Wednesday ("+ df.format(myDate)+")");myDate = new Date();
            System.out.println("4. Thursday  ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("5. Friday    ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("6. Saturday  ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("7. Sunday    ("+ df.format(myDate)+")");
        }
        else if ( day == 5)
        {
            myDate = addDays(myDate, 3);
            System.out.println("1. Monday    (" +df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("2. Tuesday   ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("3. Wednesday ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("4. Thursday  ("+ df.format(myDate)+")");myDate = new Date();
            System.out.println("5. Friday    ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("6. Saturday  ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("7. Sunday    ("+ df.format(myDate)+")");
        }
        else if ( day == 6)
        {
            myDate = addDays(myDate, 2);
            System.out.println("1. Monday    (" +df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("2. Tuesday   ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("3. Wednesday ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("4. Thursday  ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("5. Friday    ("+ df.format(myDate)+")");myDate = new Date();
            System.out.println("6. Saturday  ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("7. Sunday    ("+ df.format(myDate)+")");
        }
        else if ( day == 0)
        {
            myDate = addDays(myDate, 1);
            System.out.println("1. Monday    (" +df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("2. Tuesday   ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("3. Wednesday ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("4. Thursday  ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("5. Friday    ("+ df.format(myDate)+")");myDate = addDays(myDate, 1);
            System.out.println("6. Saturday  ("+ df.format(myDate)+")");myDate = new Date();
            System.out.println("7. Sunday    ("+ df.format(myDate)+")");
        }
        Scanner Sc = new Scanner ( System.in );
        System.out.println("8. Exit");
        String Choice = Sc.nextLine();
        System.out.print("\u000C");
        if((Choice.equalsIgnoreCase("E"))||(Choice.equalsIgnoreCase("EXIT"))||(Choice.equalsIgnoreCase("8")))
        {
            System.out.print("\u000C");
            return -1;
        }
        return (Integer.valueOf(Choice));
    }

    public static Date addDays(Date date, int days)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return cal.getTime();
    }
}
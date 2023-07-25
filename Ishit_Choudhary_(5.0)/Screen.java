import java.util.Scanner;
public class Screen
{ 
    String Choice;
    public String Screen_1 ()
    {
        Scanner Sc = new Scanner ( System.in);
        System.out.print("\u000C");
        System.out.println("                          I CINEMAS");
        System.out.println();
        System.out.println(" A. System Update");
        System.out.println(" B. List Of Movies With Show Timings");
        System.out.println(" C. Book A Ticket");
        System.out.println(" D. Exit");
        System.out.println();
        System.out.println("Please Enter Your Choice");
        Choice = Sc.nextLine();
        System.out.print("\u000C");
        return Choice;
    }
    
    public String Screen_2 () 
    {
        Scanner Sc = new Scanner ( System.in);
        System.out.print("\u000C");
        System.out.println("                          System Update");
        System.out.println();
        System.out.println(" A. Add A New Movie");
        System.out.println(" B. Update Movie / Show Timings");
        System.out.println(" C. Delete A Movie");
        System.out.println(" D. Exit");
        System.out.println();
        System.out.println("Please Enter Your Choice");
        Choice = Sc.nextLine();
        System.out.print("\u000C");
        return Choice;
    }
    
}
        
public class Main
{

    public static void main ( String [] args ) 
    {
        String Choice;
        boolean result = false;
        Login l = new Login();
        SystemUpdate SU = new SystemUpdate();
        Show Sh = new Show ();
        Book B = new Book ();
        Screen S = new Screen ();
        int a;
        while ( true )
        {
            Choice = S.Screen_1();
            result = false;
            if(Choice.equalsIgnoreCase("A"))
            {
                SystemUpdate S_U = new SystemUpdate();
                result = l.login();
                if(result==true)
                    a = SU.systemupdate();
                else
                    System.out.print("\u000C");
                continue;
            }
            else if(Choice.equalsIgnoreCase("B"))
            {
                a = Sh.NowPlaying();
                continue;
            }
            else if(Choice.equalsIgnoreCase("C"))
            {
                a = B.book();
                continue;
            }
            else if(Choice.equalsIgnoreCase("D")||Choice.equalsIgnoreCase("E")||Choice.equalsIgnoreCase("EXIT"))
            {
                break;
            }
            else
            {
                System.out.println("Please enter a valid choice");
                continue;
            }
        }
        System.exit(0);
    }
}
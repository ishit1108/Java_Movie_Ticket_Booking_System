public class SystemUpdate
{
    public int systemupdate ()
    {
        Screen S = new Screen ();
        AddMovie AM = new AddMovie ();
        UpdateMovie UM = new UpdateMovie();
        DeleteMovie DM = new DeleteMovie();
        String Choice;
        int a = 0;
        while(true)
        {
         Choice = S.Screen_2();
            if(Choice.equalsIgnoreCase("A"))
         {
             a = AM.add();
             continue;
         }
         else if(Choice.equalsIgnoreCase("B"))
         {
             a = UM.update();
             continue;
         }
         else if(Choice.equalsIgnoreCase("C"))
         {
             a = DM.delete();
             continue;
         }
         else if(Choice.equalsIgnoreCase("D"))
         {
             break;
         }
         else if (Choice.equalsIgnoreCase("E")||Choice.equalsIgnoreCase("EXIT"))
         {
             break;
         }
         else
         {
             System.out.println("Please enter a valid choice");
             continue;
         }
        }
        return a;
    }
}
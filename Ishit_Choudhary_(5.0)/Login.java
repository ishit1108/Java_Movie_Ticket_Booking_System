import java.util.Scanner;
public class Login
{
    public boolean login ()
    {
        String ID = "ishit.choudhary5330";
        String Password = "Admin1234@ICinemas";
        String Choice;
        System.out.print("\u000C");
        Scanner Sc = new Scanner ( System.in );
        boolean result = false;
        String PasswordIN ;
        String IDIN ;
        System.out.println("Please enter USER ID:");
        outer : 
        for(int i = 0;i<=4;++i)
            {        
              IDIN = Sc.nextLine();
              System.out.print("\u000C");
              if(IDIN.equalsIgnoreCase(ID))
              {
                 System.out.print("\u000C");
                 System.out.println("Please enter password");
                 inner :
                 for(int i2 = 0;i2<=3;++i2)
                    {
                      PasswordIN = Sc.nextLine();
                      System.out.print("\u000C");
                        if(PasswordIN.equals(Password))
                      {
                         result = true;
                         System.out.println("USER VERIFIED");
                          try{
                           Thread.sleep(3000);}
                          catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                         System.out.print("\u000C");
                         break outer;
                        }                                        
                        else if (PasswordIN.equalsIgnoreCase("EXIT"))
                        {
                           System.out.println("Verification Failed");
                        try{
                        Thread.sleep(3000);}
                        catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                        System.out.print("\u000C");
                         return result;
                        }
                        else if(PasswordIN.equalsIgnoreCase("E"))
                         {
                           System.out.print("\u000C"); 
                           break outer;
                        }
                        else
                        {
                           System.out.println("Wrong password");
                        }
                      System.out.println("Please enter password again");
                      if(i2==2)
                      {
                        System.out.print("\u000C");
                        System.out.println("Too many incorrect tries");
                        System.out.println("System locked ");
                        System.out.println("System will resume after a few moments");
                        System.out.println("Please do not enter anything, doing so will close the program");
                          try{
                        Thread.sleep(10000);}
                        catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                        i2 = 0;
                        System.out.println("Enter 'E' to exit the program");
                        System.out.println("Enter any character to continue");
                        Choice = Sc.next();
                        System.out.print("\u000C");
                        if(Choice.equalsIgnoreCase("E"))
                         {
                           System.out.print("\u000C"); 
                           break outer;
                        }
                        else if (Choice.equalsIgnoreCase("EXIT"))
                        {
                           System.out.println("Verification Failed");
                          try{
                          Thread.sleep(3000);}
                          catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                          System.out.print("\u000C");
                          return result;
                        }
                        else
                        {
                            continue inner;
                        }
                      }
                    }
                }
                else if (IDIN.equalsIgnoreCase("EXIT"))
                {
                    System.out.println("Verification Failed");
                   try{
                        Thread.sleep(3000);}
                        catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                        System.out.print("\u000C");
                   return result;
                    
                }
                else if (IDIN.equalsIgnoreCase("E"))
                {
                    System.out.println("Verification Failed");
                   try{
                        Thread.sleep(3000);}
                        catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                        System.out.print("\u000C");
                    return result;
                    
                }
                else
                {
                   {
                           System.out.println("Wrong USER ID");
                        }
                   System.out.println("Please enter USER ID again");
                   if(i==2)
                      {
                        System.out.print("\u000C");
                        System.out.println("Too many incorrect tries");
                        System.out.println("System locked ");
                        System.out.println("System will resume after a few moments");
                        System.out.println("Please do not enter anything, doing so will close the program");
                          try{
                        Thread.sleep(30000);}
                        catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                        i = 0;
                        System.out.println("Enter 'E' to exit program");
                        System.out.println("Enter any character to continue");
                        Choice = Sc.next();
                        System.out.print("\u000C");
                        if(Choice.equalsIgnoreCase("E"))
                        {System.out.print("\u000C");
                         break outer;
                        }
                        else if (Choice.equalsIgnoreCase("EXIT"))
                        {
                           System.out.println("Verification Failed");
                          try{
                          Thread.sleep(3000);}
                          catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                          System.out.print("\u000C");
                           return result;
                        }
                        
                        else 
                        {
                            continue outer;
                        }             
                      }
                    }
                }
        if(result==false)
        {
            System.out.println("Verification Failed");
           try{
                        Thread.sleep(3000);}
                        catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                        System.out.print("\u000C");
                        
                    }
                    else if (result==true)
                    {
                        ;
                    }
                    return result;
            }
            
        }
import java.util.Scanner;
import java.io.*;
public class Show
{
    public int NowPlaying ( )
    {
        Scanner Sc = new Scanner ( System.in );
        String Choice;
        int temp = -1;
        char a = 'A';
        String b = a+". ";
        int arr [] = new int [50];
        String code;
        Outer :
        while ( true )
        {
            Store s = null;
            try {
                FileInputStream fileIn = new FileInputStream("Data.txt");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                s = (Store) in.readObject();
                in.close();
                fileIn.close();
            }catch(IOException i) {
                i.printStackTrace();
                System.out.println("Store not found : ERROR 002");
                try{
                    Thread.sleep(3000);}
                catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                System.out.print("\u000C");
                return 1;
            }catch(ClassNotFoundException c) {
                System.out.println("Store not found : ERROR 002");
                c.printStackTrace();
                try{
                    Thread.sleep(3000);}
                catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                System.out.print("\u000C");
                return 1;
            }
            for ( int i = 0; i<50;++i)
            {
                arr[i]=-1;
            }
            for ( int i =0,j=0,c=0,d=0;c<49;++c)
            {
                if(!s.movieList[i][j].equals(""))
                {
                    if((j==0) && (i>0))
                    {
                        System.out.print(b);
                        ++a;
                        b=a+". ";
                        arr[d]=i;
                        ++d;
                    }
                    else
                    {

                    }
                    System.out.print(s.movieList[i][j]+"\t");
                    System.out.print("\t|");
                    if(j==2)
                    {
                        ++i;
                        j=0;
                        System.out.println();
                    }
                    else
                    {
                        ++j;
                    }
                }
                else
                {
                    ++i;
                }
            }
            System.out.println();
            System.out.println("Please enter the movie you want to see the timings for");
            System.out.println("Enter \"EXIT\" to exit");
            Choice = Sc.nextLine();
            System.out.print("\u000C");
            if((Choice.equalsIgnoreCase("EXIT")))
            {
                System.out.print("\u000C");
                return 1;
            }
            else 
                ;
            a = 'A';
            in :
            for(int i = 0;i<50;++i)
            {
                b = a+"";
                if(Choice.equalsIgnoreCase(b))
                {
                    temp = arr[i];
                    break in;
                }
                else
                {
                    ++a;
                }
            }
            if(temp == -1)
            {
                System.out.println("ERROR:200");
                try{
                    Thread.sleep(3000);}
                catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                System.out.print("\u000C");
                continue Outer;
            }
            else
            {
                System.out.print("\u000C"); 
            }
            code = s.movieList[temp][3];
            Inner :
            while ( true )
            {
                System.out.print(" Mavie: "+s.movieList[temp][0]+" | Language: "+s.movieList[temp][1]);
                System.out.print(" | Duration: "+s.movieList[temp][2]+" mins");
                System.out.println();
                System.out.println("Please enter the day for which you want to see the timings");
                System.out.println("1. Monday");
                System.out.println("2. Tuesday");
                System.out.println("3. Wednesday");
                System.out.println("4. Thursday");
                System.out.println("5. Friday");
                System.out.println("6. Saturday");
                System.out.println("7. Sunday");
                System.out.println("8. Exit");
                Choice = Sc.nextLine();
                System.out.print("\u000C");
                if((Choice.equalsIgnoreCase("E"))||(Choice.equalsIgnoreCase("EXIT"))||(Choice.equalsIgnoreCase("8")))
                {
                    System.out.print("\u000C");
                    continue Outer;
                }

                if(Choice.equalsIgnoreCase("Monday")||Choice.equalsIgnoreCase("1"))
                {

                    for(int i = 0;i<2359;++i)
                    {    if((s.D1 [i][1]).startsWith(code+".S"))
                            System.out.println("-> Audi:1    Time:"+i+" Hrs.");
                        else
                            ;
                        if((s.D1 [i][2]).startsWith(code+".S"))
                            System.out.println("-> Audi:2    Time:"+i+" Hrs.");
                        else
                            ;
                        if((s.D1 [i][3]).startsWith(code+".S"))
                            System.out.println("-> Audi:3    Time:"+i+" Hrs.");
                        else
                            ;

                    }
                    System.out.println("Enter any character to exit");
                    Choice = Sc.nextLine();
                    Choice = "ERROR";
                    System.out.print("\u000C");
                    continue Inner;
                }
                else if(Choice.equalsIgnoreCase("Tuesday")||Choice.equalsIgnoreCase("2"))
                {
                    for(int i = 0;i<2359;++i)
                    {   if((s.D2 [i][1]).startsWith(code+".S"))
                            System.out.println("-> Audi:1    Time:"+i+" Hrs.");
                        else
                            ;
                        if((s.D2 [i][2]).startsWith(code+".S"))
                            System.out.println("-> Audi:2    Time:"+i+" Hrs.");
                        else
                            ;
                        if((s.D2 [i][3]).startsWith(code+".S"))
                            System.out.println("-> Audi:3    Time:"+i+" Hrs.");
                        else
                            ;

                    }
                    System.out.println("Enter any character to exit");
                    Choice = Sc.nextLine();
                    Choice = "ERROR";
                    System.out.print("\u000C");
                    continue Inner;
                }
                else if(Choice.equalsIgnoreCase("Wednesday")||Choice.equalsIgnoreCase("3"))
                {
                    for(int i = 0;i<2359;++i)
                    {   if((s.D3 [i][1]).startsWith(code+".S"))
                            System.out.println("-> Audi:1    Time:"+i+" Hrs.");
                        else
                            ;
                        if((s.D3 [i][2]).startsWith(code+".S"))
                            System.out.println("-> Audi:2    Time:"+i+" Hrs.");
                        else
                            ;
                        if((s.D3 [i][3]).startsWith(code+".S"))
                            System.out.println("-> Audi:3    Time:"+i+" Hrs.");
                        else
                            ;

                    }
                    System.out.println("Enter any character to exit");
                    Choice = Sc.nextLine();
                    Choice = "ERROR";
                    System.out.print("\u000C");
                    continue Inner;
                }
                else if(Choice.equalsIgnoreCase("Thursday")||Choice.equalsIgnoreCase("4"))
                {
                    for(int i = 0;i<2359;++i)
                    {   if((s.D4 [i][1]).startsWith(code+".S"))
                            System.out.println("-> Audi:1    Time:"+i+" Hrs.");
                        else
                            ;
                        if((s.D4 [i][2]).startsWith(code+".S"))
                            System.out.println("-> Audi:2    Time:"+i+" Hrs.");
                        else
                            ;
                        if((s.D4 [i][3]).startsWith(code+".S"))
                            System.out.println("-> Audi:3    Time:"+i+" Hrs.");
                        else
                            ;

                    }
                    System.out.println("Enter any character to exit");
                    Choice = Sc.nextLine();
                    Choice = "ERROR";
                    System.out.print("\u000C");
                    continue Inner;
                }
                else if(Choice.equalsIgnoreCase("Friday")||Choice.equalsIgnoreCase("5"))
                {
                    for(int i = 0;i<2359;++i)
                    {   if((s.D5 [i][1]).startsWith(code+".S"))
                            System.out.println("-> Audi:1    Time:"+i+" Hrs.");
                        else
                            ;
                        if((s.D5 [i][2]).startsWith(code+".S"))
                            System.out.println("-> Audi:2    Time:"+i+" Hrs.");
                        else
                            ;
                        if((s.D5 [i][3]).startsWith(code+".S"))
                            System.out.println("-> Audi:3    Time:"+i+" Hrs.");
                        else
                            ;

                    }
                    System.out.println("Enter any character to exit");
                    Choice = Sc.nextLine();
                    Choice = "ERROR";
                    System.out.print("\u000C");
                    continue Inner;
                }
                else if(Choice.equalsIgnoreCase("Saturday")||Choice.equalsIgnoreCase("6"))
                {
                    for(int i = 0;i<2359;++i)
                    {   if((s.D6 [i][1]).startsWith(code+".S"))
                            System.out.println("-> Audi:1    Time:"+i+" Hrs.");
                        else
                            ;
                        if((s.D6 [i][2]).startsWith(code+".S"))
                            System.out.println("-> Audi:2    Time:"+i+" Hrs.");
                        else
                            ;
                        if((s.D6 [i][3]).startsWith(code+".S"))
                            System.out.println("-> Audi:3    Time:"+i+" Hrs.");
                        else
                            ;

                    }
                    System.out.println("Enter any character to exit");
                    Choice = Sc.nextLine();
                    Choice = "ERROR";
                    System.out.print("\u000C");
                    continue Inner;
                }
                else if(Choice.equalsIgnoreCase("Sunday")||Choice.equalsIgnoreCase("7"))
                {
                    for(int i = 0;i<2359;++i)
                    {   if((s.D7 [i][1]).startsWith(code+".S"))
                            System.out.println("-> Audi:1    Time:"+i+" Hrs.");
                        else
                            ;
                        if((s.D7 [i][2]).startsWith(code+".S"))
                            System.out.println("-> Audi:2    Time:"+i+" Hrs.");
                        else
                            ;
                        if((s.D7 [i][3]).startsWith(code+".S"))
                            System.out.println("-> Audi:3    Time:"+i+" Hrs.");
                        else
                            ;

                    } 
                    System.out.println("Enter any character to exit");
                    Choice = Sc.nextLine();
                    Choice = "ERROR";
                    System.out.print("\u000C");
                    continue Inner;
                }     
                else
                {    System.out.println("ERROR");
                    try{
                        Thread.sleep(3000);}
                    catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                    System.out.print("\u000C");

                }
                try {
                    FileOutputStream fileOut =
                        new FileOutputStream("Data.txt");
                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                    out.writeObject(s);
                    out.close();
                    fileOut.close();
                    System.out.print("\u000C");
                    System.out.printf("");
                }catch(IOException i) {
                    i.printStackTrace();
                    System.out.printf("ERROR 000");
                    try{
                        Thread.sleep(3000);}
                    catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                    System.out.print("\u000C");
                    continue Outer;
                }
            }
        }
    }
}


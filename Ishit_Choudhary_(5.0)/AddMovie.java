import java.util.Scanner;
import java.io.*;
public class AddMovie
{
    public int add ()
    {
        Scanner Sc = new Scanner ( System.in );
        String Choice;
        String Movie;
        String Language;
        String Duration;
        int temp = -1;
        int temp2 = -1;
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
        outer :
        while(true)
        {
            System.out.println("Please enter the name of the movie, to be added");
            Movie = Sc.nextLine();
            System.out.print("\u000C");
            if((Movie.equalsIgnoreCase("E"))||(Movie.equalsIgnoreCase("EXIT")))
            {
                return 1;
            }
            else 
                ;
            inner :
            for(int i = 0;i<50;++i)
            {
                if((Movie).equalsIgnoreCase(s.movieList[i][0]))
                {
                    System.out.println("This Movie is already playing");
                    System.out.println("A. Add Anyway");
                    System.out.println("B. Overwrite Movie");
                    System.out.println("c. Cancel");
                    Choice = Sc.nextLine();
                    if(Choice.equalsIgnoreCase("a"))
                    {
                        break inner;
                    }
                    else if (Choice.equalsIgnoreCase("B"))
                    {
                        temp2 = i;
                        break inner;
                    }
                    else if (Choice.equalsIgnoreCase("C"))
                    {
                        return 1;
                    }
                    else
                    {
                        System.out.println("Key not found");
                    }
                    try{
                        Thread.sleep(3000);}
                    catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                    System.out.print("\u000C");
                    continue outer;
                }
                else
                    ;
            }

            for(int i = 0;i<50;++i)
            {
                if("".equals((s.movieList[i][0])))
                {temp = i;
                    break;
                }
                else
                    ;
            }

            if(temp == -1 )
            {
                System.out.println("No space available");
                try{
                    Thread.sleep(3000);}
                catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                System.out.print("\u000C");              
                return 1;
            }
            else
                ;
            System.out.print("\u000C");
            System.out.println("Please enter the language");
            Language = Sc.nextLine();
            System.out.print("\u000C");
            if(Language.equalsIgnoreCase("E")||Language.equalsIgnoreCase("EXIT"))
            {
                return 1;
            }
            else 
                ;
            System.out.println("Please enter the duration of the movie in minutes");
            Duration = Sc.nextLine();
            System.out.print("\u000C");
            if(Duration.equalsIgnoreCase("E")||Duration.equalsIgnoreCase("EXIT"))
            {
                return 1;
            }
            else 
                break outer;
        }
        if(temp2 == -1 )
        { 
            s.movieList[temp][0] = Movie;
        }
        else
        {
            s.movieList[temp2][0] = Movie;
        }    
        s.movieList[temp][1] = Language;
        s.movieList[temp][2] = Duration;
        s.movieList[temp][3] = Integer.toString(s.code);
        s.code = s.code+1;
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
            return 1;
        }
        System.out.println("Movie Sucessfully stored");
        System.out.println("Please update/add movie show timings in Update Movie/Show Timings section"); 
        try{
            Thread.sleep(3000);}
        catch ( InterruptedException ex){Thread.currentThread().interrupt();}
        System.out.print("\u000C");
        return 1;
    }
}

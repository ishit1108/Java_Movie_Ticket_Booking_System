import java.util.Scanner;
import java.io.*;
public class DeleteMovie
{    
    public int delete ()
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
        Scanner Sc = new Scanner ( System.in );
        String Choice;
        char a = 'A';
        String b = a+". " ;
        int arr [] = new int [50];
        for(int i = 0;i<50;++i)
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
        System.out.println("Please enter the movie you want to delete");
        Choice = Sc.nextLine();
        System.out.print("\u000C");
        if(Choice.equalsIgnoreCase("EXIT"))
        {
            return 1;
        }
        else 
            ;
        a = 'A';
        int temp = -1;
        for(int i = 0;i<50;++i)
        {
            b = a+"";
            if(Choice.equalsIgnoreCase(b))
            {
                temp = arr[i];
                break;
            }
            else
            {
                ++a;
            }
        }
        if(temp != -1 )
        {
            System.out.println("Are you sure you want to delete "+(s.movieList[temp][0])+" ?");
            System.out.println("A. Yes");
            System.out.println("B. No, exit this menu");
            Choice = Sc.nextLine();
        }
        else
        {
            System.out.println("ERROR:200");
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
            return 1;
        }
        if(Choice.equalsIgnoreCase("A")||Choice.equalsIgnoreCase("YES"))
        {
            ;  
        }
        else if(Choice.equalsIgnoreCase("b")||Choice.equalsIgnoreCase("No"))
        {
            System.out.println("Movie Not deleted");
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
            return 1;
        }
        else if(Choice.equalsIgnoreCase("e")||Choice.equalsIgnoreCase("exit"))
        {
            System.out.println("Movie Not deleted");
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
            return 1;
        }
        else 
        {
            System.out.println("Key not found");
            System.out.println("Movie Not deleted");
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
            return 1;
        }
        s.movieList[temp][1] = "";
        s.movieList[temp][2] = "";
        s.movieList[temp][0] = "";
        s.movieList[temp][3] = "";
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
        System.out.println("Movie sucessfully deleted");
        try{
            Thread.sleep(3000);}
        catch ( InterruptedException ex){Thread.currentThread().interrupt();}
        System.out.print("\u000C");
        return 1;
    }
}
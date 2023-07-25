import java.util.Scanner;
import java.io.*;
public class Movie
{    
    public int choice ()
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
                System.out.print(s.movieList[i][j]+"\t|");
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
        System.out.println("Please enter the movie ");
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
        //return Integer.valueOf(s.movieList[temp][3]);
        return temp;
    }
}
        
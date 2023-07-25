
import java.util.Scanner;
import java.io.*;
public class UpdateMovie 
{
    public int update ()
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
        int temp = -1;
        char a = 'A';
        String b = a+". ";
        int arr [] = new int [50];
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
        System.out.println("Please enter the movie you want to Update ");
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
        if(temp == -1)
        {
            System.out.println("ERROR:200");
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
            return 1;
        }
        else
        {
            System.out.print("\u000C"); 
        }
        int temp2 = Integer.valueOf(s.movieList[temp][3]);
        int temp3 = Integer.valueOf(s.movieList[temp][2]);

        System.out.print(" Mavie: "+s.movieList[temp][0]+" | Language: "+s.movieList[temp][1]);
        System.out.print(" | Duration: "+s.movieList[temp][2]+" mins");
        System.out.println();
        System.out.println("A. Edit movie Name/ Language/ Duration");
        System.out.println("B. Show existing movie timings");
        System.out.println("C. Add Shows");
        System.out.println("D. Delete Shows");
        Choice = Sc.nextLine();
        System.out.print("\u000C");
        Update U = new Update (); 
        int hi;
        if((Choice.equalsIgnoreCase("E"))||(Choice.equalsIgnoreCase("EXIT")))
        {
            System.out.print("\u000C");
            return 1;
        }
        else if (Choice.equalsIgnoreCase("A"))
        {
            hi = U.Edit(temp);
            return 1;
        }
        else if (Choice.equalsIgnoreCase("B"))
        {
            hi = U.ShowTime(temp2);
            return 1;
        }
        else if (Choice.equalsIgnoreCase("C"))
        {
            hi = U.AddShow(temp2,temp3);
            return 1;
        }
        else if (Choice.equalsIgnoreCase("D"))
        {
            hi = U.DeleteShow(temp2);
            return 1;
        }
        else 
        {
            System.out.println("ERROR:506");
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
            return 1;
        }    
    }
}
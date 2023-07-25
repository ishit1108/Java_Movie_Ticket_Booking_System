import java.io.*;
import java.util.Scanner;
public class Seat
{
    public  String [][] SelectSeat ( int Audi,int Day, int time, int code)
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
            String ar[][] = {};
            return ar;
        }catch(ClassNotFoundException c) {
            System.out.println("Store not found : ERROR 002");
            c.printStackTrace();
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
            String ar[][] = {};
            return ar;
        }
        Scanner Sc = new Scanner ( System.in );
        System.out.println("Please enter the number of seats that you want");
        int no = Sc.nextInt();
        no = no+1;
        Print P = new Print ();
        Price Pr = new Price ();
        int catchreturn;
        catchreturn = P.print( Audi, time, code, Day);
        System.out.println("Please select your seats (Format:A1");
        System.out.println("                                 A2");
        System.out.println("                                 A3");
        System.out.println("                                 e.t.c)");
        String Ch ="";
        String Store5 [] = new String [no];
        for(int i = 0 ; i < no ; ++i )
        {
            Ch = Sc.nextLine();
            if((Ch.equalsIgnoreCase("Exit"))||(Ch.equalsIgnoreCase("E")))
            {
                String Hi [][] = {};
                return (Hi);
            }
            Store5 [i] = Ch;
        }
        String PriceList [][] = new String [2][no];
        PriceList = Pr.price(Store5,Audi,no);
        Food F = new Food ();
        Book B = new Book ();
        try{
            B.Food = F.foodlist();
        }
        catch ( Exception E ) { ; }
        return (PriceList);
    }
}

            
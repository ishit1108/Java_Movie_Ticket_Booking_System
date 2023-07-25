/**import java.io.*;
import java.util.Scanner;
public class SeatChoice
{
    public String [][] SelectSeat ( int Audi,int Day, int time, int code)
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
        Availiblity2 AA = new Availiblity2();
        Availiblity3 AAA = new Availiblity3();
        DeCode D = new DeCode ();
        Price Pr = new Price ();
        String Arr [] ;
        if(Audi==1)
            {   
                Arr = new String [96];
                if(Day==1)
                { for(int i = time,j=0;j<96;++j){
                        Arr [j] = s.bookedA1Monday[i][j];
                        Arr [j] = D.Decode(Arr[j],1);
                    } 
                    P.print(1,Arr);
                }
                else if(Day==2)
                { for(int i = time,j=0;j<96;++j){
                        Arr [j] = s.bookedA1Tuesday[i][j];
                        Arr [j] = D.Decode(Arr[j],1);
                    } 
                    P.print(1,Arr);
                }
                else if(Day==3)
                { for(int i = time,j=0;j<96;++j){
                        Arr [j] = s.bookedA1Wednusday[i][j];
                        Arr [j] = D.Decode(Arr[j],1);
                    } 
                    P.print(1,Arr);
                }
                else if(Day==4)
                { for(int i = time,j=0;j<96;++j){
                        Arr [j] = s.bookedA1Thursday[i][j];
                        Arr [j] = D.Decode(Arr[j],1);
                    } 
                    P.print(1,Arr);
                }
                else if(Day==5)
                { for(int i = time,j=0;j<96;++j){
                        Arr [j] = s.bookedA1Friday[i][j];
                        Arr [j] = D.Decode(Arr[j],1);
                    } 
                    P.print(1,Arr);
                }
                else if(Day==6)
                { for(int i = time,j=0;j<96;++j){
                        Arr [j] = s.bookedA1Saturday[i][j];
                        Arr [j] = D.Decode(Arr[j],1);
                    } 
                    P.print(1,Arr);
                }
                else if(Day==7)
                { for(int i = time,j=0;j<96;++j){
                        Arr [j] = s.bookedA1Sunday[i][j];
                        Arr [j] = D.Decode(Arr[j],1);
                    } 
                    P.print(1,Arr);
                }
                else
                {;}
            }
            else if ( Audi == 2 )
            {
                Arr = new String [96];
                if(Day==1)
                { for(int i = time,j=0;j<96;++j){
                        Arr [j] = s.bookedA2Monday[i][j];
                        Arr [j] = D.Decode(Arr[j],1);
                    } 
                    P.print(1,Arr);
                }
                else if(Day==2)
                { for(int i = time,j=0;j<96;++j){
                        Arr [j] = s.bookedA2Tuesday[i][j];
                        Arr [j] = D.Decode(Arr[j],1);
                    } 
                    P.print(1,Arr);
                }
                else if(Day==3)
                { for(int i = time,j=0;j<96;++j){
                        Arr [j] = s.bookedA2Wednusday[i][j];
                        Arr [j] = D.Decode(Arr[j],1);
                    } 
                    P.print(1,Arr);
                }
                else if(Day==4)
                { for(int i = time,j=0;j<96;++j){
                        Arr [j] = s.bookedA2Thursday[i][j];
                        Arr [j] = D.Decode(Arr[j],1);
                    } 
                    P.print(1,Arr);
                }
                else if(Day==5)
                { for(int i = time,j=0;j<96;++j){
                        Arr [j] = s.bookedA2Friday[i][j];
                        Arr [j] = D.Decode(Arr[j],1);
                    } 
                    P.print(1,Arr);
                }
                else if(Day==6)
                { for(int i = time,j=0;j<96;++j){
                        Arr [j] = s.bookedA2Saturday[i][j];
                        Arr [j] = D.Decode(Arr[j],1);
                    } 
                    P.print(1,Arr);
                }
                else if(Day==7)
                { for(int i = time,j=0;j<30;++j){
                        Arr [j] = s.bookedA3Sunday[i][j];
                        Arr [j] = D.Decode(Arr[j],1);
                    } 
                    P.print(1,Arr);
                }
                else
                {;}
            }
            else if ( Audi == 3 )
            {
                Arr = new String [30];
                if(Day==1)
                { for(int i = time,j=0;j<30;++j){
                        Arr [j] = s.bookedA3Monday[i][j];
                        Arr [j] = D.Decode(Arr[j],3);
                    } 
                    P.print(3,Arr);
                }
                else if(Day==2)
                { for(int i = time,j=0;j<30;++j){
                        Arr [j] = s.bookedA3Tuesday[i][j];
                        Arr [j] = D.Decode(Arr[j],3);
                    } 
                    P.print(3,Arr);
                }
                else if(Day==3)
                { for(int i = time,j=0;j<30;++j){
                        Arr [j] = s.bookedA3Wednusday[i][j];
                        Arr [j] = D.Decode(Arr[j],3);
                    } 
                    P.print(3,Arr);
                }
                else if(Day==4)
                { for(int i = time,j=0;j<30;++j){
                        Arr [j] = s.bookedA3Thursday[i][j];
                        Arr [j] = D.Decode(Arr[j],3);
                    } 
                    P.print(3,Arr);
                }
                else if(Day==5)
                { for(int i = time,j=0;j<30;++j){
                        Arr [j] = s.bookedA3Friday[i][j];
                        Arr [j] = D.Decode(Arr[j],3);
                    } 
                    P.print(3,Arr);
                }
                else if(Day==6)
                { for(int i = time,j=0;j<30;++j){
                        Arr [j] = s.bookedA3Saturday[i][j];
                        Arr [j] = D.Decode(Arr[j],3);
                    } 
                    P.print(1,Arr);
                }
                else if(Day==7)
                { for(int i = time,j=0;j<30;++j){
                        Arr [j] = s.bookedA3Sunday[i][j];
                        Arr [j] = D.Decode(Arr[j],3);
                    } 
                    P.print(3,Arr);
                }
                else
                {;}
            }
        
        System.out.println("Please select your seats (Format:A1");
        System.out.println("                                 A2");
        System.out.println("                                 A3");
        System.out.println("                                 e.t.c)");
        boolean ch = true;
        String Ch ="";
        String Store5 [] = new String [no];
        outer:
        for(int i = 0 ; i < no ; ++i )
        {
            Ch = Sc.nextLine();
            Store5 [i] = Ch;
        }
        ch = AAA.CheckBooked(Day,time,Audi,Ch);
        if((Ch.equalsIgnoreCase("Exit"))||(Ch.equalsIgnoreCase("E")))
        {
            String Hi [][] = {};
            return (Hi);
        }
        if(ch==false)
        {
            System.out.println("Seat Already Booked");
            System.out.println("Please try again");
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
            String hi[][] = {};
            return hi;
        }
        else
        {
              ;
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
*/
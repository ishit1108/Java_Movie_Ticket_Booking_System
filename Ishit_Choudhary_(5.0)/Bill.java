import java.util.Scanner;
import java.io.*;
public class Bill
{
    public int Bill1 ( String seat [][],String food [][], int code,String date,int time,int audi,int Day)
    {
        Scanner Sc = new Scanner ( System.in );
        Store s = null;
        System.out.print("\u000C");
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
        System.out.println("Movie: "+s.movieList[code][0]);
        System.out.println("Language: "+s.movieList[code][1]);
        System.out.println("Duration: "+s.movieList[code][2]+"mins");
        System.out.println("Date: "+date);
        System.out.println("Time: "+time);
        System.out.println("Audi: "+audi);
        System.out.print("Seats: ");
        int Price = 0;
        for(int i = 0 ; i<96 ; ++i )
        {
            try{if(seat [0][i].equals("")||seat [0][i].equals(null)){;}
                else{
                    System.out.print(seat [0][i]+"  ");
                    Price = Price + Integer.valueOf(seat [1][i]);
                }}catch(Exception E){;}
        }
        System.out.println();
        try{
            if(food [0][0].equals("")||food [0][0].equals(null))
            {;}
            else
            {
                System.out.println("Food:");
                for(int i = 0 ; i<25 ; ++i )
                {

                    if(food [2][i].equalsIgnoreCase(null) && food [0][i].equalsIgnoreCase(null))
                    {
                        ;
                    }
                    else
                    {
                        System.out.print(food [0][i]);
                        System.out.print(" : X"+food [2][i]);
                        Price = Price + (Integer.valueOf(food [1][i])*Integer.valueOf(food [2][i]));
                    }
                    System.out.println();
                }
            }    
        }catch(Exception E){;}
        System.out.println();
        System.out.println("Internet Booking Charges : Rs.100");
        Price = Price + 100;
        System.out.println("Tax (28%) : Rs."+((Price/100)*28));
        Price = Price + ((Price/100)*28);
        System.out.println("Grand Total : Rs."+Price);
        System.out.println();
        System.out.println("1. Confirm");
        System.out.println("2. Cancel");        
        int Choice = Sc.nextInt();
        if ( Choice == 1 ) { 
            Choice = Payment(Price);
            if ( Choice == 0 )
            {
                return 0;
            }
            else
            {
                Choice = Bill2(seat,food,code,date,time,audi,Day);
                return 1;
            }
        }
        else
        {
            return 0;
        }
    }

    public static int Payment ( int Price )
    {
        outer:
        while ( true )
        {
            System.out.print("\u000C");
            Scanner Sc = new Scanner ( System.in ) ;
            System.out.println("Please enter Payment option");
            System.out.println("1. Credit Card");
            System.out.println("2. Debit Card");
            int x = Sc.nextInt();
            if(x==1){;}else if (x==2){;} else{ continue outer;}
            int l =0;
            inner:
            while(true)
            {
                System.out.print("\u000C");
                System.out.println("Please enter yuor 16 digit account number");
                String x2 = Sc.next();
                l = x2.length();
                if((x2.equalsIgnoreCase("Exit"))||(x2.equalsIgnoreCase("E"))){return 0;}
                else if( (l < 16)||(l>16) ){
                    System.out.println("16 digit account number not valid");
                    System.out.println("Please try again");
                    System.out.println("Enter \"EXIT\" to exit");
                    try{Thread.sleep(3000);}
                    catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                    continue inner;}else{;}
                inner2:
                while(true)
                {
                    System.out.print("\u000C");
                    System.out.println("Please enter expiry date of card in format MMYY");
                    x2 = Sc.next();
                    l = x2.length();
                    if((x2.equalsIgnoreCase("Exit"))||(x2.equalsIgnoreCase("E"))){return 0;}
                    else if( (l < 4)||(l>4) ){
                        System.out.println("Expiry date not valid");
                        System.out.println("Please try again");
                        System.out.println("Enter \"EXIT\" to exit");
                        try{Thread.sleep(3000);}
                        catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                        continue inner2;} else{;}
                    System.out.print("\u000C");
                    System.out.println("Please enter name on the card");
                    x2 = Sc.nextLine();
                    inner3:
                    while(true)
                    {
                        System.out.print("\u000C");
                        System.out.println("Please enter the three digit cvv number of your card");
                        x2 = Sc.next();
                        l = x2.length();
                        if((x2.equalsIgnoreCase("Exit"))||(x2.equalsIgnoreCase("E"))){return 0;}
                        else if( (l < 3)||(l>3) ){System.out.println("3 digit cvv number not valid");
                            System.out.println("Please try again");
                            System.out.println("Enter \"EXIT\" to exit");
                            try{Thread.sleep(3000);}
                            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                            continue inner3;} else{;}
                        System.out.print("\u000C");
                        System.out.println("1. Confirm Payment of Rs."+Price);
                        System.out.println("2. Cancel Payment");
                        l = Sc.nextInt();
                        if( l == 2 ){return 0;} else {;}
                        inner4:
                        while(true)
                        {
                            System.out.print("\u000C");
                            double con = Math.random();
                            l = (int) (con*1000000);
                            System.out.println(l);
                            System.out.println("Please enter the above numbers for security check");
                            x = Sc.nextInt();
                            if(l==x){break outer;}else{
                                System.out.println("Security code did not match");
                                System.out.println("Please try again");
                                try{Thread.sleep(3000);}
                                catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                                continue inner4;}
                        }
                    }
                }
            }
        }
        return 1;
    }

    public static int Bill2(String seat[][],String food[][],int code,String date,int time,int audi,int Day)
    {
        /**  try {*/Scanner Sc = new Scanner ( System.in);
        System.out.print("\u000C");
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
        System.out.println("Please wait a moment while we prepare your tickets");
        try{
            Thread.sleep(3000);}
        catch ( InterruptedException ex){Thread.currentThread().interrupt();}
        System.out.print("\u000C");
        int bk = (int) (Math.random()*100000000);
        int i = 0;
        String Seeeeet;
        outer:
        while ( true )
        {
            try {
                i=i+1;
                System.out.println("          I Cinemas ");
                Seeeeet = seat [0][i];
                System.out.println("");
                System.out.println("Movie: "+s.movieList[code][0]);
                System.out.println("Language: "+s.movieList[code][1]);
                System.out.println("Date: "+date);
                System.out.println("Time: "+time);
                System.out.println("Audi: "+audi);
                System.out.println("Seat: "+Seeeeet);
                System.out.println("Booking ID: "+bk);
                System.out.println("");
                System.out.println("************************************************************");
                bk=bk+1;

            }
            catch ( Exception E ) { break outer ;}

        }
        System.out.println("");
        System.out.println("If you have odered food online, please show your");
        System.out.println(" Booking ID at the food counter at the cinemas" ); 
        System.out.println("");
        System.out.println("Enter any character to exit");
        String h = Sc.nextLine();
        System.out.print("\u000C");
        System.out.println("        Thank You For Using I Cinemas ");
        System.out.println(" We Hope You Have A Great Cinematic Experience");
        try{
        Thread.sleep(3000);}
        catch ( InterruptedException ex){Thread.currentThread().interrupt();}
        System.out.print("\u000C");
        System.out.println("        Thank You For Using I Cinemas ");
        System.out.println(" We Hope You Have A Great Cinematic Experience");
        try{
        Thread.sleep(3000);}
        catch ( InterruptedException ex){Thread.currentThread().interrupt();}
        System.out.print("\u000C");
        return 1;
    }
}

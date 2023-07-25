import java.util.Scanner;
import java.io.*;
public class SeatChoice2
{
    String arr [];
    public String [] Choice ( int day,int time,int audi )
    {
        Scanner Sc = new Scanner ( System.in );
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
            return arr;
        }catch(ClassNotFoundException c) {
            System.out.println("Store not found : ERROR 002");
            c.printStackTrace();
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
            return arr;
        }
        System.out.println("Please enter number of seats that you want");
        int no = Sc.nextInt();
        arr = new String [no];
        System.out.print("\u000C");
        char count = 'A';
        int count2 = 1;
        boolean hi = false;
        if(audi == 1)
        {
            for(int i = 0, j = 0, c = 0; c < 238 ; ++c )
            {
                if(j <= 11 )
                {
                    System.out.print(s.formatAudi1 [i][j]+"  " );
                    if(i==16)
                    {
                        System.out.println("|");
                        i=0;
                        ++j;
                    }else{
                        ++i;}
                }
                else
                {
                    System.out.print(s.formatAudi1 [i][j] );
                    if(i==16)
                    {
                        System.out.println();
                        i=0;
                        ++j;
                    }else{
                        ++i;}}}
            System.out.println();
            System.out.println("Booked Seats : #");
            System.out.println("Available Seats : []");
            System.out.println("Please Select Your Seats in format \"A1\" e.t.c");
        }
        else
        {
        }
        if ( day ==1)
        {
        if(audi==1)
        {for(int i = 0;i<no;++i){arr[i] = Sc.nextLine();
                for(int c = 0;c<96;++c)
                {if(arr[i].equalsIgnoreCase(count+Integer.toString(count2)))
                    {hi = true;}
                    else if(count=='H'){count = 'A';++count2;}else++count2;}
                if((arr[i].equalsIgnoreCase("A7"))||(arr[i].equalsIgnoreCase("A8"))){hi = false;}
                else if((arr[i].equalsIgnoreCase("B7"))||(arr[i].equalsIgnoreCase("B8"))){hi=false;}
                else if((arr[i].equalsIgnoreCase("C7"))||(arr[i].equalsIgnoreCase("C8"))){hi=false;}
                else if((arr[i].equalsIgnoreCase("D5"))||(arr[i].equalsIgnoreCase("D13"))){hi=false;}
                else if((arr[i].equalsIgnoreCase("E5"))||(arr[i].equalsIgnoreCase("E13"))){hi=false;}
                else if((arr[i].equalsIgnoreCase("F5"))||(arr[i].equalsIgnoreCase("F13"))){hi=false;}
                else if((arr[i].equalsIgnoreCase("G5"))||(arr[i].equalsIgnoreCase("G13"))){hi=false;}
                else if((arr[i].equalsIgnoreCase("H5"))||(arr[i].equalsIgnoreCase("H13"))){hi=false;}
                else{}
                if(hi==false){
                    System.out.println("This seat does not exist");
                    System.out.println("Please select your seat again");
                    try{Thread.sleep(3000);}
                    catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                    System.out.print("\u000C");continue;}else{;}
                hi = false;count = 'A';count2 = 1;}
                for(int j = 0;j<30;++j){
                    if ( arr [j].equals(s.bookedA1Monday [time][j])){
                     System.out.println("This seat is already booked");
                     System.out.println("Please select your seat again");
                     try{Thread.sleep(3000);}
                      catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                     System.out.print("\u000C");
                     continue; }}}
                for(int i = 0,j=0;i<96;++i)
                {if(s.bookedA1Monday [time][i].equals(""))
                    {s.bookedA1Monday [time][i] = arr [j];
                    }else{}if(j==no){break;}else{}}}
        else if(audi==2)
        {
        }
        else if(audi==3)
        {for(int i = 0;i<no;++i){
                arr[i] = Sc.nextLine();
                for(int c =0;c<30;++c){
                    if((arr[i]).equalsIgnoreCase(count+Integer.toString(count2)))
                    {  
                        hi = true;
                        break;}else if(count=='F')
                     {count = 'A';++count2;}else++count2;}
                if(hi==false){
                    System.out.println("This seat does not exist ");
                    System.out.println("Please select your seat again");
                    try{Thread.sleep(3000);}
                    catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                    System.out.print("\u000C");
                    continue;}else{;}
                hi = false;count = 'A';count2 = 1;
                for(int j = 0;j<30;++j){
                    if ( arr [i].equals(s.bookedA3Monday [time][j])){
                     System.out.println("This seat is already booked");
                     System.out.println("Please select your seat again");
                     try{Thread.sleep(3000);}
                      catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                     System.out.print("\u000C");
                     continue; }}}
                for(int i = 0,j=0;i<96;++i){
                    if(s.bookedA3Monday [time][i].equals("")){
                        s.bookedA3Monday [time][i] = arr [j];}
                    else{}
                    if(j==no)
                    {break;}else{}}
            }else{System.out.println("ERROR:SS>D7");}
    
         if(day==2)
        {
            if(audi==1)
            {

            }
            else if(audi==2)
            {

            }
            else if(audi==3)
            {for(int i = 0;i<no;++i){
                arr[i] = Sc.nextLine();
                for(int c =0;c<30;++c){
                    if((arr[i]).equalsIgnoreCase(count+Integer.toString(count2)))
                    {  
                        hi = true;
                        break;}else if(count=='F')
                     {count = 'A';++count2;}else++count2;}
                if(hi==false){
                    System.out.println("This seat does not exist ");
                    System.out.println("Please select your seat again");
                    try{Thread.sleep(3000);}
                    catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                    System.out.print("\u000C");
                    continue;}else{;}
                hi = false;count = 'A';count2 = 1;
                for(int j = 0;j<30;++j){
                    if ( arr [i].equals(s.bookedA1Tuesday [time][j])){
                     System.out.println("This seat is already booked");
                     System.out.println("Please select your seat again");
                     try{Thread.sleep(3000);}
                      catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                     System.out.print("\u000C");
                     continue; }}}
                for(int i = 0,j=0;i<96;++i){
                    if(s.bookedA3Tuesday [time][i].equals("")){
                        s.bookedA3Tuesday [time][i] = arr [j];}
                    else{}
                    if(j==no)
                    {break;}else{}}
            }else{System.out.println("ERROR:SS>D7");}
        }
        else if(day==3)
        {
            if(audi==1)
            {

            }
            else if(audi==2)
            {

            }
            else if(audi==3)
            {for(int i = 0;i<no;++i){
                arr[i] = Sc.nextLine();
                for(int c =0;c<30;++c){
                    if((arr[i]).equalsIgnoreCase(count+Integer.toString(count2)))
                    {  
                        hi = true;
                        break;}else if(count=='F')
                     {count = 'A';++count2;}else++count2;}
                if(hi==false){
                    System.out.println("This seat does not exist ");
                    System.out.println("Please select your seat again");
                    try{Thread.sleep(3000);}
                    catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                    System.out.print("\u000C");
                    continue;}else{;}
                hi = false;count = 'A';count2 = 1;
                for(int j = 0;j<30;++j){
                    if ( arr [i].equals(s.bookedA1Wednusday [time][j])){
                     System.out.println("This seat is already booked");
                     System.out.println("Please select your seat again");
                     try{Thread.sleep(3000);}
                      catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                     System.out.print("\u000C");
                     continue; }}}
                for(int i = 0,j=0;i<96;++i){
                    if(s.bookedA3Wednusday [time][i].equals("")){
                        s.bookedA3Wednusday [time][i] = arr [j];}
                    else{}
                    if(j==no)
                    {break;}else{}}
            }else{System.out.println("ERROR:SS>D7");}
        }
        else if(day==4)
        {
            if(audi==1)
            {

            }
            else if(audi==2)
            {

            }
            else if(audi==3)
            {for(int i = 0;i<no;++i){
                arr[i] = Sc.nextLine();
                for(int c =0;c<30;++c){
                    if((arr[i]).equalsIgnoreCase(count+Integer.toString(count2)))
                    {  
                        hi = true;
                        break;}else if(count=='F')
                     {count = 'A';++count2;}else++count2;}
                if(hi==false){
                    System.out.println("This seat does not exist ");
                    System.out.println("Please select your seat again");
                    try{Thread.sleep(3000);}
                    catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                    System.out.print("\u000C");
                    continue;}else{;}
                hi = false;count = 'A';count2 = 1;
                for(int j = 0;j<30;++j){
                    if ( arr [i].equals(s.bookedA1Thursday [time][j])){
                     System.out.println("This seat is already booked");
                     System.out.println("Please select your seat again");
                     try{Thread.sleep(3000);}
                      catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                     System.out.print("\u000C");
                     continue; }}}
                for(int i = 0,j=0;i<96;++i){
                    if(s.bookedA3Thursday [time][i].equals("")){
                        s.bookedA3Thursday [time][i] = arr [j];}
                    else{}
                    if(j==no)
                    {break;}else{}}
            }else{System.out.println("ERROR:SS>D7");}
        }
        else if(day==5)
        {
            if(audi==1)
            {

            }
            else if(audi==2)
            {

            }
            else if(audi==3)
            {for(int i = 0;i<no;++i){
                arr[i] = Sc.nextLine();
                for(int c =0;c<30;++c){
                    if((arr[i]).equalsIgnoreCase(count+Integer.toString(count2)))
                    {  
                        hi = true;
                        break;}else if(count=='F')
                     {count = 'A';++count2;}else++count2;}
                if(hi==false){
                    System.out.println("This seat does not exist ");
                    System.out.println("Please select your seat again");
                    try{Thread.sleep(3000);}
                    catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                    System.out.print("\u000C");
                    continue;}else{;}
                hi = false;count = 'A';count2 = 1;
                for(int j = 0;j<30;++j){
                    if ( arr [i].equals(s.bookedA1Friday [time][j])){
                     System.out.println("This seat is already booked");
                     System.out.println("Please select your seat again");
                     try{Thread.sleep(3000);}
                      catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                     System.out.print("\u000C");
                     continue; }}}
                for(int i = 0,j=0;i<96;++i){
                    if(s.bookedA3Friday [time][i].equals("")){
                        s.bookedA3Friday [time][i] = arr [j];}
                    else{}
                    if(j==no)
                    {break;}else{}}
            }else{System.out.println("ERROR:SS>D7");}
        }
        else if(day==6)
        {
            if(audi==1)
            {

            }
            else if(audi==2)
            {

            }
            else if(audi==3)
            {for(int i = 0;i<no;++i){
                arr[i] = Sc.nextLine();
                for(int c =0;c<30;++c){
                    if((arr[i]).equalsIgnoreCase(count+Integer.toString(count2)))
                    {  
                        hi = true;
                        break;}else if(count=='F')
                     {count = 'A';++count2;}else++count2;}
                if(hi==false){
                    System.out.println("This seat does not exist ");
                    System.out.println("Please select your seat again");
                    try{Thread.sleep(3000);}
                    catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                    System.out.print("\u000C");
                    continue;}else{;}
                hi = false;count = 'A';count2 = 1;
                for(int j = 0;j<30;++j){
                    if ( arr [i].equals(s.bookedA1Saturday [time][j])){
                     System.out.println("This seat is already booked");
                     System.out.println("Please select your seat again");
                     try{Thread.sleep(3000);}
                      catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                     System.out.print("\u000C");
                     continue; }}}
                for(int i = 0,j=0;i<96;++i){
                    if(s.bookedA3Saturday [time][i].equals("")){
                        s.bookedA3Saturday [time][i] = arr [j];}
                    else{}
                    if(j==no)
                    {break;}else{}}
            }else{System.out.println("ERROR:SS>D6");}
        }
        else if(day==7)
        {
            if(audi==1)
            {
                for(int i = 0,j=0;i<96;++i)
                {if(s.bookedA1Sunday [time][i].equals(""))
                    {s.bookedA1Sunday [time][i] = arr [j];
                    }else{}if(j==no){break;}else{}}

            }
            else if(audi==2)
            {

            }
            else if(audi==3)
            {for(int i = 0;i<no;++i){
                arr[i] = Sc.nextLine();
                for(int c =0;c<30;++c){
                    if((arr[i]).equalsIgnoreCase(count+Integer.toString(count2)))
                    {  
                        hi = true;
                        break;}else if(count=='F')
                     {count = 'A';++count2;}else++count2;}
                if(hi==false){
                    System.out.println("This seat does not exist ");
                    System.out.println("Please select your seat again");
                    try{Thread.sleep(3000);}
                    catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                    System.out.print("\u000C");
                    continue;}else{;}
                hi = false;count = 'A';count2 = 1;
                for(int j = 0;j<30;++j){
                    if ( arr [i].equals(s.bookedA1Sunday [time][j])){
                     System.out.println("This seat is already booked");
                     System.out.println("Please select your seat again");
                     try{Thread.sleep(3000);}
                      catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                     System.out.print("\u000C");
                     continue; }}}
                for(int i = 0,j=0;i<96;++i){
                    if(s.bookedA3Sunday [time][i].equals("")){
                        s.bookedA3Sunday [time][i] = arr [j];}
                    else{}
                    if(j==no)
                    {break;}else{}}
            }else{System.out.println("ERROR:SS>D7");}
        }
        else
        {
            System.out.println("ERROR:SS");
        }
        return (arr);
    }
}
import java.io.*;
import java.util.Scanner;
public class Show_Book
{
    public String Show ( int codeIn, int D )
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
            return "NO";
        }catch(ClassNotFoundException c) {
            System.out.println("Store not found : ERROR 002");
            c.printStackTrace();
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
            return "NO";
        }
        Scanner Sc = new Scanner ( System.in);
        int count = 0;
        int code = Integer.valueOf(s.movieList[codeIn][3]);
        if(D==1)
        {
            for(int i = 0,d=0;i<2359;++i)
            {    if((s.D1 [i][1]).startsWith(code+".S"))
                { System.out.println("-> Audi:1    Time:"+i+" Hrs.");++count;}
                else {;}
                if((s.D1 [i][2]).startsWith(code+".S"))
                { System.out.println("-> Audi:2    Time:"+i+" Hrs.");++count;}
                else {;}
                if((s.D1 [i][3]).startsWith(code+".S"))
                { System.out.println("-> Audi:3    Time:"+i+" Hrs.");++count;}
                else {;}
            }
            }
        else if(D==2)
        {
            for(int i = 0,d=0;i<2359;++i)
            {    if((s.D2 [i][1]).startsWith(code+".S"))
                { System.out.println("-> Audi:1    Time:"+i+" Hrs.");++count;}
                else {;}
                if((s.D2 [i][2]).startsWith(code+".S"))
                { System.out.println("-> Audi:2    Time:"+i+" Hrs.");++count;}
                else {;}
                if((s.D2 [i][3]).startsWith(code+".S"))
                { System.out.println("-> Audi:3    Time:"+i+" Hrs.");++count;}
                else {;}
            }
            }
        else if(D==3)
        {
            for(int i = 0,d=0;i<2359;++i)
            {    if((s.D3 [i][1]).startsWith(code+".S"))
                { System.out.println("-> Audi:1    Time:"+i+" Hrs.");++count;}
                else {;}
                if((s.D3 [i][2]).startsWith(code+".S"))
                { System.out.println("-> Audi:2    Time:"+i+" Hrs.");++count;}
                else {;}
                if((s.D3 [i][3]).startsWith(code+".S"))
                { System.out.println("-> Audi:3    Time:"+i+" Hrs.");++count;}
                else {;}
            }
            }
        else if(D==4)
        {
            for(int i = 0,d=0;i<2359;++i)
            {    if((s.D4 [i][1]).startsWith(code+".S"))
                { System.out.println("-> Audi:1    Time:"+i+" Hrs.");++count;}
                else {;}
                if((s.D4 [i][2]).startsWith(code+".S"))
                { System.out.println("-> Audi:2    Time:"+i+" Hrs.");++count;}
                else {;}
                if((s.D4 [i][3]).startsWith(code+".S"))
                { System.out.println("-> Audi:3    Time:"+i+" Hrs.");++count;}
                else {;}
            }
            }
        else if(D==5)
        {
            for(int i = 0,d=0;i<2359;++i)
            {    if((s.D5 [i][1]).startsWith(code+".S"))
                { System.out.println("-> Audi:1    Time:"+i+" Hrs.");++count;}
                else {;}
                if((s.D5 [i][2]).startsWith(code+".S"))
                { System.out.println("-> Audi:2    Time:"+i+" Hrs.");++count;}
                else {;}
                if((s.D5 [i][3]).startsWith(code+".S"))
                { System.out.println("-> Audi:3    Time:"+i+" Hrs.");++count;}
                else {;}
            } 
            }
        else if(D==6)
        {
            for(int i = 0,d=0;i<2359;++i)
            {    if((s.D6 [i][1]).startsWith(code+".S"))
                { System.out.println("-> Audi:1    Time:"+i+" Hrs.");++count;}
                else {;}
                if((s.D6 [i][2]).startsWith(code+".S"))
                { System.out.println("-> Audi:2    Time:"+i+" Hrs.");++count;}
                else {;}
                if((s.D6 [i][3]).startsWith(code+".S"))
                { System.out.println("-> Audi:3    Time:"+i+" Hrs.");++count;}
                else {;}
            } 
            }
        else if(D==7)
        {
            for(int i = 0,d=0;i<2359;++i)
            {    if((s.D7 [i][1]).startsWith(code+".S"))
                { System.out.println("-> Audi:1    Time:"+i+" Hrs.");++count;}
                else {;}
                if((s.D7 [i][2]).startsWith(code+".S"))
                { System.out.println("-> Audi:2    Time:"+i+" Hrs.");++count;}
                else {;}
                if((s.D7 [i][3]).startsWith(code+".S"))
                { System.out.println("-> Audi:3    Time:"+i+" Hrs.");++count;}
                else {;}
            }
            }
        if ( count == 0 ){System.out.println("No show available for this day, please try again");
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            return "NO";}else{;}
            System.out.println("Please select audi number");
        System.out.println("Please enter E to exit");
        String Choice = Sc.nextLine();
        if ( Choice.equalsIgnoreCase("E")||Choice.equalsIgnoreCase("Exit"))
        { return "NO";}
        else{;}
        System.out.println("Please select show timing in the format HHmm");
        System.out.println("Please enter E to exit");
        String Choice2 = Sc.nextLine();
        if ( Choice2.equalsIgnoreCase("E")||Choice2.equalsIgnoreCase("Exit"))
        { return "NO";}
        else{;}
        String Choice3 = Choice + Choice2;
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
            return "NO";
        }
        return Choice3;
    }
}
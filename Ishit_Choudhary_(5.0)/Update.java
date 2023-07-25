import java.util.Scanner;
import java.io.*;
public class Update
{
    public int Edit (int temp)
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
        outer :
        while ( true )
        {
            System.out.print("\u000C");
            System.out.println("A. Edit Movie Name");
            System.out.println("B. Edit Movie Language");
            System.out.println("C. Edit Movie Duration");
            System.out.println("D. Exit");
            Choice = Sc.nextLine();
            System.out.print("\u000C");
            if((Choice.equalsIgnoreCase("E"))||(Choice.equalsIgnoreCase("EXIT"))||(Choice.equalsIgnoreCase("D")))
            {
                System.out.print("\u000C");
                break outer;
            }
            else if (Choice.equalsIgnoreCase("A"))
            {
                System.out.println("Enter new movie name");
                Choice = Sc.nextLine();
                s.movieList[temp][0]=Choice;
                if((Choice.equalsIgnoreCase("E"))||(Choice.equalsIgnoreCase("EXIT")))
                {
                    System.out.print("\u000C");
                    continue;
                }
                else
                    ;
                System.out.print("\u000C");
                System.out.println("Changed movie name sucessfully");
                try{
                    Thread.sleep(3000);}
                catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                System.out.print("\u000C");
                continue;
            }
            else if (Choice.equalsIgnoreCase("B"))
            {
                System.out.println("Enter new movie language");
                Choice = Sc.nextLine();
                s.movieList[temp][1]=Choice;
                System.out.print("\u000C");
                if((Choice.equalsIgnoreCase("E"))||(Choice.equalsIgnoreCase("EXIT")))
                {
                    System.out.print("\u000C");
                    continue;
                }
                else
                    ;
                System.out.println("Changed movie language sucessfully");
                try{
                    Thread.sleep(3000);}
                catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                System.out.print("\u000C");
                continue;
            }
            else if (Choice.equalsIgnoreCase("C"))
            {
                System.out.println("Enter new movie duration");
                Choice = Sc.nextLine();
                s.movieList[temp][2]=Choice;
                if((Choice.equalsIgnoreCase("E"))||(Choice.equalsIgnoreCase("EXIT")))
                {
                    System.out.print("\u000C");
                    continue;
                }
                else
                    ;
                System.out.print("\u000C");
                System.out.println("Changed movie duration sucessfully");
                try{
                    Thread.sleep(3000);}
                catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                System.out.print("\u000C");
                continue;
            }
            else 
            {
                System.out.println("ERROR:506");
                try{
                    Thread.sleep(3000);}
                catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                System.out.print("\u000C");
                continue;
            }    
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
            return 1;
        }
        return 1;
    }

    public int DeleteShow (int code)
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
        int d4 = 0;
        int d;
        int d2;
        int d3;      
        d3 = Integer.valueOf(s.movieList [code][2]);
        for(int i = 60,i2 =0;i<1380;i=i+60,++i2)
        {
            if(d3<=i)
            {;
            }
            else
            {
                d4 = 40*i2;
                break;
            }
        }
        System.out.println("Please enter the day for which you want to delete the timings for");
        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        System.out.println("6. Saturday");
        System.out.println("7. Sunday");
        System.out.println("8. Exit");
        String Choice = Sc.nextLine();
        System.out.print("\u000C");
        if((Choice.equalsIgnoreCase("E"))||(Choice.equalsIgnoreCase("EXIT"))||(Choice.equalsIgnoreCase("8")))
        {
            System.out.print("\u000C");
            return 1;
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
            System.out.println("Please enter Audi no. from which the show is to be deleted(Integer Value Only))");
            d2 = Sc.nextInt();
            System.out.println("Please enter time of the show which is to be deleted(Integer Value Only)");
            d = Sc.nextInt();
            s.D1 [d][d2] = "";
            System.out.print("\u000C");
            for(int i = d2+1;i<=(d+d3+d4);++i)
            {    s.D6 [i][d2] = code+".";
            }
            System.out.println("Show Deleted");
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
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
            System.out.println("Please enter Audi no. from which the show is to be deleted");
            d2 = Sc.nextInt();
            System.out.println("Please enter time of the show which is to be deleted");
            d = Sc.nextInt();
            System.out.print("\u000C");
            for(int i = d2+1;i<=(d+d3+d4);++i)
            {    s.D6 [i][d2] = code+".";
            }
            System.out.println("Show Deleted");
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
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
            System.out.println("Please enter Audi no. from which the show is to be deleted");
            d2 = Sc.nextInt();
            System.out.println("Please enter time of the show which is to be deleted");
            d = Sc.nextInt();
            System.out.print("\u000C");
            for(int i = d2+1;i<=(d+d3+d4);++i)
            {    s.D6 [i][d2] = code+".";
            }
            System.out.println("Show Deleted");
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
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
            System.out.println("Please enter Audi no. from which the show is to be deleted");
            d2 = Sc.nextInt();
            System.out.println("Please enter time of the show which is to be deleted");
            d = Sc.nextInt();
            System.out.print("\u000C");
            for(int i = d2+1;i<=(d+d3+d4);++i)
            {    s.D6 [i][d2] = code+".";
            }
            System.out.println("Show Deleted");
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
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
            System.out.println("Please enter Audi no. from which the show is to be deleted");
            d2 = Sc.nextInt();
            System.out.println("Please enter time of the show which is to be deleted");
            d = Sc.nextInt();
            System.out.print("\u000C");
            for(int i = d2+1;i<=(d+d3+d4);++i)
            {    s.D6 [i][d2] = code+".";
            }
            System.out.println("Show Deleted");
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
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
            System.out.println("Please enter Audi no. from which the show is to be deleted");
            d2 = Sc.nextInt();
            System.out.println("Please enter time of the show which is to be deleted");
            d = Sc.nextInt();
            System.out.print("\u000C");
            for(int i = d2+1;i<=(d+d3+d4);++i)
            {    s.D6 [i][d2] = code+".";
            }
            System.out.println("Show Deleted");
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
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
            System.out.println("Please enter Audi no. from which the show is to be deleted");
            d2 = Sc.nextInt();
            System.out.println("Please enter time of the show which is to be deleted");
            d = Sc.nextInt();
            System.out.print("\u000C");
            for(int i = d2+1;i<(d+d3+d4);++i)
            {    s.D6 [i][d2] = ".";
            }
            System.out.println("Show Deleted");
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
        }     
        else
        {    System.out.println("ERROR");
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
            return 1;
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
            return 1;
        }

        return 1;
    }
    
    public int AddShow (int code, int duration)
    {
        Scanner Sc = new Scanner ( System.in );
        String Choice;
        int Choice2;
        int Choice3;
        int d =0;
        int Choice20;
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

          
        int audi = 0;
        int hr = 0;
        int min = 0;
        System.out.println("Please enter the day for which you want to add timings");
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
            return 1;
        }

        System.out.println("Please enter the Audi number");
        Choice3 = Sc.nextInt();
        if(audi >= 3)
        {
            System.out.println("No Such Audi Exists");
            System.out.println("Please try again");
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
            return 1;    
        }
        else
        { ;
        }
        System.out.print("\u000C");
        System.out.println("Please enter the Start time in hrs ( Ex. 1420 for 2:20 pm )");
        Choice2 = Sc.nextInt();
        System.out.print("\u000C");
        Choice20 = Integer.valueOf(Choice2);
        if((Choice20 > 2200)||((Choice20%100)>59))
        {
            System.out.println("No Movie After 10 pm allowed");
            System.out.println("Please try again");
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
            return 1;    
        }
        else
        {
            ;
        }
        d=(duration/60)*40;

            
        if(Choice.equalsIgnoreCase("Monday")||Choice.equalsIgnoreCase("1"))
        {
            if (s.D1 [Choice2][Choice3].equals("")&&s.D1 [Choice2+duration][Choice3].equals("")){
                s.D1 [Choice2][Choice3] = code+".S.";
                s.D1 [Choice2+duration+d][Choice3] = code+".E";
                for(int i = Choice2+1;i<(Choice2+duration+d);++i)
                {    s.D1 [i][Choice3] = code+".";
                }
            }
            else
            {  System.out.println("Time Slot already Booked");
                System.out.println("Please Try Again");
                try{
                    Thread.sleep(3000);}
                catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                System.out.print("\u000C");
                return 1;
            }
        }
        else if(Choice.equalsIgnoreCase("Tuesday")||Choice.equalsIgnoreCase("2"))
        {
            if (s.D2 [Choice2][Choice3].equals("")&&s.D2 [Choice2+duration][Choice3].equals("")){
                s.D2 [Choice2][Choice3] = code+".S.";
                s.D2 [Choice2+duration+d][Choice3] = code+".E";
                for(int i = Choice2+1;i<(Choice2+duration+d);++i)
                {    s.D2 [i][Choice3] = code+".";
                }
            }
            else
            {  System.out.println("Time Slot already Booked");
                System.out.println("Please Try Again");
                try{
                    Thread.sleep(3000);}
                catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                System.out.print("\u000C");
                return 1;
            }
        }
        else if(Choice.equalsIgnoreCase("Wednesday")||Choice.equalsIgnoreCase("3"))
        {
            if (s.D3 [Choice2][Choice3].equals("")&&s.D3 [Choice2+duration][Choice3].equals("")){
                s.D3 [Choice2][Choice3] = code+".S.";
                s.D3 [Choice2+duration+d][Choice3] = code+".E";
                for(int i = Choice2+1;i<(Choice2+duration+d);++i)
                {    s.D3 [i][Choice3] = code+".";
                }
            }
            else
            {  System.out.println("Time Slot already Booked");
                System.out.println("Please Try Again");
                try{
                    Thread.sleep(3000);}
                catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                System.out.print("\u000C");
                return 1;
            }
        }
        else if(Choice.equalsIgnoreCase("Thursday")||Choice.equalsIgnoreCase("4"))
        {
            if (s.D4 [Choice2][Choice3].equals("")&&s.D4 [Choice2+duration][Choice3].equals("")){
                s.D4 [Choice2][Choice3] = code+".S.";
                s.D4 [Choice2+duration+d][Choice3] = code+".E";
                for(int i = Choice2+1;i<(Choice2+duration+d);++i)
                {    s.D4 [i][Choice3] = code+".";
                }
            }
            else
            {  System.out.println("Time Slot already Booked");
                System.out.println("Please Try Again");
                try{
                    Thread.sleep(3000);}
                catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                System.out.print("\u000C");
                return 1;
            }
        }
        else if(Choice.equalsIgnoreCase("Friday")||Choice.equalsIgnoreCase("5"))
        {
            if (s.D5 [Choice2][Choice3].equals("")&&s.D5 [Choice2+duration][Choice3].equals("")){
                s.D5 [Choice2][Choice3] = code+".S.";
                s.D5 [Choice2+duration+d][Choice3] = code+".E";
                for(int i = Choice2+1;i<(Choice2+duration+d);++i)
                {    s.D5 [i][Choice3] = code+".";
                }
            }
            else
            {  System.out.println("Time Slot already Booked");
                System.out.println("Please Try Again");
                try{
                    Thread.sleep(3000);}
                catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                System.out.print("\u000C");
                return 1;
            }
        }
        else if(Choice.equalsIgnoreCase("Saturday")||Choice.equalsIgnoreCase("6"))
        {
            if (s.D6 [Choice2][Choice3].equals("")&&s.D6 [Choice2+duration][Choice3].equals("")){
                s.D6 [Choice2][Choice3] = code+".S.";
                s.D6 [Choice2+duration+d][Choice3] = code+".E";
                for(int i = Choice2+1;i<(Choice2+duration+d);++i)
                {    s.D6 [i][Choice3] = code+".";
                }
            }
            else
            {  System.out.println("Time Slot already Booked");
                System.out.println("Please Try Again");
                try{
                    Thread.sleep(3000);}
                catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                System.out.print("\u000C");
                return 1;
            }
        }
        else if(Choice.equalsIgnoreCase("Sunday")||Choice.equalsIgnoreCase("7"))
        {
            if (s.D7 [Choice2][Choice3].equals("")&&s.D7 [Choice2+duration][Choice3].equals("")){
                s.D7 [Choice2][Choice3] = code+".S.";
                s.D7 [Choice2+duration+d][Choice3] = code+".E";
                for(int i = Choice2+1;i<(Choice2+duration+d);++i)
                {    s.D7 [i][Choice3] = code+".";
                }  
            }
            else
            {  System.out.println("Time Slot already Booked");
                System.out.println("Please Try Again");
                try{
                    Thread.sleep(3000);}
                catch ( InterruptedException ex){Thread.currentThread().interrupt();}
                System.out.print("\u000C");
                return 1;
            }
        }     
        else
        {    System.out.println("ERROR");
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
            return 1;
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
            return 1;
        }
        System.out.println("Timing stored");
        try{
            Thread.sleep(3000);}
        catch ( InterruptedException ex){Thread.currentThread().interrupt();}
        System.out.print("\u000C");
        return 1;
    }
    
        public int ShowTime (int code)
    {
        Scanner Sc = new Scanner ( System.in );
        String Choice;
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
                return 1;
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
                continue Outer;
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
                continue Outer;
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
                continue Outer;
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
                continue Outer;
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
                continue Outer;
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
                continue Outer;
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
                continue Outer;
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
                return 1;
            }
        }

    }
}

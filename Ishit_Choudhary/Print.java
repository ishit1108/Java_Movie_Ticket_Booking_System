import java.io.*;
public class Print
{
    public int print ( int Audi, int time, int code, int day )
    {
        AudiFormat A = new AudiFormat ();
        int catchreturn = A.Audi_G();
        catchreturn = A.Audi_3();
        if(Audi == 1){catchreturn = A1(day,time);}
        else if(Audi == 2){catchreturn = A2(day,time);}
        else {catchreturn = A3(day,time);}
        return 1;
    }

    public int A1 (int day, int time) 
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
        System.out.print("\u000C");
        Booked B = new Booked ();
        String Booked []; 
        Booked = new String [96];
        Booked = B.booked(1,day,time);
        int i2;int j2;
        int i3;int k;
        for(int i = 0; i < 96 ; ++i )
        {  if ((Booked[i]).equals("NO"))
            {;}
            else
            {   j2 = Booked[i].length();
                k = Booked[i].indexOf(".");
                i2 = Integer.valueOf(Booked[i].substring(0,k));
                i3 = Integer.valueOf(Booked[i].substring(k+1,j2));
                s.formatAudi1 [i2][i3] = "# ";
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
        int x = PrintA1();
        return 1;
    }
    public int A2 (int day, int time) 
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
        System.out.print("\u000C");
        Booked B = new Booked ();
        String Booked []; 
        Booked = new String [96];
        Booked = B.booked(2,day,time);
        int i2;int j2;
        int i3;int k;
        for(int i = 0; i < 96 ; ++i )
        {  if ((Booked[i]).equals("NO"))
            {;}
            else
            {   j2 = Booked[i].length();
                k = Booked[i].indexOf(".");
                i2 = Integer.valueOf(Booked[i].substring(0,k));
                i3 = Integer.valueOf(Booked[i].substring(k+1,j2));
                s.formatAudi1 [i2][i3] = "# ";
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
        int x = PrintA1();
        return 1;
    }
    public int A3 (int day, int time) 
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
        System.out.print("\u000C");
        Booked B = new Booked ();
        String Booked [] = new String  [30];
        Booked = B.booked(3,day,time);
        int i2;int j2;
        int i3;int k;
        for(int i = 0; i < 30 ; ++i )
        {  if ((Booked[i]).equals("NO"))
            {;}
            else
            {   j2 = Booked[i].length();
                k = Booked[i].indexOf(".");
                i2 = Integer.valueOf(Booked[i].substring(0,k));
                i3 = Integer.valueOf(Booked[i].substring(k+1,j2));
                s.formatAudi1 [i2][i3] = "# ";
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
        int x = PrintA3();
        return 1;
    }
        public int PrintA1 ()
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
                    ++i;}
            }
        }
        System.out.println();
        System.out.println(" [] -> Available");
        System.out.println(" # -> Booked");
        return 1;
    }
        public int PrintA3 ()
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
        for(int i = 0, j = 0, c = 0; c < 144 ; ++c )
        {
            System.out.print(s.formatAudi3 [i][j]);
            if(i==11)
            {
                if(j == 11)
                {
                    System.out.println("|");
                    break;
                }
                else if ( j > 9 )
                {
                    System.out.println("|");
                    System.out.println("\t\t\t\t\t\t\t      |");
                }
                else
                {
                    System.out.println("  |");
                    System.out.println("\t\t\t\t\t\t\t      |"); 
                }
                i=0;
                ++j;
            }else{
                ++i;}
        }
        System.out.println();
        System.out.println(" [ ] -> Available");
        System.out.println(" [ # ] -> Booked");
        return 1;
    }
}
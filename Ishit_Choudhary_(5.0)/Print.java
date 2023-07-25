import java.io.*;
public class Print
{
    public int print ( int Audi)
    {
        int catchreturn;
        if(Audi == 1||Audi==2){catchreturn = PrintA1();}
        else {catchreturn = PrintA3();}
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
        System.out.println(" [[#]] -> Booked");
        return 1;
    }
}
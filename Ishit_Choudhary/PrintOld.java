/**import java.io.*;
public class PrintOld
{
    public int print ( int Audi, String Booked [] )
    {
        AudiFormat Af = new AudiFormat ();
        int xx = Af.Audi_G();
        xx = Af.Audi_3();
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
        if((Audi == 1)||(Audi == 2))
        {
            int i2;int j2;
            int i3;int k;
            for(int i = 0; i < 96 ; ++i )
            { try {if ((Booked[i]).equals("")){}
                else
                {   j2=Booked[i].length();
                    k=Booked[i].indexOf(".");
                    i2 =Integer.valueOf(Booked[i].substring(0,k));
                    i3 = Integer.valueOf(Booked[i].substring(k+1,j2));
                    s.formatAudi1 [i2][i3] = "# ";
                }}
                catch  (Exception g){;}
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
        }
        else if ( Audi == 3 )
        {
            int i2;int j2;
            int i3;int k;
            for(int i = 0; i < 96 ; ++i )
            { try {if ((Booked[i]).equals("")){}
                else
                {   j2=Booked[i].length();
                    k=Booked[i].indexOf(".");
                    i2 =Integer.valueOf(Booked[i].substring(0,k));
                    i3 = Integer.valueOf(Booked[i].substring(k+1,j2));
                    s.formatAudi3 [i2][i3] = "[ # ]";
                }}
                catch (Exception h){;}
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
        }
        return 1;
    }
}*/
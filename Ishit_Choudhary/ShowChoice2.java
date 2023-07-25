import java.util.Scanner;
import java.io.*;
public class ShowChoice2
{
    /**public int Choice ( int M, int D)
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
        Scanner Sc = new Scanner( System.in );
        int arr [] = new int [50];
        for(int i = 0;i<2359;++i)
        {
            arr[i]=-1;
        }
        if(D==1)
        {
            for(int i = 0,d=0;i<2359;++i)
            {    if((s.D1 [i][1]).startsWith(code+".S"))
                {
                    System.out.print(b+" ");
                    ++a;
                    b=a+". ";
                    arr[i][1]=d;
                    ++d;
                    System.out.println("-> Audi:1    Time:"+i+" Hrs.");
                }
                else
                    ;
                if((s.D1 [i][2]).startsWith(code+".S"))
                {
                    System.out.print(b+" ");
                    ++a;
                    b=a+". ";
                    arr[i][2]=d;
                    ++d;
                    System.out.println("-> Audi:2    Time:"+i+" Hrs.");
                }
                else
                    ;
                if((s.D1 [i][3]).startsWith(code+".S"))
                {
                    System.out.print(b+" ");
                    ++a;
                    b=a+". ";
                    arr[i][3]=d;
                    ++d;
                    System.out.println("-> Audi:3    Time:"+i+" Hrs.");
                }
                else
                    ;
            }
            System.out.println("Please select Audi and Show timing");
            Choice = Sc.next().charAt(0);
            a = 'A';
            int temp = -1;
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
        }
        else if(D==2)
        {
            for(int i = 0,d=0;i<2359;++i)
            {    if((s.D2 [i][1]).startsWith(code+".S"))
                {
                    System.out.print(b+" ");
                    ++a;
                    b=a+". ";
                    arr[d][1]=i;
                    ++d;
                    System.out.println("-> Audi:1    Time:"+i+" Hrs.");
                }
                else
                    ;
                if((s.D2 [i][2]).startsWith(code+".S"))
                {
                    System.out.print(b+" ");
                    ++a;
                    b=a+". ";
                    arr[d][2]=i;
                    ++d;
                    System.out.println("-> Audi:2    Time:"+i+" Hrs.");
                }
                else
                    ;
                if((s.D2 [i][3]).startsWith(code+".S"))
                {
                    System.out.print(b+" ");
                    ++a;
                    b=a+". ";
                    arr[d][3]=i;
                    ++d;
                    System.out.println("-> Audi:3    Time:"+i+" Hrs.");
                }
                else
                    ;

            }
            System.out.println("Please select Audi and Show timing");
            Choice = Sc.next().charAt(0);

        }
        else if(D==3)
        {
            for(int i = 0,d=0;i<2359;++i)
            {    if((s.D3 [i][1]).startsWith(code+".S"))
                {
                    System.out.print(b+" ");
                    ++a;
                    b=a+". ";
                    arr[d][1]=i;
                    ++d;
                    System.out.println("-> Audi:1    Time:"+i+" Hrs.");
                }
                else
                    ;
                if((s.D3 [i][2]).startsWith(code+".S"))
                {
                    System.out.print(b+" ");
                    ++a;
                    b=a+". ";
                    arr[d][2]=i;
                    ++d;
                    System.out.println("-> Audi:2    Time:"+i+" Hrs.");
                }
                else
                    ;
                if((s.D3 [i][3]).startsWith(code+".S"))
                {
                    System.out.print(b+" ");
                    ++a;
                    b=a+". ";
                    arr[d][3]=i;
                    ++d;
                    System.out.println("-> Audi:3    Time:"+i+" Hrs.");
                }
                else
                    ;

            }
            System.out.println("Please select Audi and Show timing");
            Choice = Sc.next().charAt(0);

        }
        else if(D==4)
        {
            for(int i = 0,d=0;i<2359;++i)
            {    if((s.D4 [i][1]).startsWith(code+".S"))
                {
                    System.out.print(b+" ");
                    ++a;
                    b=a+". ";
                    arr[d][1]=i;
                    ++d;
                    System.out.println("-> Audi:1    Time:"+i+" Hrs.");
                }
                else
                    ;
                if((s.D4 [i][2]).startsWith(code+".S"))
                {
                    System.out.print(b+" ");
                    ++a;
                    b=a+". ";
                    arr[d][2]=i;
                    ++d;
                    System.out.println("-> Audi:2    Time:"+i+" Hrs.");
                }
                else
                    ;
                if((s.D4 [i][3]).startsWith(code+".S"))
                {
                    System.out.print(b+" ");
                    ++a;
                    b=a+". ";
                    arr[d][3]=i;
                    ++d;
                    System.out.println("-> Audi:3    Time:"+i+" Hrs.");
                }
                else
                    ;

            }
            System.out.println("Please select Audi and Show timing");
            Choice = Sc.next().charAt(0);

        }
        else if(D==5)
        {
            for(int i = 0,d=0;i<2359;++i)
            {    if((s.D5 [i][1]).startsWith(code+".S"))
                {
                    System.out.print(b+" ");
                    ++a;
                    b=a+". ";
                    arr[d][1]=i;
                    ++d;
                    System.out.println("-> Audi:1    Time:"+i+" Hrs.");
                }
                else
                    ;
                if((s.D5 [i][2]).startsWith(code+".S"))
                {
                    System.out.print(b+" ");
                    ++a;
                    b=a+". ";
                    arr[d][2]=i;
                    ++d;
                    System.out.println("-> Audi:2    Time:"+i+" Hrs.");
                }
                else
                    ;
                if((s.D5 [i][3]).startsWith(code+".S"))
                {
                    System.out.print(b+" ");
                    ++a;
                    b=a+". ";
                    arr[d][3]=i;
                    ++d;
                    System.out.println("-> Audi:3    Time:"+i+" Hrs.");
                }
                else
                    ;

            }
            System.out.println("Please select Audi and Show timing");
            Choice = Sc.next().charAt(0);

        }
        else if(D==6)
        {
            for(int i = 0,d=0;i<2359;++i)
            {    if((s.D6 [i][1]).startsWith(code+".S"))
                {
                    System.out.print(b+" ");
                    ++a;
                    b=a+". ";
                    arr[d][1]=i;
                    ++d;
                    System.out.println("-> Audi:1    Time:"+i+" Hrs.");
                }
                else
                    ;
                if((s.D6 [i][2]).startsWith(code+".S"))
                {
                    System.out.print(b+" ");
                    ++a;
                    b=a+". ";
                    arr[d][2]=i;
                    ++d;
                    System.out.println("-> Audi:2    Time:"+i+" Hrs.");
                }
                else
                    ;
                if((s.D6 [i][3]).startsWith(code+".S"))
                {
                    System.out.print(b+" ");
                    ++a;
                    b=a+". ";
                    arr[d][3]=i;
                    ++d;
                    System.out.println("-> Audi:3    Time:"+i+" Hrs.");
                }
                else
                    ;

            }
            System.out.println("Please select Audi and Show timing");
            Choice = Sc.next().charAt(0);

        }
        else if(D==7)
        {
            for(int i = 0,d=0;i<2359;++i)
            {    if((s.D7 [i][1]).startsWith(code+".S"))
                {
                    System.out.print(b+" ");
                    ++a;
                    b=a+". ";
                    arr[d][1]=i;
                    ++d;
                    System.out.println("-> Audi:1    Time:"+i+" Hrs.");
                }
                else
                    ;
                if((s.D7 [i][2]).startsWith(code+".S"))
                {
                    System.out.print(b+" ");
                    ++a;
                    b=a+". ";
                    arr[d][2]=i;
                    ++d;
                    System.out.println("-> Audi:2    Time:"+i+" Hrs.");
                }
                else
                    ;
                if((s.D7 [i][3]).startsWith(code+".S"))
                {
                    System.out.print(b+" ");
                    ++a;
                    b=a+". ";
                    arr[d][3]=i;
                    ++d;
                    System.out.println("-> Audi:3    Time:"+i+" Hrs.");
                }
                else
                    ;

            }
            System.out.println("Please select Audi and Show timing");
            Choice = Sc.next().charAt(0);

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
    }*/
}

       
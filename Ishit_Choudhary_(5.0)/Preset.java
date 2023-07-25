import java.io.*;
public class Preset
{
    public int preset ()
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

        s.movieList [1][0] = "Avenger:Infinity War";s.movieList [6][0] = "The Golden Circle";
        s.movieList [1][1] = "Eng 3D";s.movieList [6][1] = "Eng";
        s.movieList [1][2] = "107";s.movieList [6][2] = "115";
        s.movieList [1][3] = "1";s.movieList [6][3] = "8";
        s.movieList [2][0] = "Jab Harry Met Sejal";s.movieList [7][0] = "Secret Superstar";
        s.movieList [2][1] = "Hindi";s.movieList [7][1] = "Hindi";
        s.movieList [2][2] = "121";s.movieList [7][2] = "105";
        s.movieList [2][3] = "2";s.movieList [7][3] = "4";
        s.movieList [3][0] = "Spiderman Homecoming";s.movieList [8][0] = "Lego:Ninjago Movie";
        s.movieList [3][1] = "Eng 3D";s.movieList [8][1] = "Eng 3D";
        s.movieList [3][2] = "120";s.movieList [8][2] = "125";
        s.movieList [3][3] = "5";s.movieList [8][3] = "3";
        s.movieList [4][0] = "Toilet Ek Prem Katha";s.movieList [9][0] = "The Emoji Movie";
        s.movieList [4][1] = "Hindi";s.movieList [9][1] = "Eng 3D";
        s.movieList [4][2] = "133";s.movieList [9][2] = "95";
        s.movieList [4][3] = "7";s.movieList [9][3] = "9";
        s.movieList [5][0] = "The Death Cure";s.movieList [10][0] = "Annabelle Creation";
        s.movieList [5][1] = "Eng";s.movieList [10][1] = "Eng 3D";
        s.movieList [5][2] = "95";s.movieList [10][2] = "97";
        s.movieList [5][3] = "6";s.movieList [10][3] = "10";
        s.D1 [830][1] = "1.S.";
        s.D1 [1017][1] = "1.E";
        s.D1 [1215][1] = "7.S.";
        s.D1 [1428][1] = "7.E";
        s.D1 [1500][1] = "5.S.";
        s.D1 [1700][1] = "5.E";
        s.D1 [1820][1] = "2.S.";
        s.D1 [2021][1] = "2.E";
        s.D1 [2140][1] = "10.S.";
        s.D1 [2317][1] = "10.E";
        s.D2 [830][1] = "8.S.";
        s.D2 [1025][1] = "8.E";
        s.D2 [1500][1] = "5.S.";
        s.D2 [1800][1] = "5.E";
        s.D2 [1820][1] = "2.S.";
        s.D2 [2021][1] = "2.E";
        s.D2 [2140][1] = "5.S.";
        s.D2 [2340][1] = "5.E";
        s.D3 [830][1] = "1.S.";
        s.D3 [1017][1] = "1.E";
        s.D3 [1215][1] = "7.S.";
        s.D3 [1428][1] = "7.E";
        s.D3 [1820][1] = "9.S.";
        s.D3 [1955][1] = "9.E";
        s.D4 [830][1] = "1.S.";
        s.D4 [1017][1] = "1.E";
        s.D4 [1215][1] = "7.S.";
        s.D4 [1448][1] = "7.E";
        s.D4 [1500][1] = "4.S.";
        s.D4 [1645][1] = "4.E";
        s.D4 [2140][1] = "10.S.";
        s.D4 [2317][1] = "10.E";
        s.D5 [830][1] = "8.S.";
        s.D5 [1025][1] = "8.E";
        s.D5 [1820][1] = "4.S.";
        s.D5 [2005][1] = "4.E";
        s.D5 [2140][1] = "10.S.";
        s.D5 [2317][1] = "10.E";
        s.D6 [830][1] = "6.S.";
        s.D6 [1005][1] = "6.E";
        s.D6 [1215][1] = "3.S.";
        s.D6 [1420][1] = "3.E";
        s.D6 [1500][1] = "2.S.";
        s.D6 [1701][1] = "2.E";
        s.D6 [1820][1] = "4.S.";
        s.D6 [2005][1] = "4.E";
        s.D7 [830][1] = "6.S.";
        s.D7 [1005][1] = "6.E";
        s.D7 [1820][1] = "4.S.";
        s.D7 [2005][1] = "4.E";
        s.D7 [2140][1] = "5.S.";
        s.D7 [2340][1] = "5.E";

        s.D1 [1000][2] = "3.S.";
        s.D1 [1205][2] = "3.E";
        s.D1 [1330][2] = "8.S.";
        s.D1 [1525][2] = "8.E";
        s.D1 [1615][2] = "4.S.";
        s.D1 [1700][2] = "4.E";
        s.D1 [1850][2] = "6.S.";
        s.D1 [2025][2] = "6.E";
        s.D1 [2130][2] = "5.S.";
        s.D1 [2330][2] = "5.E";
        s.D2 [1000][2] = "1.S.";
        s.D2 [1147][2] = "1.E";
        s.D2 [1330][2] = "9.S.";
        s.D2 [1505][2] = "9.E";
        s.D2 [1615][2] = "6.S.";
        s.D2 [1750][2] = "6.E";
        s.D2 [1850][2] = "4.S.";
        s.D2 [2005][2] = "4.E";
        s.D2 [2130][2] = "10.S.";
        s.D2 [2307][2] = "10.E";
        s.D3 [1000][2] = "3.S.";
        s.D3 [1205][2] = "3.E";
        s.D3 [1330][2] = "8.S.";
        s.D3 [1525][2] = "8.E";
        s.D3 [1615][2] = "5.S.";
        s.D3 [1815][2] = "5.E";
        s.D3 [1850][2] = "2.S.";
        s.D3 [2051][2] = "2.E";
        s.D3 [2130][2] = "10.S.";
        s.D3 [2307][2] = "10.E";
        s.D4 [1000][2] = "3.S.";
        s.D4 [1205][2] = "3.E";
        s.D4 [1330][2] = "8.S.";
        s.D4 [1525][2] = "8.E";
        s.D4 [1615][2] = "5.S.";
        s.D4 [1815][2] = "5.E";
        s.D4 [1850][2] = "9.S.";
        s.D4 [2025][2] = "9.E";
        s.D4 [2130][2] = "6.S.";
        s.D4 [2305][2] = "6.E";
        s.D5 [1000][2] = "1.S.";
        s.D5 [1147][2] = "1.E";
        s.D5 [1330][2] = "9.S.";
        s.D5 [1505][2] = "9.E";
        s.D5 [1615][2] = "7.S.";
        s.D5 [1828][2] = "7.E";
        s.D5 [1850][2] = "2.S.";
        s.D5 [2051][2] = "2.E";
        s.D5 [2130][2] = "6.S.";
        s.D5 [2305][2] = "6.E";
        s.D6 [1330][2] = "9.S.";
        s.D6 [1505][2] = "9.E";
        s.D6 [1615][2] = "7.S.";
        s.D6 [1828][2] = "7.E";
        s.D6 [1850][2] = "5.S.";
        s.D6 [2050][2] = "5.E";
        s.D6 [2130][2] = "10.S.";
        s.D6 [2307][2] = "10.E";
        s.D7 [1330][2] = "9.S.";
        s.D7 [1505][2] = "9.E";
        s.D7 [1615][2] = "2.S.";
        s.D7 [1816][2] = "2.E";
        s.D7 [2130][2] = "10.S.";
        s.D7 [2307][2] = "10.E";

        s.D1 [900][3] = "5.S.";
        s.D1 [1100][3] = "5.E";
        s.D1 [1230][3] = "5.S.";
        s.D1 [1430][3] = "5.E";
        s.D1 [1600][3] = "4.S.";
        s.D1 [1745][3] = "4.E";
        s.D1 [2100][3] = "10.S.";
        s.D1 [2237][3] = "10.E";
        s.D2 [900][3] = "10.S.";
        s.D2 [1037][3] = "10.E";
        s.D2 [1230][3] = "4.S.";
        s.D2 [1415][3] = "4.E";
        s.D2 [1600][3] = "6.S.";
        s.D2 [1735][3] = "6.E";
        s.D2 [2100][3] = "2.S.";
        s.D2 [2301][3] = "2.E";
        s.D3 [900][3] = "2.S.";
        s.D3 [1101][3] = "2.E";
        s.D3 [1230][3] = "4.S.";
        s.D3 [1415][3] = "4.E";
        s.D3 [1600][3] = "5.S.";
        s.D3 [1800][3] = "5.E";
        s.D3 [2100][3] = "9.S.";
        s.D3 [2235][3] = "9.E";
        s.D4 [900][3] = "10.S.";
        s.D4 [1037][3] = "10.E";
        s.D4 [1230][3] = "4.S.";
        s.D4 [1415][3] = "4.E";
        s.D4 [1600][3] = "5.S.";
        s.D4 [1800][3] = "5.E";
        s.D4 [2100][3] = "9.S.";
        s.D4 [2235][3] = "9.E";
        s.D5 [900][3] = "9.S.";
        s.D5 [1035][3] = "9.E";
        s.D5 [1230][3] = "6.S.";
        s.D5 [1405][3] = "6.E";
        s.D5 [1600][3] = "2.S.";
        s.D5 [1801][3] = "2.E";
        s.D5 [2100][3] = "5.S.";
        s.D5 [2300][3] = "5.E";
        s.D6 [900][3] = "7.S.";
        s.D6 [1113][3] = "7.E";
        s.D6 [1230][3] = "2.S.";
        s.D6 [1431][3] = "2.E";
        s.D6 [1600][3] = "6.S.";
        s.D6 [1735][3] = "6.E";
        s.D6 [2100][3] = "10.S.";
        s.D6 [2237][3] = "10.E";
        s.D7 [900][3] = "9.S.";
        s.D7 [1035][3] = "9.E";
        s.D7 [1230][3] = "6.S.";
        s.D7 [1405][3] = "6.E";
        s.D7 [1600][3] = "7.S.";
        s.D7 [1813][3] = "7.E";
        s.D7 [2100][3] = "5.S.";
        s.D7 [2300][3] = "5.E";

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
}
import java.io.*;
public class Store implements java.io.Serializable 
{
    public String formatAudi1 [][];
    public String formatAudi3 [][];
    public String D1 [][];
    public String D2 [][];
    public String D3 [][];
    public String D4 [][];
    public String D5 [][];
    public String D6 [][];
    public String D7 [][];
    public String movieList [][];
    public int code;

    public static void main(String [] args) 
    {
        Store s = new Store();
        s.code = 1;
        s.formatAudi1 = new String [17][14];
        s.formatAudi3 = new String [12][12];
        s.D1 = new String [2359][4];
        s.D2 = new String [2359][4];
        s.D3 = new String [2359][4];
        s.D4 = new String [2359][4];
        s.D5 = new String [2359][4];
        s.D6 = new String [2359][4];
        s.D7 = new String [2359][4];
        s.movieList = new String [50][4];
        for ( int i = 0,j=0,c=0;c<9436;++c)
        {   s.D1 [i][j] = "";s.D7 [i][j] = "";s.D6 [i][j] = "";
            s.D2 [i][j] = "";s.D5 [i][j] = "";
            s.D3 [i][j] = "";s.D4 [i][j] = "";
            if(j==3){++i;j=0;}else{++j;}}
        for(int i = 0, j = 0 , c = 0; c < 200 ; ++c )
        {   s.movieList [i][j] = "";
            if(i==49)
            {i=0;++j;}else{ ++i;}}

        s.movieList [0][0] = "Movie Name          ";
        s.movieList [0][1] = "Lang";
        s.movieList [0][2] = "Mins";

        try {
            FileOutputStream fileOut =
                new FileOutputStream("Data.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(s);
            out.close();
            fileOut.close();
            System.out.print("\u000C");
        }catch(IOException i) {
            i.printStackTrace();
            System.out.printf("ERROR 000");}
        Preset P = new Preset ();
        AudiFormat Af= new AudiFormat();
        int ghfjhgjhgj = Af.Audi_G();
        int gfjhgfjhfjh = Af.Audi_3();
        int xxxxxxxxx = P.preset();
        System.out.println("System ready to use");
    }
}
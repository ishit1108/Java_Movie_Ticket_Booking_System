import java.io.*;
public class Store implements java.io.Serializable 
{
    public String formatAudi1 [][];
    public String formatAudi3 [][];
    public int lastUseDate;
    public String D1 [][];
    public String D2 [][];
    public String D3 [][];
    public String D4 [][];
    public String D5 [][];
    public String D6 [][];
    public String D7 [][];
    public String bookedA1Monday [][];
    public String bookedA1Tuesday [][];
    public String bookedA1Wednusday [][];
    public String bookedA1Thursday [][];
    public String bookedA1Friday [][];
    public String bookedA1Saturday [][];
    public String bookedA1Sunday [][];
    public String bookedA2Monday [][];
    public String bookedA2Tuesday [][];
    public String bookedA2Wednusday [][];
    public String bookedA2Thursday [][];
    public String bookedA2Friday [][];
    public String bookedA2Saturday [][];
    public String bookedA2Sunday [][];
    public String bookedA3Monday [][];
    public String bookedA3Tuesday [][];
    public String bookedA3Wednusday [][];
    public String bookedA3Thursday [][];
    public String bookedA3Friday [][];
    public String bookedA3Saturday [][];
    public String bookedA3Sunday [][];
    public String movieList [][];
    public int code;
    public void Check() {
        System.out.println("Check Initialize:"+lastUseDate);
    }
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
        s.bookedA1Monday = new String [2359][96];
        s.bookedA1Tuesday  = new String [2359][96];
        s.bookedA1Wednusday  = new String [2359][96];
        s.bookedA1Thursday  = new String [2359][96];
        s.bookedA1Friday  = new String [2359][96];
        s.bookedA1Saturday = new String [2359][96];
        s.bookedA1Sunday  = new String [2359][96];
        s.bookedA2Monday  = new String [2359][96];
        s.bookedA2Tuesday  = new String [2359][96];
        s.bookedA2Wednusday  = new String [2359][96];
        s.bookedA2Thursday  = new String [2359][96];
        s.bookedA2Friday  = new String [2359][96];
        s.bookedA2Saturday  = new String [2359][96];
        s.bookedA2Sunday  = new String [2359][96];
        s.bookedA3Monday  = new String [2359][30];
        s.bookedA3Tuesday = new String [2359][30];
        s.bookedA3Wednusday  = new String [2359][30];
        s.bookedA3Thursday  = new String [2359][30];
        s.bookedA3Friday  = new String [2359][30];
        s.bookedA3Saturday  = new String [2359][30];
        s.bookedA3Sunday  = new String [2359][30];
        s.movieList = new String [50][4];
        s.lastUseDate = 0;
        for(int i = 0, j = 0, c = 0; c < 226464 ; ++c )
        {   s.bookedA1Monday [i][j] = "NO";s.bookedA1Sunday [i][j] = "NO";s.bookedA1Friday [i][j] = "NO";
            s.bookedA1Thursday [i][j] = "NO";s.bookedA1Wednusday [i][j] = "NO";
            s.bookedA1Saturday [i][j] = "NO";s.bookedA1Tuesday [i][j] = "NO";
            if(i==2358){i=0;++j;}else{++i;}}
        for(int i = 0, j = 0, c = 0; c < 22646 ; ++c )
        { s.bookedA2Monday [i][j] = "NO";s.bookedA2Friday [i][j] = "NO";s.bookedA2Sunday [i][j] = "NO";
          s.bookedA2Tuesday [i][j] = "NO";s.bookedA2Wednusday [i][j] = "NO";
          s.bookedA2Thursday [i][j] = "NO";s.bookedA2Saturday [i][j] = "NO";
          if(i==2358){i=0;++j;}else{++i;}}
        for(int i = 0, j = 0, c = 0; c < 70770 ; ++c )
        { s.bookedA3Monday [i][j] = "NO";s.bookedA3Sunday [i][j] = "NO";s.bookedA3Friday [i][j] = "NO";
          s.bookedA3Tuesday [i][j] = "NO";s.bookedA3Saturday [i][j] = "NO";
          s.bookedA3Wednusday [i][j] = "NO";s.bookedA3Thursday [i][j] = "NO";
          if(i==2358){i=0;++j;}else{++i;}}
        for ( int i = 0,j=0,c=0;c<9436;++c)
        {   s.D1 [i][j] = "";s.D7 [i][j] = "";s.D6 [i][j] = "";
            s.D2 [i][j] = "";s.D5 [i][j] = "";
            s.D3 [i][j] = "";s.D4 [i][j] = "";
            if(j==3){++i;j=0;}else{++j;}}
        for(int i = 0, j = 0 , c = 0; c < 200 ; ++c )
        {   s.movieList [i][j] = "";
            if(i==49)
            {i=0;++j;}else{ ++i;}}
        
            
        s.movieList [0][0] = "Movie Name";
        s.movieList [0][1] = "Language";
        s.movieList [0][2] = "Duration";
        s.Check();
        
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
        int xxxxxxxxx = P.preset();
        System.out.println("System ready to use");
    }
}
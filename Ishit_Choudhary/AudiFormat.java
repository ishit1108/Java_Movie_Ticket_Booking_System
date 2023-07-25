import java.io.*;
public class AudiFormat
{
   
    public int Audi_G ()
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
      
        for(int i = 0, j = 0 , c = 0;c<238;++c)
      {
          s.formatAudi1 [i][j] = "[]";
          if(i==16)
          {
              i=0;
              ++j;
            }else{
                ++i;}
            }
            
      s.formatAudi1 [0][0] = "  "; s.formatAudi1 [0][1] = "  "; s.formatAudi1 [0][2] = "A ";
      s.formatAudi1 [0][3] = "B "; s.formatAudi1 [0][4] = "C "; s.formatAudi1 [0][5] = "  ";
      s.formatAudi1 [0][6] = "D "; s.formatAudi1 [0][7] = "E "; s.formatAudi1 [0][8] = "F ";
      s.formatAudi1 [0][9] = "G "; s.formatAudi1 [0][10] = "H ";s.formatAudi1 [0][11] = "  ";
      s.formatAudi1 [0][12] = "**";s.formatAudi1 [0][13] = "**";
      s.formatAudi1 [1][1] = "  "; s.formatAudi1 [7][1] = "6 "; s.formatAudi1 [12][1] = "11";
      s.formatAudi1 [2][1] = "1 "; s.formatAudi1 [8][1] = "7 "; s.formatAudi1 [13][1] = "12";
      s.formatAudi1 [3][1] = "2 "; s.formatAudi1 [9][1] = "8 "; s.formatAudi1 [14][1] = "13";
      s.formatAudi1 [4][1] = "3 "; s.formatAudi1 [10][1] = "9 "; s.formatAudi1 [15][1] = "14";
      s.formatAudi1 [5][1] = "4 "; s.formatAudi1 [11][1] = "10"; s.formatAudi1 [16][1] = "  ";
      s.formatAudi1 [6][1] = "5 ";
      s.formatAudi1 [1][11] = "  ";s.formatAudi1 [7][11] = "  ";s.formatAudi1 [12][11] = "  ";
      s.formatAudi1 [2][11] = "  ";s.formatAudi1 [8][11] = "  ";s.formatAudi1 [13][11] = "  ";
      s.formatAudi1 [3][11] = "  ";s.formatAudi1 [9][11] = "  ";s.formatAudi1 [14][11] = "  ";
      s.formatAudi1 [4][11] = "  ";s.formatAudi1 [10][11] = "  ";s.formatAudi1 [15][11] = "  ";
      s.formatAudi1 [5][11] = "  ";s.formatAudi1 [11][11] = "  ";s.formatAudi1 [16][11] = "  ";
      s.formatAudi1 [6][11] = "  ";
      s.formatAudi1 [1][12] = "**";s.formatAudi1 [7][12] = "**";s.formatAudi1 [12][12] = "**";
      s.formatAudi1 [2][12] = "**";s.formatAudi1 [8][12] = "**";s.formatAudi1 [13][12] = "**";
      s.formatAudi1 [3][12] = "**";s.formatAudi1 [9][12] = "**";s.formatAudi1 [14][12] = "**";
      s.formatAudi1 [4][12] = "**";s.formatAudi1 [10][12] = "**";s.formatAudi1 [15][12] = "**";
      s.formatAudi1 [5][12] = "**";s.formatAudi1 [11][12] = "**";s.formatAudi1 [16][12] = "**";
      s.formatAudi1 [6][12] = "*********************************";
      s.formatAudi1 [1][0] = "  ";s.formatAudi1 [7][0] = "";s.formatAudi1 [12][0] = "";
      s.formatAudi1 [2][0] = "  ";s.formatAudi1 [8][0] = "";s.formatAudi1 [13][0] = "";
      s.formatAudi1 [3][0] = "  ";s.formatAudi1 [9][0] = "";s.formatAudi1 [14][0] = "";
      s.formatAudi1 [4][0] = "    ";s.formatAudi1 [10][0] = "";s.formatAudi1 [15][0] = "";
      s.formatAudi1 [5][0] = "";s.formatAudi1 [11][0] = "";s.formatAudi1 [16][0] = "";
      s.formatAudi1 [6][0] = "PLATINUM ( 340 /- ) ";
      s.formatAudi1 [1][5] = "  ";s.formatAudi1 [7][5] = "";s.formatAudi1 [12][5] = "";
      s.formatAudi1 [2][5] = "  ";s.formatAudi1 [8][5] = "";s.formatAudi1 [13][5] = "";
      s.formatAudi1 [3][5] = "  ";s.formatAudi1 [9][5] = "";s.formatAudi1 [14][5] = "";
      s.formatAudi1 [4][5] = "    ";s.formatAudi1 [10][5] = "";s.formatAudi1 [15][5] = "";
      s.formatAudi1 [5][5] = "";s.formatAudi1 [11][5] = "";s.formatAudi1 [16][5] = "";
      s.formatAudi1 [6][5] = "EXECUTIVE ( 190 /- )";
      s.formatAudi1 [1][13] = "**";s.formatAudi1 [7][13] = "";s.formatAudi1 [12][13] = "";
      s.formatAudi1 [2][13] = "***";s.formatAudi1 [8][13] = "";s.formatAudi1 [13][13] = "";
      s.formatAudi1 [3][13] = "****************";
      s.formatAudi1 [9][13] = "";s.formatAudi1 [14][13] = "*";
      s.formatAudi1 [4][13] = " SCREEN THIS WAY ";
      s.formatAudi1 [10][13] = "";s.formatAudi1 [15][13] = "**********************";
      s.formatAudi1 [5][13] = "";s.formatAudi1 [11][13] = "";s.formatAudi1 [16][13] = "**";
      s.formatAudi1 [6][13] = "";
      s.formatAudi1 [16][0] = ""; s.formatAudi1 [16][1] = ""; s.formatAudi1 [16][2] = "";
      s.formatAudi1 [16][3] = ""; s.formatAudi1 [16][4] = ""; s.formatAudi1 [16][5] = "";
      s.formatAudi1 [16][6] = ""; s.formatAudi1 [16][7] = ""; s.formatAudi1 [16][8] = "";
      s.formatAudi1 [16][9] = ""; s.formatAudi1 [16][10] = "";s.formatAudi1 [16][11] = "";
      s.formatAudi1 [16][12] = "";s.formatAudi1 [16][13] = "";
      s.formatAudi1 [8][2] = "  ";s.formatAudi1 [8][3] = "  ";s.formatAudi1 [8][4] = "  ";
      s.formatAudi1 [9][2] = "  ";s.formatAudi1 [9][3] = "  ";s.formatAudi1 [9][4] = "  ";
      s.formatAudi1 [5][6] = "  ";s.formatAudi1 [5][8] = "  ";s.formatAudi1 [5][10] = "  ";
      s.formatAudi1 [5][7] = "  ";s.formatAudi1 [5][9] = "  ";
      s.formatAudi1 [12][6] = "  ";s.formatAudi1 [12][8] = "  ";s.formatAudi1 [12][10] = "  ";
      s.formatAudi1 [12][7] = "  ";s.formatAudi1 [12][9] = "  ";
      s.formatAudi1 [1][1] = "  ";s.formatAudi1 [1][5] = "  ";s.formatAudi1 [1][8] = "  ";
      s.formatAudi1 [1][2] = "  ";s.formatAudi1 [1][6] = "  ";s.formatAudi1 [1][9] = "  ";
      s.formatAudi1 [1][3] = "  ";s.formatAudi1 [1][7] = "  ";s.formatAudi1 [1][10] = "  ";
      s.formatAudi1 [1][4] = "  ";
      
      
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
      
      /**System.out.println();
      System.out.println();
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
        }*/
           
      return 1;
    }
    
    public int Audi_3 ()
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
      
      for(int i = 0, j = 0 , c = 0;c<144;++c)
      {
          if(i%2==0)
            s.formatAudi3 [i][j] = "[___]";
            else
                s.formatAudi3 [i][j] = "     ";
          if(i==11)
          {
              i=0;
              ++j;
            }else{
                ++i;}
            }
            
      s.formatAudi3 [0][0]="     ";s.formatAudi3 [0][4]="C    ";s.formatAudi3 [0][8]="F    ";
      s.formatAudi3 [0][1]="     ";s.formatAudi3 [0][5]="     ";s.formatAudi3 [0][9]="     ";
      s.formatAudi3 [0][2]="A    ";s.formatAudi3 [0][6]="D    ";s.formatAudi3 [0][10]="*****";
      s.formatAudi3 [0][3]="B    ";s.formatAudi3 [0][7]="E    ";s.formatAudi3 [0][11]="*****";
      s.formatAudi3 [2][1]="  1  ";s.formatAudi3 [6][1]="  3  ";s.formatAudi3 [10][1]="  5  ";
      s.formatAudi3 [4][1]="  2  ";s.formatAudi3 [8][1]="  4  ";
      s.formatAudi3 [2][9]="     ";s.formatAudi3 [6][9]="     ";s.formatAudi3 [10][9]="     ";
      s.formatAudi3 [4][9]="     ";s.formatAudi3 [8][9]="     ";
      s.formatAudi3 [1][10]="*****";s.formatAudi3 [5][10]="*****";s.formatAudi3 [9][10]="*****";
      s.formatAudi3 [2][10]="*****";s.formatAudi3 [6][10]="*****";s.formatAudi3 [10][10]="*****";
      s.formatAudi3 [3][10]="*****";s.formatAudi3 [7][10]="***";s.formatAudi3 [11][10]="*****";
      s.formatAudi3 [4][10]="*******";s.formatAudi3 [8][10]="*******";
      s.formatAudi3 [1][11]="*****";s.formatAudi3 [5][11]="N THI";s.formatAudi3 [9][11]="*****";
      s.formatAudi3 [2][11]="********";s.formatAudi3 [6][11]="S WAY";s.formatAudi3 [10][11]="****";
      s.formatAudi3 [3][11]="**** ";s.formatAudi3 [7][11]=" *****";s.formatAudi3 [11][11]="**";
      s.formatAudi3 [4][11]="SCREE";s.formatAudi3 [8][11]="*******";
      s.formatAudi3 [1][0]="     ";s.formatAudi3 [5][0]="CLASS";s.formatAudi3 [9][0]="     ";
      s.formatAudi3 [2][0]="        ";s.formatAudi3 [6][0]="(1200/-)";s.formatAudi3 [10][0]="     ";
      s.formatAudi3 [3][0]="  ";   s.formatAudi3 [7][0]="  ";s.formatAudi3 [11][0]="     ";
      s.formatAudi3 [4][0]="GOLD ";s.formatAudi3 [8][0]="     ";
      s.formatAudi3 [1][5]="     ";s.formatAudi3 [5][5]="CLASS";s.formatAudi3 [9][5]="     ";
      s.formatAudi3 [2][5]="     ";s.formatAudi3 [6][5]="(1000/-)";s.formatAudi3 [10][5]="     ";
      s.formatAudi3 [3][5]="     ";   s.formatAudi3 [7][5]="     ";s.formatAudi3 [11][5]="     ";
      s.formatAudi3 [4][5]="GOLD ";s.formatAudi3 [8][5]="  ";
      
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
           
      /**System.out.println();
      System.out.println();
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
                }*/
        return 1;
        }
            
        }
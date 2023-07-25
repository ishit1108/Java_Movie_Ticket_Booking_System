import java.io.*;
public class Price
{
   public String [][] price ( String in [] , int Audi , int no)
   {
       DeCode D = new DeCode ();
       String out [][] = new String [2][no];
       String temp = "";
       int index;
       int row =0;
       for( int i = 1,j=0; i<no ; ++i )
       {
          if ( ( Audi == 1 ) || ( Audi == 2 )){
           temp = D.decode(1,in[i]);}
          else if ( Audi == 3){
           temp = D.decode(3,in[i]);}
          else { ; }
          index = temp.indexOf(".");
          try{row = Integer.valueOf(temp.substring((index+1),(temp.length())));}catch(Exception E){;}
          if ( ( Audi == 1 ) || ( Audi == 2 )){
              if((row==2)||(row==3)||(row==4)){
                  out [0][i] = in[i];
                  out [1][i] = "240";
                }
                else{
                    out [0][i] = in[i];
                  out [1][i] = "190";
                }
            }
          else if ( Audi == 3 ){
              if((row==2)||(row==3)||(row==4)){
                  out [0][i] = in[i];
                  out [1][i] = "1200";
                }
                else{
                    out [0][i] = in[i];
                  out [1][i] = "1000";
                }
            }
        }
       return out ;
    }
}          
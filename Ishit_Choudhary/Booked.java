import java.io.*;
public class Booked
{
    public String [] booked ( int Audi, int Day, int time )
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
            String Hi [] = {"ERROR","ERROR"};
            return Hi;
        }catch(ClassNotFoundException c) {
            System.out.println("Store not found : ERROR 002");
            c.printStackTrace();
            try{
                Thread.sleep(3000);}
            catch ( InterruptedException ex){Thread.currentThread().interrupt();}
            System.out.print("\u000C");
            String Hi [] = {"ERROR","ERROR"};
            return Hi;
        }
        String toreturn [];
        toreturn = new String [96];
        for(int i=0;i<96;++i){toreturn[i]="NO";}
        DeCode D = new DeCode ();
        try{
            if(Audi==1)
            {

                if(Day==1){
                    for(int i = 0; i < 96;++i){
                        if(s.bookedA1Monday[time][i].equals("NO")){;}else{toreturn [i] = D.decode(Audi,s.bookedA1Monday[time][i]);}}}
                else if(Day==2)
                {for(int i = 0; i < 96;++i){
                        if(s.bookedA1Tuesday[time][i].equals("NO")){;}else{toreturn [i] = D.decode(Audi,s.bookedA1Tuesday[time][i]);}}}
                else if(Day==3)
                {for(int i = 0; i < 96;++i){
                        if(s.bookedA1Wednusday[time][i].equals("NO")){;}else{toreturn [i] = D.decode(Audi,s.bookedA1Wednusday[time][i]);}}}
                else if(Day==4)
                {for(int i = 0; i < 96;++i){
                        if(s.bookedA1Thursday[time][i].equals("NO")){;}else{toreturn [i] = D.decode(Audi,s.bookedA1Thursday[time][i]);}}}
                else if(Day==5)
                {for(int i = 0; i < 96;++i){
                        if(s.bookedA1Friday[time][i].equals("NO")){;}else{toreturn [i] = D.decode(Audi,s.bookedA1Friday[time][i]);}}}
                else if(Day==6)
                {for(int i = 0; i < 96;++i){
                        if(s.bookedA1Saturday[time][i].equals("NO")){;}else{toreturn [i] = D.decode(Audi,s.bookedA1Saturday[time][i]);}}}
                else if(Day==7)
                {for(int i = 0; i < 96;++i){
                        if(s.bookedA1Sunday[time][i].equals("NO")){;}else{toreturn [i] = D.decode(Audi,s.bookedA1Sunday[time][i]);}}}
                else {;}
            }
            else if(Audi==2)
            {
                if(Day==1){
                    for(int i = 0; i < 96;++i){
                        if(s.bookedA2Monday[time][i].equals("NO")){;}else{toreturn [i] = D.decode(Audi,s.bookedA2Monday[time][i]);}}}
                else if(Day==2)
                {for(int i = 0; i < 96;++i){
                        if(s.bookedA2Tuesday[time][i].equals("NO")){;}else{toreturn [i] = D.decode(Audi,s.bookedA2Tuesday[time][i]);}}}
                else if(Day==3)
                {for(int i = 0; i < 96;++i){
                        if(s.bookedA2Wednusday[time][i].equals("NO")){;}else{toreturn [i] = D.decode(Audi,s.bookedA2Wednusday[time][i]);}}}
                else if(Day==4)
                {for(int i = 0; i < 96;++i){
                        if(s.bookedA2Thursday[time][i].equals("NO")){;}else{toreturn [i] = D.decode(Audi,s.bookedA2Thursday[time][i]);}}}
                else if(Day==5)
                {for(int i = 0; i < 96;++i){
                        if(s.bookedA2Friday[time][i].equals("NO")){;}else{toreturn [i] = D.decode(Audi,s.bookedA2Friday[time][i]);}}}
                else if(Day==6)
                {for(int i = 0; i < 96;++i){
                        if(s.bookedA2Saturday[time][i].equals("NO")){;}else{toreturn [i] = D.decode(Audi,s.bookedA2Saturday[time][i]);}}}
                else if(Day==7)
                {for(int i = 0; i < 96;++i){
                        if(s.bookedA2Sunday[time][i].equals("NO")){;}else{toreturn [i] = D.decode(Audi,s.bookedA2Sunday[time][i]);}}}
                else {;}
            }
            else
            {
                if(Day==1){
                    for(int i = 0; i < 30;++i){
                        if(s.bookedA3Monday[time][i].equals("NO")){;}else{toreturn [i] = D.decode(Audi,s.bookedA3Monday[time][i]);}}}
                else if(Day==2)
                {for(int i = 0; i < 30;++i){
                        if(s.bookedA3Tuesday[time][i].equals("NO")){;}else{toreturn [i] = D.decode(Audi,s.bookedA3Tuesday[time][i]);}}}
                else if(Day==3)
                {for(int i = 0; i < 30;++i){
                        if(s.bookedA3Wednusday[time][i].equals("NO")){;}else{toreturn [i] = D.decode(Audi,s.bookedA3Wednusday[time][i]);}}}
                else if(Day==4)
                {for(int i = 0; i < 30;++i){
                        if(s.bookedA3Thursday[time][i].equals("NO")){;}else{toreturn [i] = D.decode(Audi,s.bookedA3Thursday[time][i]);}}}
                else if(Day==5)
                {for(int i = 0; i < 30;++i){
                        if(s.bookedA3Friday[time][i].equals("NO")){;}else{toreturn [i] = D.decode(Audi,s.bookedA3Friday[time][i]);}}}
                else if(Day==6)
                {for(int i = 0; i < 30;++i){
                        if(s.bookedA3Saturday[time][i].equals("NO")){;}else{toreturn [i] = D.decode(Audi,s.bookedA3Saturday[time][i]);}}}
                else if(Day==7)
                {for(int i = 0; i < 30;++i){
                        if(s.bookedA3Sunday[time][i].equals("NO")){;}else{toreturn [i] = D.decode(Audi,s.bookedA3Sunday[time][i]);}}}
                else {;}
            }}catch(Exception E){
            return toreturn;
        }
        return toreturn;
    }
}

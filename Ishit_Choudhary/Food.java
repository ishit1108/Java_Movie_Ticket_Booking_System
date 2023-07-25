import java.util.Scanner;
public class Food
{
    public String [][] foodlist ( )
    {
        System.out.print("\u000C");
        Scanner Sc = new Scanner ( System.in );
        System.out.println("You can now oder food which will be delivered at your seat");
        System.out.println("1. Oder Food");
        System.out.println("2. Skip to Payment");
        int in = Sc.nextInt();
        String Hi [][] = new String [0][0];
        if ( in == 1 ) { ; }
        else if ( in == 2 ) { return Hi; }
        else { Food f = new Food ();
            f.foodlist ();}
        System.out.print("\u000C");
        String Order[][] = new String [3][25];
        System.out.println("You can place a maximum of 25 orders only"); 
        String x;
        int x2;
        outer:
        for (int i = 0 ; i<25;)
        {
            x2 = Display();
            System.out.println();
            System.out.println("Order no:"+(i+1));
            System.out.println("Please enter the item that you want");
            x = Sc.next();
            System.out.print("\u000C"); 
            Order [0][i] = Calc (x);
            Order [1][i] = Calc2 (x);
            System.out.println("Please enter quantity");
            Order [2][i] = Sc.next();
            System.out.print("\u000C");
            System.out.println("Oder Stored");
            System.out.println("Enter 1 to exit, 2 to continue odering");
            x2 = Sc.nextInt();
            if ( x2 == 1){break outer;}
            else{i=i+1;}
            System.out.print("\u000C"); 
        }
        return Order;
        }
        public static int Display()
        {
         String d[] = new String [25];
         d[0]="                                       SNACK                                 PRICE";
         d[1]="A. Popcorn - Small                                                           Rs. 90";
         d[2]="B. Popcorn - Medium                                                          Rs. 140";
         d[3]="C. Popcorn - Tub                                                             Rs. 170";
         d[4]="D. Caramel Popcorn - Small                                                   Rs. 150";
         d[5]="E. Caramel Popcorn - Regular                                                 Rs. 210";
         d[6]="F. Chilli Popcorn - Small                                                    Rs. 130";
         d[7]="G. Chilli Popcorn - Regular                                                  Rs. 190";
         d[8]="H. Nachos - Small                                                            Rs. 170";
         d[9]="I. Nachos - Regular                                                          Rs. 250";
        d[10]="J. Momos - veg ( 10 pc. )                                                    Rs. 250";
        d[11]="K. Momos - NonVeg ( 10 pc. )                                                 Rs. 300";
        d[12]="L. Chilli corn - Small                                                       Rs. 110";
        d[13]="M. Chilli corn - Regular                                                     Rs. 160";
        d[14]="N. Salsa Sauce ( Additional )                                                Rs. 50";
        d[15]="O. Cheesy Dip ( Additional )                                                 Rs. 50";
        d[16]="                                       BEVERAGE";
        d[17]="P. Tea                                                                       Rs. 60";
        d[18]="Q. Masala Tea                                                                Rs. 100";
        d[19]="R. Hot Coffe                                                                 Rs. 70";
        d[20]="S. Cold Coffe                                                                Rs. 150";
        d[21]="T. Soft Drink ( Coke, ThumbsUp, Pepsi, Fanta, Mirinda,  Sprite, ) - Small    Rs. 70";
        d[22]="U. Soft Drink ( Coke, ThumbsUp, Pepsi, Fanta, Mirinda,  Sprite, ) - Regular  Rs. 120";
        d[23]="V. Milkshake ( Vanilla, Strawberry, Chocolate, Butterscotch) - Regular       Rs. 200";
        d[24]="W. Milkshake ( Vanilla, Strawberry, Chocolate, Butterscotch) - Large         Rs. 270";
        for (int  i = 0 ; i< 25;i++)
        {
            System.out.println(d[i]);
        }
        return 0;
    }
    public static String Calc(String x)
    {
        if(x.equalsIgnoreCase("A")){return "Popcorn - Small";}
        else if(x.equalsIgnoreCase("B")){return "Popcorn - Medium";}
        else if(x.equalsIgnoreCase("C")){return "Popcorn - Tub";}
        else if(x.equalsIgnoreCase("D")){return "Caramel Popcorn - Small";}
        else if(x.equalsIgnoreCase("E")){return "Caramel Popcorn - Regular";}
        else if(x.equalsIgnoreCase("F")){return "Chilli Popcorn - Small";}
        else if(x.equalsIgnoreCase("G")){return "Chilli Popcorn - Regular";}
        else if(x.equalsIgnoreCase("H")){return "Nachos - Small";}
        else if(x.equalsIgnoreCase("I")){return "Nachos - Regular";}
        else if(x.equalsIgnoreCase("J")){return "Momos - veg";}
        else if(x.equalsIgnoreCase("K")){return "Momos - NonVeg";}
        else if(x.equalsIgnoreCase("L")){return "Chilli corn - Small";}
        else if(x.equalsIgnoreCase("M")){return "Chilli corn - Regular";}
        else if(x.equalsIgnoreCase("N")){return "Salsa Sauce ( Additional )";}
        else if(x.equalsIgnoreCase("O")){return "Cheesy Dip ( Additional )";}
        else if(x.equalsIgnoreCase("P")){return "Tea";}
        else if(x.equalsIgnoreCase("Q")){return "Masala Tea ";}
        else if(x.equalsIgnoreCase("R")){return "Hot Coffe";}
        else if(x.equalsIgnoreCase("S")){return "Cold Coffe";}
        else if(x.equalsIgnoreCase("T")){return "Soft Drink - Small";}
        else if(x.equalsIgnoreCase("U")){return "Soft Drink - Regular";}
        else if(x.equalsIgnoreCase("V")){return "Milkshake - Regular";}
        else if(x.equalsIgnoreCase("W")){return "Milkshake - Large";}
        else { return "";}
    }
    public static String Calc2(String x)
    {
        if(x.equalsIgnoreCase("A")){return "90";}
        else if(x.equalsIgnoreCase("B")){return "140";}
        else if(x.equalsIgnoreCase("C")){return "170";}
        else if(x.equalsIgnoreCase("D")){return "150";}
        else if(x.equalsIgnoreCase("E")){return "210";}
        else if(x.equalsIgnoreCase("F")){return "130";}
        else if(x.equalsIgnoreCase("G")){return "190";}
        else if(x.equalsIgnoreCase("H")){return "170";}
        else if(x.equalsIgnoreCase("I")){return "250";}
        else if(x.equalsIgnoreCase("J")){return "250";}
        else if(x.equalsIgnoreCase("K")){return "300";}
        else if(x.equalsIgnoreCase("L")){return "110";}
        else if(x.equalsIgnoreCase("M")){return "160";}
        else if(x.equalsIgnoreCase("N")){return "50";}
        else if(x.equalsIgnoreCase("O")){return "50";}
        else if(x.equalsIgnoreCase("P")){return "60";}
        else if(x.equalsIgnoreCase("Q")){return "100";}
        else if(x.equalsIgnoreCase("R")){return "70";}
        else if(x.equalsIgnoreCase("S")){return "150";}
        else if(x.equalsIgnoreCase("T")){return "70";}
        else if(x.equalsIgnoreCase("U")){return "120";}
        else if(x.equalsIgnoreCase("V")){return "200";}
        else if(x.equalsIgnoreCase("W")){return "270";}
        else { return "";}
    }
}
        
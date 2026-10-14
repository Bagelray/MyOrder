import java.util.Scanner;
public class MyOrder {
    public static void main(String [] args) {
        Scanner kiosk = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Pizza: $12");
        System.out.println("2. Sandwich: $8");
        System.out.println("3. Hamburger: $10");
        System.out.println("Please enter your order (1 - 3)");
        int nPrice;
        /* The scanner kiosk is on even when the user hasn't entered anything */
        if(kiosk.hasNextInt()){
            int Inp = kiosk.nextInt();
            /* int Inp = kiosk.nextInt(); has to be inside the if statement 
            because when its before and outside the if statement, when the user enters a string
            the program will immediately detect the error and display the mismatch error code
             but when its inside the statment:
            if(kiosk.hasNextInt()) is read first 
            The only reason why an error was displayeed was because Inp had been given a non integer value
            */
            if((Inp >= 1)&&(Inp <= 3)){
        if (Inp == 1) {
            nPrice = 12;
            System.out.println("You chose the Pizza. Thank you for your order. Total cost: $" +nPrice);}
            else if (Inp == 2) {
            nPrice = 8;
            System.out.println("You chose the Sandwich. Thank you for your order. Total cost: $" + nPrice);}
            else if (Inp == 3) {
            nPrice = 10;
            System.out.println("You chose the Hamburger. Thank you for your order. Total cost: $" + nPrice);}
        }else if ((Inp <= 1 )||(Inp >= 3)){
            System.out.println("Invalid menu option. Please enter a number between 1 and 3");
        }
        } else{
            System.out.println("Invalid input. Please enter an integer between 1 and 3");
        }
    }
}
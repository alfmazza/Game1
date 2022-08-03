import java.util.Scanner;

public class Game1 {
  public static void main(String args[]) {

   Scanner insert = new Scanner(System.in);
   String respuesta = "";

   do {
       int num2 = (int)(Math.random() * 100 + 1);
       int num1 = 0;
       int i = 0;
   
       while (num1 != num2) {
                System.out.println("*******************************");
                System.out.println("Guess a number between 1 and 100:");
                System.out.println("*******************************");
                System.out.println("");
                num1 = insert.nextInt();
                System.out.println("");

                if(num1 < num2) {
                     i++;
                     System.out.println("***  too low. Try again. ***");
                     System.out.println("");
                }
               else if (num1 > num2) {
                i++;
               System.out.println("*** too high. Try again. ***");
               System.out.println("");
               } else {
                     i++;
                     System.out.println("*********************************");
                     System.out.println("*** " + num1 +" is correct! You win!***");
                     System.out.println("It only took you " + i +" tries! Good work!");
                     System.out.println("*********************************");
                     System.out.println("");
                 }
       }
       System.out.println("Would you like to play again (y/n)?");
       respuesta = insert.next();
  } 
     while (respuesta.equalsIgnoreCase("y"));
     System.out.println("Thank you for playing! Goodbye.");
 }
}
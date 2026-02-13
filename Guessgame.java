import java.awt.*;
class Guessgame{
  static Scanner input= new Scanner(System.in);
  static Random N= new Random();
  static int Secret= N.nextInt(100)+1;
  static int Guess=0;
  static String ans= "";
  public static void main(String[] teao){
do {Secret = N.nextInt(101); Guess=0
    do {
      System.out.print("Enter your Guess(1-100): ");
      Guess= input.nextInt();
      if (Guess > Secret)
         System.out.print("Too High");
      else if (Guess < Secret)
        System.out.print("Too Low");
        else 
        System.out.print("Congrats!!!!");
    } while (Guess!=Secret);
     System.out.print("Play again Y/N?: ");
    ans= input.next();
   } while (!ans.equalsIgnoreCase("N"));
     System.out.print("Au revoir");
  }
}

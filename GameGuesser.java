import java.util.Scanner;
class Guesser
{
    int guessNum;
    int guessingNum()
    {
        System.out.println("Guesser! Kindly guess the number ");
        Scanner scan=new Scanner(System.in);
        guessNum=scan.nextInt();
        return guessNum;
    }
}

class Players
{
    int guessNum;
    int guessingNum()
    {
        System.out.println("Player! Kindly guess the num");
        Scanner scan=new Scanner(System.in);
        guessNum=scan.nextInt();
        return guessNum;
    }
}

class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser()
    {
        Guesser g=new Guesser();
       numFromGuesser=g.guessingNum();

    }
    void collectNumFromPlayers()
    {
        Players p1=new Players();
        Players p2=new Players();
        Players p3=new Players();
        numFromPlayer1=p1.guessingNum();
        numFromPlayer2=p2.guessingNum();
        numFromPlayer3=p3.guessingNum();

    }
    void compare()
    {
        if(numFromGuesser==numFromPlayer1)
        { 
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
            {
            System.out.println("Sab ka sab sahi hain. Sab jeet gaye!");
            }
            else if(numFromGuesser==numFromPlayer2)
            {
                System.out.println("Player 1 and player 2 sahi hain!");
            }
            else
            {
                System.out.println("Player 1 won the game!");
            }
        }
        else if(numFromGuesser==numFromPlayer2)
        {   
             if(numFromGuesser==numFromPlayer3)
              {
                System.out.println("Player 2 and 3 sahi hain");
              }
              else
              {
            System.out.println("Player 2 won the game!");
              }
        }
        else if(numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player 3 won the game!");
        }
        else 
        {
            System.out.println("sab ka san ghalat hain. App game hargaye!!");
        }
        
    }
}
public class GameGuesser
{
public static void main(String[] args) 
{
    System.out.println("Game started!");
    Umpire u=new Umpire();
    u.collectNumFromGuesser();
    u.collectNumFromPlayers();
    u.compare();
}
}

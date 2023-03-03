import java.util.Scanner;
import java.util.Random;
class Guesser{
    int guessNumber;
    int guessNum()
    {
        Random num = new Random();
            guessNumber = num.nextInt(50);
            Scanner sc = new Scanner(System.in);
            System.out.println("Computer has take one number less than 50, you guess that number");
         
        return guessNumber;
    }
}
class Player{
    int guessNumber;
    int guessNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player kindly guess a number ");
        guessNumber=sc.nextInt();
        return guessNumber;
    }

}
class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    void collectNumFromGuesser()
    {
        Guesser g = new Guesser();
        numFromGuesser = g.guessNum();
    }
    void collectNumFromPlayers()
    {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessNum();
       l1:{ if(numFromGuesser>=numFromPlayer1)
        {
            if(numFromGuesser==numFromPlayer1)
            break l1;
            System.out.println("User guess a number greater than "+numFromPlayer1);
        }
        else if(numFromGuesser<=numFromPlayer1)
        {
            System.out.println("User guess a number less than "+numFromPlayer1);
        }
    }
        numFromPlayer2 = p2.guessNum();
       l2:{ if(numFromGuesser<numFromPlayer2)
        {
            if(numFromGuesser==numFromPlayer2)
            break l2;

            
            System.out.println("User guess a number less than "+numFromPlayer2);
        }
        else if(numFromGuesser>numFromPlayer2)
        {
            System.out.println("User guess a number Greater than "+numFromPlayer2);
        }
    }
        numFromPlayer3 = p3.guessNum();
        if(numFromGuesser!=numFromPlayer3&&numFromGuesser!=numFromPlayer1&&numFromGuesser!=numFromPlayer2)
        {
            
            System.out.println("Betterluck next time the number is "+numFromGuesser);
        }
    }
   
    void compare()
    {
        if(numFromGuesser==numFromPlayer1)
        {
            if(numFromGuesser==numFromPlayer2&&numFromGuesser==numFromPlayer3)
            {
                System.out.println("All players won the game");
            }
            else if(numFromGuesser==numFromPlayer2)
            {
                System.out.println("Player 1 & player 2 Won the game");
            }
            else if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("Player1 & Player3 won the game");
            }
            else{
            System.out.println("Player1 won the game");
            }
        }
        else if(numFromGuesser==numFromPlayer2)
        {
            if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("Player 2 & Player 3 won the game");
            }
            else{
            System.out.println("Player2 won the game");
            }
        }
        else if(numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player3 won the game");
        }
        else{
            System.out.println("You lose the game");
        }
    
    }
}
public class  GuesserGameApplication {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();       
        u.compare();
      
    }
}

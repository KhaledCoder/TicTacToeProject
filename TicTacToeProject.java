/*
 * Hello, everyone ^_^ 
 	WELCOME IN MY PROJECT
 *This class represents the main entry point fot the 'TicTacToeProject'.
 *This clas handles the initialization of players, the game loop and the main game logic.
 *The main method responsibilities of :
 *-Gitting name of players (usig 'getName' method)
 *-Create object from 'Game' class (named game)
 *-Used some methods to simplify . As:
 *--isFull -> to check is the array full or not?
 *--isSuc -> to check did the player won after his game
 *--play -> to print name of player and push his row and column
 *--getName  -> to get name of player
*/
import java.util.Scanner;

public class TicTacToeProject
{
    public static void main(String[] args)
    {
        String PlayerOne = getName("one");
        String PlayerTwo = getName("two");
        
        Game game = new Game();
        System.out.println("----->Name of player One is: "+PlayerOne+" , Use: "+'X');
        System.out.println("----->Name of player Two is: "+PlayerTwo+" , Use: "+'O');
        
        System.out.println("_______________Let's go!_______________");
        game.display();
        while(true)
        {
            //_____________Player One_______________
            play(PlayerOne,"One",'X',game);//push key player and display array
            
            if(isSuc(PlayerOne,'X',game))//check is player one winner or no(if winner will ended game after message)
            {
                return;
            }
            if(isFull(game))//check is array full or no(if full will end game)
            {
                return;
            }
            //_____________player Two_______________
            
            play(PlayerTwo,"Two",'O',game);
            if(isSuc(PlayerTwo,'O',game)) //check is player two winner or no(if winner will end game after messege)
            {
                return;
            }
            if(isFull(game))
            {
                return;
            }
        }
        
    }
    public static boolean isFull(Game game)
    {
        //check if array is full or no
        if(game.isFull())
        {
            System.out.println("_____Game Ended without winner , please try again_____");
            return true;
        }
        return false;
    }
    
    public static boolean isSuc(String namePlayer , char type ,Game game)
    {
        //return true if player that use (type) is winner
        if(game.isSuc(type))
        {
            System.out.println("____________________"+namePlayer+" is winner____________________");
            return true;
        }
        //else return false
        return false;
    }
    
    public static void play(String NamePlayer ,String num, char type,Game game)
    {
        //print the player's number and name
        System.out.println("_____Player "+num+"_____-> ["+NamePlayer+"]");
        //push the player's type of key in array
        game.pushKey(type);
        //display array
        game.display();
    }
    
    public static String getName(String num)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Name of player "+num+": ");
        String name = in.next();
        System.out.println("Hello, "+name);
        return name;
    }
}
//This is the a new line after some of months.

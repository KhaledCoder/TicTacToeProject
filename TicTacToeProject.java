
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
            if(game.isFull())
            {
                System.out.println("_____Game Ended without winer , please try again_____");
                return;
            }
            play(PlayerOne,1,'X',game);
            if(game.isSuc('X'))
            {
                System.out.println("____________________"+PlayerOne+" is win____________________");
                return;
            }
            play(PlayerTwo,2,'O',game);
            if(game.isSuc('O'))
            {
                System.out.println("____________________"+PlayerTwo+" is win____________________");
                return;
            }
        }
        
    }
    public static void play(String p ,int i, char type,Game game)
    {
        String num ;
        if(i == 1)
            num = "One";
        else
            num = "Two";
        System.out.println("_____Player "+num+"_____-> ["+p+"]");
        game.pushKey(type);
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

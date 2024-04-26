
import java.util.Scanner;

public class Game
{
    private char[][] arr;
    public Game()
    {
        arr = new char[][]{{'-','-','-'},
                           {'-','-','-'},
                           {'-','-','-'}};
    }
    public void display()
    {
        System.out.println("________________OutPut____________________");
        for (int i = 0; i < 3; i++)
        {
            if(i!=0)
                System.out.println("-----");
            for (int j = 0; j < 3; j++) 
            {
                if(j != 0)
                    System.out.print("|");
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    private boolean insert(char keyPlayer)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Row: ");
        int i = in.nextInt();
        System.out.print("Column: ");
        int j = in.nextInt();
        if(!CheckError.isPlaceTrue(i, j)) // if(CheckError.isPlaceTrue(i, j) == false)
        {
            System.out.println("---->This place is out of Array, please try again.");
            return false;
        }
        if(CheckError.isPlaceBusy(i, j, arr))
        {
            System.out.println("---->This place is (busy), please try again.");
            return false;
        }
        else
        {
            arr[i][j] = keyPlayer;
            return true;
        }        
    }

    public void pushKey(char keyPlayer)
    {
        if(insert(keyPlayer)) // if(insert(keyPlayer) == true)
            return;
        else
            pushKey(keyPlayer);
    }
    
    public boolean isSuc(char f)
    {
        return CheckSuccess.isSuccess(f, arr);
    }
    
    public boolean isFull()
    {
        return CheckError.isFull(arr);
    }
}

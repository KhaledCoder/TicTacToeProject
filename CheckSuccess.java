/*
 * This class contains methods to check if a player has won the TicTacToe game.
 */
public class CheckSuccess
{
    public static boolean isSuccess(char f , char[][] arr)
    {
        //row
        boolean row = isSucRow(f,arr);
        //column
        boolean col = isSucCol(f,arr);
        //scissors
        boolean sc = isSucScissors(f,arr);
        
        if(row || col || sc)
            return true;
        return false;
    }
    
    
    
    //Row______________________________>
    private static boolean isSucRow(char f , char[][] arr)
    {
        int row;
        for (int i = 0; i < 3; i++) {
            row = 0;
            for (int j = 0; j < 3; j++) {
                if(arr[i][j] == f)
                    row++;
            }
            if(row == 3)
                return true;
        }
        return false;
    }
    //Column_______________________________>
    private static boolean isSucCol(char f,char[][] arr)
    {
        for (int i = 0; i < 3; i++)
        {
            int col = 0;
            for (int j = 0; j < 3; j++)
            {
                if(arr[j][i] == f)
                    col++;
            }
            if(col == 3)
                return true;
        }
        return false;
    }
    
    //Scissors_________________________>
    private static boolean isSucScissors(char f,char[][] arr)
    {
        boolean right = isSucScissorsFromRight(f,arr);
        
        boolean left = isSucScissorsFromLeft(f,arr);
        
        if(right || left)
            return true;
        return false;
    }
    
    private static boolean isSucScissorsFromRight(char f,char[][] arr)
    {
         if(arr[0][2] == f && arr[1][1] == f && arr[2][0] == f)
             return true;
         return false;
    }
    private static boolean isSucScissorsFromLeft(char f,char[][] arr)
    {
         if(arr[0][0] == f && arr[1][1] == f && arr[2][2] == f)
             return true;
         return false;
    }
}

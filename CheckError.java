public class CheckError
{
    
    public static boolean isPlaceTrue(int i , int j)
    {
        if(i < 0 || i > 2)
            return false;
        else if(j < 0 || j > 2)
            return false;
        return true;
    }
    public static boolean isPlaceBusy(int i , int j , char[][] arr)
    {
        if(arr[i][j] == '-')
            return false;
        return true;
    }
    public static boolean isFull(char[][] arr)
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if(arr[i][j] == '-')
                    return false;
            }
        }
        return true;
    }
}

import javax.lang.model.util.ElementScanner6;

import sun.security.pkcs11.Secmod.DbMode;

public class DBinarySearch
{
    public int  opera(int a ,int low , int up)
    {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int mid = (low + up )/2;
        if(array[mid]==a)
        {
            return mid;
        }
        else if(low>up)
        {
            System.out.print("Ã»ÕÒµ½");
            return 0;
        }
        else if(a>array[mid]) 
        {
            return (opera(a, mid, up));
        }
        else 
        
            return (opera(a, low, mid));
        
    }

     public static void main(String[] args) {
        DBinarySearch db = new DBinarySearch();
        int temp = db.opera(4, 0, 9); 
        System.out.print(temp);   
    }

}
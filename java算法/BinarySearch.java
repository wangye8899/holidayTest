import javax.lang.model.util.ElementScanner6;

public class BinarySearch
{
    public int  search(int [] a,int value)
    {
        int result = 0 ;
        int low=0;
        int up=a.length-1;
        int mid=0;
        if(a.length<=0)
        {
            System.out.print("数组为空，查找出错");
        }
        else
        {
            while(low<=up)
            {
               
                mid = (low+up)/2;
                if(a[mid]==value)
                {
                    result = a[mid];
                    return result;
               
                }
                else  if(value>a[mid])
                {
                  low = mid +1;
                }
                else
                {
                    up = mid -1 ;
                }
                
            }
        }
        return result;


    }

    public static void main(String [] argv)
    {

        BinarySearch bin = new BinarySearch();
        int [] a = {1,3,5,7,9,11};
        int value = 5; 
        int b = bin.search(a, value);
        if(b==value)
        {
            System.out.print("找到"+b);    
        }
        
    }




}
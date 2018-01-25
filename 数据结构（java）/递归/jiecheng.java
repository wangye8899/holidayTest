public class jiecheng
{
    public int  operate(int a)
    {
        if(a==0||a==1)
        {
            return 1 ;
        
        }
        else
        {
            return (a*operate(a-1));
        }
    }

    public static void main(String [] argv)
    {
        int a =10;
        jiecheng j = new jiecheng();
        int temp = j.operate(a);
        System.out.print(temp);
    }
}
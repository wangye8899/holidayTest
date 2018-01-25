public class sanjiao
{
    public int  operate(int a)
    {
        if(a==1)
        {
            return 1;
        }
        else
        {
            return (a*operate(a-1));
        }

    }

    public static void main(String [] argv)
    {
        int a =5 ;
        sanjiao san = new sanjiao();
        int temp = san.operate(a);
        System.out.print(temp);
    }


}
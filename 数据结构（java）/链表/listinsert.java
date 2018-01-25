public class listinsert
{
    public void insert(int []a,int t,int value)
    {
        int temp=0;
        int sun = 0;
        int [] b = new int [0] ;
        if(t>a.length-1)
        {
            System.out.print("failure");
        }
        else
        {
             b = new int [a.length+1]; 
            System.arraycopy(a, 0, b, 0, a.length);
            for(int i=b.length-1;i>t;i--)
            {
                b[i] = b[i-1];                
            }
            b[t] = value;
        }

        for(int i=0 ;i<b.length;i++)
        {
            System.out.print(b[i]);
        }
        


    }
    public static void main(String [] argv)
    {
        int  [] a =  {1,2,3,5,6,7,8};
        int t =3;
        int value = 4;
        listinsert lin = new listinsert();
        lin.insert(a, t, value);
    }


}
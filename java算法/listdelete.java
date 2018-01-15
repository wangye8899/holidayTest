import sun.security.util.Length;

public class listdelete
{
    public void delete(int [] a,int t)
    {
        if(t<0||t>a.length-1)
        {
            System.out.print("failure");
        }
        else if(t==a.length-1)
        {
            System.out.print("special process");
        }
        else
        {
            for(int i = t,j=i+1;i<a.length&&j<a.length;i++,j++)
            {
                    a[i] = a[j];
            }
            a[a.length-1] = 0;
            for(int i =0;i<a.length;i++)
        {
            if(a[i]==0)
            {}
            else
            System.out.print(a[i]);
        }

        }

        
    }

    public static void main(String[] argv)
    {
        int a [] = {1,2,3,4,5,6,7};
        int t = 4;
        listdelete list = new listdelete();
        list.delete(a, t);

    }


}
public class mergelist
{
    //将两个有序线性表合并成一个新的有序线性表
    public void operate(int[]a ,int[]b,int[]c)
    {       
        //a、b、c的三个指针
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length&&j<b.length)
        {
            if(a[i]>b[j])
            {
                c[k]=b[j]; 
                k++;
                j++;
            }
            else if(a[i]<b[j])
            {
                c[k] = a[i];
                k++;
                i++;
            }
        }

        if(i>=a.length)
        {
            while(j<b.length)
            {
                c[k]=b[j];
                k++;
                j++;
            }
        }
        if(j>=b.length)
        {
            while(i<a.length)
            {
                c[k] = a[i];
                k++;
                i++;
            }
        }

        for(int v=0;v<c.length;v++)
        {
            System.out.println(c[v]);
        }


    }

    public static void main(String [] argv)
    {
        int [] a ={1,3,5,7,9,11};
        int [] b = {2,4,6,8,10,12};
        int [] c = new int [100];
        mergelist me = new mergelist();
        me.operate(a, b, c);
       
    }
}
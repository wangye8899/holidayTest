import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class linear_list
{
    int [] newb = new int [0];
    int alength=0;
    int blength=0;
    int temp=0;
  
    //将数组a中的不同于数组b中的元素放入b中
    public void union(int[] a , int [] b )
    {
        int flag =0;
        alength = a.length;
        blength = b.length;
     
        for(int i=0;i<a.length;i++)
        {
            temp = a[i];
            for(int j =0 ;j<b.length;j++)
            {
                if(temp==b[j])
                {
                    flag = 0;//做标记
                    break;//退出当前循环
                }
                else
                {
                    flag++;
                    if(flag==b.length)
                    {
                        
                        blength++;
                        newb = new int [blength];
                        System.arraycopy(b, 0, newb, 0, b.length);
                        b=newb;
                        newb[blength-1] = temp;
                        flag = 0;
                    }
                }
            } 
        }
        
        for(int i=0;i<newb.length;i++)
        {
            System.out.print(newb[i]+",");
        }
    }

    public static void main(String[] arv)
    {
        int [] a = {1,2,5,8,21,88,4732847};
        int [] b = {1,2,5,32,8,6};
        linear_list lin = new linear_list();
        lin.union(a, b);
    }
}
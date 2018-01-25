public class SelectSort
{
    public void sort(int [] a)
    {
        int min =0;
        int index = 0;
        for(int i=0;i<a.length;i++)
        {
            //ÁÙÊ±¸³Öµ
            min = a[i];
            index = i;
            for(int j=i;j<a.length;j++)
            {
                if(a[j]<min)
                {
                    min = a[j];
                    index = j;
                }
            }
            if(index!=i)
            {

                int temp = a[index];
                a[index] = a[i];
                a[i] = temp;
                
            }
        }
        for(int i =0;i<a.length;i++)
        {
            System.out.print(a[i]+",");
        }
    }

    public static void main(String [] argv)
    {
        int [] a = {1,4,2,5,11,22,14,13};  
        SelectSort selectSort = new SelectSort();
        selectSort.sort(a);
    }


}
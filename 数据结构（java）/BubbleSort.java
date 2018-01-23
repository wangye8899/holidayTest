public class BubbleSort
{
    int temp = 0;
    public void sort(int [] a )
    {
        for(int i=a.length-1;i>0;i--)
        {
                for(int j=0;j<i;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }
                }
        }
       
        for(int i =0;i<a.length;i++)
        {
            System.out.print(a[i]+",");
        }
    }

    public static void main(String [] argv)
    {
        int [] a = {1,5,3,4,2,65,7,43};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(a);
    }

}
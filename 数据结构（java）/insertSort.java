public class insertSort
{
    int temp=0;
    int j=0;
    public void sort(int [] a)
    {
        for(int i=1;i<a.length;i++)
        {
            temp = a[i];//ȡ����������
            j = i-1;//i-1Ϊ��������������һλ
            //���������бȽϾͿ�����
            while(j>0&&temp<a[j])
            {
                a[j+1] = a[j]; 
                j--;
            }
            a[j+1] = temp;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+",");
        }

    }

    public static void main(String [] argv)
    {
        int [] a = {1,4,2,6,5,88,56,43};
        insertSort insert = new insertSort();
        insert.sort(a);
    }
}
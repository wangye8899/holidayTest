public class Queue
{
    private int maxsize;
    private int item;
    private int front=0;
    private int near=-1;
    int [] array;

    public Queue(int size)
    {
        this.maxsize = size;
        array = new int [size];
    }

    public void insert(int value)
    {
        if(near==maxsize-1)
        {
            near = -1;
        }
        array[++near]=value;
    }

    public void remove()
    {
        int value = array[front++];
        System.out.print(value);
    }
    public void peek()
    {
        System.out.print(array[front-1]);
    }
    public void isfull()
    {
        if(item=maxsize)
        {
            System.out.print("��������");
        }
    }
    

    public static void main(String []argv)
    {
        int size = 10 ;
        Queue q = new Queue(size);
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        
    }



}
public class stacksun
{

    private int maxsize;
    private int top=-1;
    char [] arraystack;
    public stacksun(int length)
    {
        maxsize = length;
        arraystack = new char [maxsize];
    }
    //��ջ
    public void push(char value)
    {
        //ջ��ָ�������ƣ�Ȼ��ֵ
        arraystack[++top] = value;
    }
    public char pop()
    {
        char value = arraystack[top--];
        return value;

    }
    public boolean empty()
    {
        if(top==-1)
        {
            System.out.print("����ջΪ��");
            return true;
        }
        else
        {
            return false;
        }
    }
    public void full()
    {
        if(top == maxsize-1)
        {
            System.out.print("ջ�Ѿ���");
        }
    }
    public static void main(String [] argv)
    {
        Stack stack = new Stack(10);
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while(!stack.empty())
        {
            stack.pop();
        }
    }
}

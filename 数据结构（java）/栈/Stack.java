/*
 * @Author: HH.wangye 
 * @Date: 2018-01-18 09:23:43 
 * @Last Modified by: HH.wangye
 * @Last Modified time: 2018-01-18 10:18:49
 */



public class Stack
{
    private int maxsize;
    private int top=-1;
    int [] arraystack;
    public Stack(int length)
    {
        maxsize = length;
        arraystack = new int [maxsize];
    }
//��ջ
    public void push(int value)
    {
        //ջ��ָ�������ƣ�Ȼ��ֵ
        arraystack[++top] = value;
    }
    public void pop()
    {
        int value = arraystack[top--];
        System.out.print(value); 
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
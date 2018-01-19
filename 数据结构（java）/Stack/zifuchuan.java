import javax.lang.model.util.ElementScanner6;

import com.sun.org.apache.xpath.internal.SourceTree;

public class zifuchuan
{
    stacksun stack = new stacksun(10);
    public void check(String argv)
    {
        for(int i=0;i<argv.length();i++)
        {
            char cha = argv.charAt(i);
            switch (cha)
            {
                case '{':
                case '[':
                case '(':
                    stack.push(cha);
                    break;
                case '}':
                case ']':
                case ')':
                    if(!stack.empty())
                    {
                        char chx = stack.pop();
                        if(chx=='{'&&cha!='}')
                        {
                            System.out.println("fail");
                        }
                        else if(chx=='['&&cha!=']')
                        {
                            System.out.println("fail");
                        }
                        else if(chx=='('&&cha!=')')
                        {
                            System.out.println("fail");
                        }
                        else
                        {}
                        break;
                    }
                    else
                    {
                        System.out.print("ջΪ�գ��Ҳ���");
                    }

            }
        }
    }
    public static void main(String [] argv)
    {
        String temp = "wy{[(a]]}";
        zifuchuan z = new zifuchuan();
        z.check(temp); 

    }



}

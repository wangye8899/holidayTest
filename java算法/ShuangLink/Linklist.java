package ShuangLink;

public class Linklist {

    private Link first = null;
    private Link last  = null;
    public boolean isempty()
    {
        return (first == null);
    }

    public Linklist()
    {
        first = null;
        last = null;
    }

    public void inserFirstLink(int id ,int value)
    {
        Link link = new Link(id ,value);
        if(isempty())
        {

            last = link;
            first = link;

        }
        else
        {
            link.next = first;
            first = link;
        }
    }

    public void insertLastLink(int id ,int value)
    {
        Link link = new Link(id,value);
        if(isempty())
        {
            first = link ;
            last = link;
        }
        else
        {
            last.next = link;
            last = link;
        }
    }

    public void deletelist(int id )
    {
        Link current;
        Link previous;
        previous = first;
        current = first;
        if (isempty())
        {
            System.out.println("双端链表为空，无法删除");
        }
        else
        {
            while(current.id!=id)
            {

                previous = current;
                current = current.next;
            }
            if(current==first)
            {
                first = first.next;
            }
            previous.next = current.next;
        }

    }

    public void deleteFirst(int id)
    {
        if(first.id == id)
        {
            if(first.next==null)
            {
                last = null;

            }
            first = first.next;
        }
    }

    public void displaylist()
    {
        Link temp = first;
        if(isempty())
        {
            System.out.println("链表为空");
        }
        else
        {
            while(temp!=null)
            {
                temp.display();
                temp = temp.next;
            }
            System.out.println("链表输出结束");
        }
    }

    public static void main(String [] argv)
    {
        Linklist list = new Linklist();

        list.inserFirstLink(1,11);
        list.inserFirstLink(2,22);
        list.inserFirstLink(3,33);
        list.inserFirstLink(4,44);
        list.insertLastLink(5,55);
        list.insertLastLink(6,66);
        list.insertLastLink(7,77);
        //list.displaylist();
        list.deletelist(4);
        list.inserFirstLink(4,44);
        list.displaylist();
    }

}

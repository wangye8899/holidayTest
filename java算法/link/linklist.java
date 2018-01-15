package link;

public class linklist {
    private link first;//head
    public linklist()
    {
        first = null;
    }

    public boolean isempty()
    {
        return (first==null);
    }

    public void insertlist(int id ,int value)
    {
        link newlink = new link(id,value);
        newlink.next = first;
        first = newlink;
    }
    public void deletelist()
    {
        while(first!=null)
        {
            first = first.next;
        }

    }
    public void displaylist()
    {
        link l ;
        l = first;
        while(l!=null)
        {
            l.displaylink();
            l = l.next;
        }
    }

    public void find(int key)
    {
        link current = first;
        while(current.id!=key)
        {
            if(current.next==null)
            {
                System.out.println("查找失败");
            }
            else
            {
                current = current.next;
            }
        }
        System.out.println("找到相应的值"+current.value);
    }

    public void delete(int key)
    {
        System.out.println("您需要删除的是'"+key+"'号节点");
        link current = first;
        link previous = first;
        while(current.id!=key)
        {
            if(current.next!=null)
            {
                previous = current;
                current = current.next;
            }
            else
            {
                System.out.println("不存在这样的节点等待删除");
            }
        }

        if(current==first)
        {
            first = first.next;
        }
        else
        {
            previous.next = current.next;
        }


    }

    public static  void main(String [] argv)
    {
        linklist l = new linklist();
        l.insertlist(1,11);
        l.insertlist(2,22);
        l.insertlist(3,33);
        l.insertlist(4,44);
        l.insertlist(5,55);
        l.displaylist();
        l.find(2);
        l.delete(2);
        l.displaylist();
        System.out.println("____________________________");
        while(!l.isempty())
        {
            l.deletelist();
        }
        System.out.println("删除后:");
        l.deletelist();
    }
}

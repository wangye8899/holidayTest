package ShuangLink;

public class Link {
    public int id ;
    public int value;
    public Link next;

    public Link(int id , int value)
    {
        this.id = id ;
        this.value = value ;
    }
    public void display()
    {
        System.out.println("{"+id+","+value+"}");
    }
}

package link;

public class link {
    public int id;
    public int value;
    public link next;

    public link(int id ,int value)
    {
        this.id = id;
        this.value = value;
    }
    public void displaylink()
    {
        System.out.print("{"+id+","+value+"}");
    }
}

public class Mustang implements Horse
{
    private int weight;
    private String name;
    public Mustang(int weight, String name)
    {
        this.weight=weight;
        this.name=name;
    }
    public String getName(){return this.name;}
    public int getWeight() {return this.weight;}
}

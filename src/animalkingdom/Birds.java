package animalkingdom;

public class Birds extends Animals
{
    // private int id;
    // private String name;
    // private int year;
	public Birds(int id, String name, int year)
	{
        super(id, name, year);
		// this.id = id;
		// this.name = name;
		// this.year = year;
	}
	@Override
    public String getMove()
    {
        return "fly";
    }
    @Override
    public String getBreath()
    {
        return "lungs";
    }
    @Override
    public String getReproduce()
    {
        return "eggs";
    }


    @Override
    public String toString()
    {
        return "Birds: " + " ID " + id + " Name " + name + " Year " + year ;
    }
}
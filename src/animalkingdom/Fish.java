package animalkingdom;

public class Fish extends Animals
{
	// private int id;
 //    private String name;
 //    private int year;
	public Fish(int id, String name, int year)
	{
		super(id, name, year);
		// this.id = id;
		// this.name = name;
		// this.year = year;
	}
	@Override
    public String getMove()
    {
        return "swim";
    }
    @Override
    public String getBreath()
    {
        return "gills";
    }
    @Override
    public String getReproduce()
    {
        return "eggs";
    }

    @Override
    public String toString()
    {
        return "Fish: " + " ID " + id + " Name " + name + " Year " + year ;
    }
}
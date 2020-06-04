package animalkingdom;

public class Mammals extends Animals
{
	private int id;
    private String name;
    private int year;
	public Mammals(int id, String name, int year)
	{
		this.id = id;
		this.name = name;
		this.year = year;
	}
	@Override
    public String getMove()
    {
        return "walk";
    }
    @Override
    public String getBreath()
    {
        return "lungs";
    }
    @Override
    public String getReproduce()
    {
        return "live births";
    }
}
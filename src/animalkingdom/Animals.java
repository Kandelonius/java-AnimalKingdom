package animalkingdom;

abstract class Animals
{
	protected int id;
	protected String name;
	protected int year;

	public Animals(int id, String name, int year)
	{
		this.id = id;
		this.name = name;
		this.year = year;
	}
	
	abstract String getMove();
	abstract String getBreath();
	abstract String getReproduce();
	int getYear()
    {
        return year;
    }
    String getName()
    {
    	return name;
    }
}
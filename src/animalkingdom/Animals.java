package animalkingdom;

abstract class Animals
{
	protected int fuel;

	public Animals()
	{
		fuel = 1;
	}
	
	abstract String getMove();
	abstract String getBreath();
	abstract String getReproduce();
	void eat(int i)
	{
		fuel += i;
	}
	// public int getId()
	// {
	// 	return id;
	// }
	// public String getName()
	// {
	// 	return name;
	// }
	// public int getYear()
 //    {
 //        return year;
 //    }

	// public void setId(int id)
	// {
	// 	this.id = id;
	// }
	// public void setId(String name)
	// {
	// 	this.name = name;
	// }
	// public void setyear(int year)
	// {
	// 	this.year = year;
	// }

}
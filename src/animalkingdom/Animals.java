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
}
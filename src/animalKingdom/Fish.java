package animalKingdom;

public class Fish extends AbstractAnimal
{

	public Fish(String name, int yearNamed)
	{
		super(name, yearNamed);
	}

	@Override
	public String move()
	{
		return "swim";
	}

	@Override
	public String breath()
	{
		return "gills";
	}

	@Override
	public String reproduce()
	{
		return "eggs";
	}

	public String getName()
	{
		return name;
	}

	public int getYear()
	{
		return yearNamed;
	}

	@Override
	public String toString()
	{
		return "Animals{id=" + id + ", name='" + name + "', yearNamed=" + yearNamed + "}\n";
	}

}
package animalKingdom;

public class Bird extends AbstractAnimal
{

	public Bird(String name, int yearNamed)
	{
		super(name, yearNamed);
	}

	@Override
	public String move()
	{
		return "fly";
	}

	@Override
	public String breath()
	{
		return "lungs";
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
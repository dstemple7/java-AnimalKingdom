package animalKingdom;

public class Mammal extends AbstractAnimal
{

	public Mammal(String name, int yearNamed)
	{
		super(name, yearNamed);
	}

	@Override
	public String move()
	{
		return "walk";
	}

	@Override
	public String breath()
	{
		return "lungs";
	}

	@Override
	public String reproduce()
	{
		return "live births";
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
package animalKingdom;

abstract class AbstractAnimal
{
	private static int maxId = -1;
	protected int id;
	int yearNamed;
	String name;

	//constructor
	public AbstractAnimal(String name, int yearNamed)
	{
		maxId++;
		this.id = maxId;
		this.name = name;
		this.yearNamed = yearNamed;
	}

	abstract String move();
	abstract String breath();
	abstract String reproduce();

	public int getId()
	{
		return id;
	}

	String getName()
	{
		return name;
	}

	int getYear()
	{
		return yearNamed;
	}

	String consumeFood()
	{
		return "Gulp";
	}
}
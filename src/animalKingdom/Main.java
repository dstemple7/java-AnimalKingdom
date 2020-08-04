package animalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main
{
	public static List<AbstractAnimal> filteredList = new ArrayList<>();
	public static void filterAnimal(List<AbstractAnimal> animals, CheckAnimal tester)
	{
		filteredList.clear();
		for (AbstractAnimal a : animals)
		{
			if (tester.test(a))
			{
				filteredList.add(a);
			}
		}
	}

	public static void main(String[] args)
	{
		System.out.println("*** MVP ***");

		Mammal panda = new Mammal("Panda", 1869);
		Mammal zebra = new Mammal("Zebra", 1778);
		Mammal koala = new Mammal("Koala", 1816);
		Mammal sloth = new Mammal("Sloth", 1804);
		Mammal armadillo = new Mammal("Armadillo", 1758);
		Mammal raccoon = new Mammal("Raccoon", 1758);
		Mammal bigfoot = new Mammal("Bigfoot", 2021);

		Bird pigeon = new Bird("Pigeon", 1837);
		Bird peacock = new Bird("Peacock", 1821);
		Bird toucan = new Bird("Toucan", 1758);
		Bird parrot = new Bird("Parrot", 1824);
		Bird swan = new Bird("Swan", 1758);

		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

		List<AbstractAnimal> myList = new ArrayList<>();
		myList.add(panda);
		myList.add(zebra);
		myList.add(koala);
		myList.add(sloth);
		myList.add(armadillo);
		myList.add(raccoon);
		myList.add(bigfoot);
		myList.add(pigeon);
		myList.add(peacock);
		myList.add(toucan);
		myList.add(parrot);
		myList.add(swan);
		myList.add(salmon);
		myList.add(catfish);
		myList.add(perch);

		System.out.println("*** List all the animals in descending order by year named ***");
		myList.sort((a1,a2) -> a2.getYear() - a1.getYear());
		// myList.forEach(a -> System.out.println(a.getId() + " " + a.getName() + " " + a.getYear()));
		System.out.println(myList);

		System.out.println();

		System.out.println("*** List all the animals alphabetically ***");
		myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		// myList.forEach(a -> System.out.println(a.getId() + " " + a.getName() + " " + a.getYear()));
		System.out.println(myList);

		System.out.println();

		System.out.println("*** List all the animals order by how they move ***");
		myList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
		// myList.forEach(a -> System.out.println(a.getId() + " " + a.getName() + " " + a.getYear()));
		System.out.println(myList);

		System.out.println();

		System.out.println("*** List only those animals the breath with lungs ***");

		filterAnimal(myList, a -> (a.breath()=="lungs"));
		filteredList.forEach(a -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYear()));

		System.out.println();

		System.out.println("*** List only those animals that breath with lungs and were named in 1758 ***");
		filterAnimal(myList, a -> (a.breath()=="lungs")&&a.getYear()==1758);
		filteredList.forEach(a -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYear()));

		System.out.println();

		System.out.println("*** List only those animals that lay eggs and breath with lungs ***");
		filterAnimal(myList, a -> (a.reproduce()=="eggs")&&a.breath()=="lungs");
		filteredList.forEach(a -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYear()));

		System.out.println();

		System.out.println("*** List alphabetically only those animals that were named in 1758 ***");
		filterAnimal(myList, a -> a.getYear()==1758);
		filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		filteredList.forEach(a -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYear()));

		System.out.println();

		System.out.println("*** Stretch Goal ***");

		System.out.println();

		System.out.println("*** For the list of animals, list alphabetically those animals that are mammals ***");
		filterAnimal(myList, a -> ((a instanceof Mammal)));
		filteredList.forEach(a -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYear()));
	}

}
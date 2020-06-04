package animalkingdom;

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to the jungle");

		// (int id, String name, int year)
		Mammals panda = new Mammals(0, "Panda", 1869);
		Mammals zebra = new Mammals(1, "Zebra", 1778);
		Mammals koala = new Mammals(2, "Koala", 1816);
		Mammals sloth = new Mammals(3, "Sloth", 1804);
		Mammals armadillo = new Mammals(4, "Armadillo", 1758);
		Mammals raccoon = new Mammals(5, "Raccoon", 1758);
		Mammals bigfoot = new Mammals(6, "Bigfoot", 2021);

		Birds pigeon = new Birds(7, "Pigeon", 1837);
		Birds peacock = new Birds(8, "Peacock", 1821);
		Birds toucan = new Birds(9, "Toucan", 1758);
		Birds parrot = new Birds(10, "Parrot", 1824);
		Birds swan = new Birds(11, "Swan", 1758);

		Fish salmon = new Fish(12, "Salmon", 1758);
		Fish catfish = new Fish(13, "Catfish", 1817);
		Fish perch = new Fish(14, "Perch", 1758);

		List<Animals> fullList = new ArrayList<>();
		fullList.add(panda);
		fullList.add(zebra);
		fullList.add(koala);
		fullList.add(sloth);
		fullList.add(armadillo);
		fullList.add(raccoon);
		fullList.add(bigfoot);
		fullList.add(pigeon);
		fullList.add(peacock);
		fullList.add(toucan);
		fullList.add(parrot);
		fullList.add(swan);
		fullList.add(salmon);
		fullList.add(catfish);
		fullList.add(perch);

		// System.out.println(fullList.size());
		System.out.println(fullList.toString());
		// System.out.println(pigeon.getYear());
		// System.out.println(pigeon.getName());
		// System.out.println(pigeon.getMove());
		// System.out.println(pigeon.getBreath());

		// sort by year
		System.out.println("\n*** sort by year newest to oldest ***");
		// humans.sort((Human h1, Human h2) -> h1.getName().compareTo(h2.getName()));
		// Integer.compare(d1.getNoOfStars(), d2.getNoOfStars());
		fullList.sort((Animals a1, Animals a2) -> Integer.compare(a2.getYear(), a1.getYear()));
		// fullList.sort(Comparator.comparing(a -> a.getYear(), Comparator.reverseOrder()));
		fullList.forEach((a) -> System.out.println(a));

		System.out.println("\n*** sort by name A to Z ***");
		fullList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        fullList.forEach((a) -> System.out.println(a));

	}
}
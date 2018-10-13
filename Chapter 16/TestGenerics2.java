import java.util.*;

public class TestGenerics2 {
	public static void main(String[] args) {
		new TestGenerics2().go();
	}
	
	public void go() {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Dog());
		takeAnimals(animals);
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		takeAnimals(dogs);
	}
	
	public <T extends Animal> void takeAnimals(ArrayList<T> animals) {
		for(Animal a : animals) {
			a.eat();
		}
	}
}
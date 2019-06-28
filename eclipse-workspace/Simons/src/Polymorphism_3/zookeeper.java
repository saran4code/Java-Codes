package Polymorphism_3;

public class zookeeper {
	public void feedAnimals(Animal[] animals) {
		for (Animal a : animals) {
			String name = a.getName();
			String food = a.eats();
			System.out.println(name + " likes " + food);
			a.eats(food);
			System.out.println("==============================");
			
		}
		
	}

}

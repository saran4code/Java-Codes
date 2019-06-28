package Polymorphism_2;

public class zookeeper {
	public void feedAnimals(Animal[] animals) {
		for (Animal a : animals) {
			String name = a.getName();
			String saran = a.eats();
			System.out.println(name + " likes " + saran);
			a.eats(saran);
			System.out.println("=================================");
			
		}
	}
}

package Polymorphism_3;

public class method_main_3 {
	public static void main(String[] args) {
		Animal[] choco = {new Lion(), new Dog()};
		zookeeper keeper = new zookeeper();
		keeper.feedAnimals(choco);	
		
	}
	

}

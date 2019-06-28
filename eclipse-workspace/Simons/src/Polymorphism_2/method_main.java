package Polymorphism_2;

public class method_main {
	public static void main(String[] args) {
		Animal[] o = { new Dog(), new Lion()};
		zookeeper keeper = new zookeeper();
		keeper.feedAnimals(o);
		
	}

}

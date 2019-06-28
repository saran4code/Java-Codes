package fieldAccess;

public class Box {
	
	private Thing[] things = {
			new Thing(), new Thing(), new Thing()
	};
	
	
	public Thing getOneThing() {
		return things[2];
	}
	
	public Thing[] getManyThings() {
		return things;
		
	}
	
	public void showThings() {
		System.out.println("Things: ");
		for (Thing t : things ) {
			System.out.println(t.toString());
		}
		
		System.out.println("---------------------------------------------------");
			
	}

}

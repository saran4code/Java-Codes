package m8l6b;

public class SpySatellite extends Assets implements Photographer, Flyer{
	
	public SpySatellite() {
		super(1_000_000_000);
	}
	
	@Override
	public String takePhoto() {
		return "picture of your neighbor's house with unmarked truck outside"
				+ " and people furtively carrying odd-shaped packages inside. "
				+ " License plates of truck clearly readable.";
	}
	
	@Override
	public void takeOff() {
		System.out.println("Roar of unimaginable quantities of hydranize burning, "
				+ "huge amounts of heat and noise, rapidly diminishes to nothing "
				+ "but a thin vertical vapor trail.");
	}

}

package m8l6b;

public class PilotWithCamera implements Photographer, Flyer{
	
	@Override
	public String takePhoto() {
		return "Slightly shakey image of wide sweeping vista, "
				+ "largely obscured by clouds, from above.";
	}
	
	@Override
	public void takeOff() {
		System.out.println("Ladies and gentlemen, please fasten your seatbelts!");
	}

}

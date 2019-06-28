package m8l6b;

public class M8L6B {
	public static void main(String[] args) {
		Photographer [] photographers = {
				new MomWithCamera(),
				new MomWithGrownUpKidsAndCamera(),
				new PilotWithCamera(),
				new SpySatellite(),
		};
		
		for (Photographer p : photographers) {
			if (p instanceof Flyer) {
				((Flyer)p).takeOff();
			}
			
			String photo = p.takePhoto();
			System.out.println("Image taken by " 
					+ p.getClass().getName()
					+ " is " + photo
			);
			
			if (p instanceof ProfessionalPhotographer) {
				int fee = ((ProfessionalPhotographer)p).howMuchDoYouChargeForAnEightByTen();
				System.out.println("Oh, " + fee + " never mind, that's too expensive");
			}
			System.out.println("================================================\n");
		}
	}

}

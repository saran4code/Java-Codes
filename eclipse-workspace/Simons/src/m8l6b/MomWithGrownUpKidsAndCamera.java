package m8l6b;

public class MomWithGrownUpKidsAndCamera implements ProfessionalPhotographer{
	
	@Override
		public int howMuchDoYouChargeForAnEightByTen() {
		return 50 + ( 10 * (int)(Math.random() * 10));
	}
	
	
	@Override
	public String takePhoto() {
		return "Beautiful image of kids with perfect expression, "
				+ "wonderful light, well coordinated clothing, and "
				+ "non-distracting background.";
	}

}

package m8l6b;

public class Asset {
	private int value;
	public Asset(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void applyAnnualDepriciation() {
		value = 8 * value / 10;
	}

}

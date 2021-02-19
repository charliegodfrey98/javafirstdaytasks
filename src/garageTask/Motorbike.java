package garageTask;

public class Motorbike extends Vehicle {

	private int bikeTax;

	private String bikeName;

	public Motorbike(String BikeName, int wheels, String make, int litre, int bikeTax) {
		super(wheels, make, litre);
		this.setbikeTax(bikeTax);
		this.setBikeName(bikeName);

	}

	public int getbikeTax() {
		return bikeTax;
	}

	public void setbikeTax(int bikeTax) {
		this.bikeTax = bikeTax;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

}

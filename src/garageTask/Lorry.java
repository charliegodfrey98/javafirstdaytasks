package garageTask;

public class Lorry extends Vehicle {

	private int lorryTax;
	private String lorryName;

	public Lorry(String lorryName, int wheels, String make, int litre, int lorryTax) {
		super(wheels, make, litre);
		this.setLorryTax(lorryTax);
		this.setLorryName(lorryName);

	}

	public int getLorryTax() {
		return lorryTax;
	}

	public void setLorryTax(int lorryTax) {
		this.lorryTax = lorryTax;
	}

	public String getLorryName() {
		return lorryName;
	}

	public void setLorryName(String lorryName) {
		this.lorryName = lorryName;
	}

}

package garageTask;

public abstract class Vehicle {

	private int wheels;

	private String make;

	private int litre;

	public abstract int getCarTax();

	public Vehicle() {
		super();
	}

	public Vehicle(int wheels, String make, int litre) {
		this.wheels = wheels;
		this.make = make;
		this.litre = litre;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels() {
		this.wheels = wheels;
	}

	public String getMake() {
		return make;
	}

	public void setMake() {
		this.make = make;
	}

	public int getLitre() {
		return litre;
	}

	public void setLitre() {
		this.litre = litre;
	}

	public void print() {
		System.out.println(this.getMake() + " " + this.getWheels() + " wheels " + this.getLitre() + " litre engine");
		System.out.println(this.getCarTax());
	}

}

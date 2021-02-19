package garageTask;

public class Car extends Vehicle {

	private int carTax;

	private String carName;

	public Car(String carName, int wheels, String make, int litre, int carTax) {
		super(wheels, make, litre);
		this.setCarTax(carTax);
		this.setCarName(carName);

	}

	public int getCarTax() {
		return carTax;
	}

	public void setCarTax(int carTax) {
		this.carTax = carTax;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

}

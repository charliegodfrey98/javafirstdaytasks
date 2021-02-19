package garageTask;

public class Runner {
	public static void main(String[] args) {
		Garage garage1 = new Garage();

		garage1.addVehicle(new Car("car", 4, "ford", 2, 100));
		garage1.addVehicle(new Motorbike("Motor Bike", 2, "yahmha", 1, 500));
		garage1.addVehicle(new Lorry("Lorry", 10, "mac", 8, 1000));
		garage1.printGarage();

	}

}

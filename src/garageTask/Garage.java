package garageTask;

import java.util.ArrayList;

public class Garage {

	public ArrayList<Vehicle> garage = new ArrayList<>();

	public void addVehicle(Vehicle vehicle1) {
		garage.add(vehicle1);
	}

	public void printGarage() {
		for (int i = 0; i < garage.size(); i++) {
			Vehicle currentVehicle = garage.get(i);
			currentVehicle.print();

		}
	}

}

package service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import model.Car;

@Service
public class CarService {
	ArrayList<Car> cars = new ArrayList<Car>();
	public CarService() {
		Car c = new Car();
		c.setId("1");
		c.setManufacturer("Volvo");
		c.setcarName("XC90");
		cars.add(c);

		c = new Car();
		c.setId("2");
		c.setManufacturer("Perodua");
		c.setcarName("Myvi");
		cars.add(c);
	}
	public Car getCar(String id) {
		for(Car car:cars) {
			if(car.getId().equalsIgnoreCase(id)) return car;
		}
	    return null;
	}
	public ArrayList<Car> getAll() {
		return cars;
	}
}
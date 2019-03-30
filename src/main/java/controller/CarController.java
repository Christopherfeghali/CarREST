package controller;

import java.util.ArrayList;
import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.Car;
import service.CarService;

@CrossOrigin
@RestController
@RequestMapping("/car")
@ResponseBody
public class CarController {

	@Autowired
	CarService cs;

	@RequestMapping("/all")
	public ArrayList<Car> getAll() {
		return cs.getAll();
	}

	@RequestMapping("{id}")
	public Car getCar(@PathVariable("id") String id) {
		return cs.getCar(id);
	}
}


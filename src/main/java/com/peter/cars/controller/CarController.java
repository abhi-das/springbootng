package com.peter.cars.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peter.cars.model.CarModel;

@CrossOrigin(origins= "http://localhost:4200")
@RestController
@RequestMapping({ "/cars" })
public class CarController {

	private List<CarModel> cars = createList();
	
	@GetMapping(produces= "application/json")
	public List<CarModel> firstPage() {
		return cars;
	}
	
	@DeleteMapping(path = { "/{id}" })
	public ResponseEntity<CarModel> delete(@PathVariable("id") String id) {
		
		CarModel deleteCar = null;
		
		for(CarModel car: cars) {
			if(car.getCarId().equals(id)) {
				deleteCar = car;
				break;
			}
		}
		if( deleteCar == null ) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			cars.remove(deleteCar);
//			System.out.println(cars);
			return new ResponseEntity<>(deleteCar, HttpStatus.OK);
		}		
	}
	
	@PostMapping
	public ResponseEntity<CarModel> addCar(@RequestBody CarModel newCar) {
		cars.add(newCar);
		System.out.println(cars);
		return new ResponseEntity<>(newCar, HttpStatus.OK);
	}
	
	private static List<CarModel> createList() {
		
		List<CarModel> tempCars = new ArrayList<>();
		
		CarModel car1 = new CarModel();
		car1.setCarName("duster");
		car1.setCarId("001");
		car1.setCarPrice(500000);
		car1.setCarSeats(8);
		
		CarModel car2 = new CarModel();
		car2.setCarId("002");
		car2.setCarName("enjoy");
		car2.setCarPrice(700000);
		car2.setCarSeats(7);
		
		tempCars.add(car1);
		tempCars.add(car2);
		
		return tempCars;
	}
		
}

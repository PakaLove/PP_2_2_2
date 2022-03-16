package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    public List<Car> createCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "Black", 1));
        cars.add(new Car("Mersedes", "White", 2));
        cars.add(new Car("Audi", "Red", 3));
        cars.add(new Car("Volvo", "Grey", 4));
        cars.add(new Car("Lada", "BAKLAJAN", 5));
        return cars;
    }
}

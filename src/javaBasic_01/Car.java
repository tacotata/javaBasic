package javaBasic_01;

public class Car {

	String name;
	int number;

	@Override
	public String toString() {
		return "Car [name=" + name + ", number=" + number + "]";
	}

	public static void main(String[] args) {

		Car car = new Car();
		car.name = "자동차";
		car.number = 12;

		System.out.println(car);

	}

}

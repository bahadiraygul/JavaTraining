package car.repository;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("VW", "sport");
        car.setType("luxury");
        System.out.println(car);
    }
}

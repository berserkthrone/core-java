package OOPsClassAndInheritance;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setBrand("Porsche");
        car.setModel("Carrera");
        car.setColor("Red");
        car.setDoors(2);
        car.setConvertible(true);

        System.out.println("brand = " + car.getBrand());
        System.out.println("model = " + car.getModel());
        System.out.println("convertible = " + car.isConvertible());
        car.describeCar();

        Car targa = new Car();
        car.setBrand("Porsche");
        car.setModel("Carrera");
        car.setColor("Red");
        car.setDoors(2);
        car.setConvertible(true);

        targa.describeCar();
    }

}

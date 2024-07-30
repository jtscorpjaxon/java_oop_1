
public class Main {
    public static void main(String[] args) {
        System.out.println("Car class");
        Car car = new Car("OQ", "BYD", 170000000, false);
        car.getInfoCar();

        System.out.println("\nTriangle90 class");
        Triangle90 triangle = new Triangle90(3, 4);
        triangle.getInfo();

        System.out.println("\nPerson class");
        Person person = new Person("Jaxongir", 28, "Erkak", 176, true);
        person.getInson();
    }
}
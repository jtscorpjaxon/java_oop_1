public class Car {
    // Atributlar
    private String color;
    private String model;
    private double price;
    private boolean isMechanic;

    public Car(String color, String model, double price, boolean isAutomatic) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.isMechanic = isAutomatic;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public boolean isMechanic() {
        return isMechanic;
    }

    public void getInfoCar() {
        System.out.println("Rangi: " + color);
        System.out.println("Modeli: " + model);
        System.out.println("Narxi:" + price+ " so'm");
        System.out.println("Mexanikami?: " + (isMechanic ? "Ha" : "Yo'q"));
    }
}

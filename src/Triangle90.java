public class Triangle90 {
    private double tomonA;
    private double tomonB;
    private double gipotenuza;

    public Triangle90(double a, double b) {
        this.tomonA = a;
        this.tomonB = b;
        this.gipotenuza = Math.sqrt(a * a + b * b);
    }

    public double getTomonA() {
        return tomonA;
    }

    public void setTomonA(double tomonA) {
        this.tomonA = tomonA;
        this.gipotenuza = Math.sqrt(tomonA * tomonA + this.tomonB * this.tomonB);
    }

    public double getTomonB() {
        return tomonB;
    }

    public void setTomonB(double tomonB) {
        this.tomonB = tomonB;
        this.gipotenuza = Math.sqrt(this.tomonA * this.tomonA + tomonB * tomonB);
    }

    public double getGipotenuza() {
        return gipotenuza;
    }

    public void getInfo() {
        System.out.println("A tomoni: " + tomonA);
        System.out.println("B tomoni: " + tomonB);
        System.out.println("Gipotenuzasi: " + gipotenuza);
    }
}

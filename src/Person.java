public class Person {
    private String ismi;
    private int yoshi;
    private int boyi;
    private String jinsi;
    private boolean boydoq;

    // Konstruktor
    public Person(String name, int age, String jinsi, int boyi, boolean boydoq) {
        this.ismi = name;
        this.yoshi = age;
        this.boyi = boyi;
        this.jinsi = jinsi;
    }

    // Getter va Setterlar
    public String getIsmi() {
        return ismi;
    }

    public int getYoshi() {
        return yoshi;
    }

    public String getJinsi() {
        return jinsi;
    }

    public int getBoyi() {
            return boyi;
    }

    public boolean getBoydoq() {
            return boydoq;
    }

    public void getInson() {
        System.out.println("Ismi: " + ismi);
        System.out.println("Yoshi: " + yoshi);
        System.out.println("Bo'yi: " + boyi);
        System.out.println("Jinsi: " + jinsi);
        System.out.println("Boydoqmi: " + (boydoq ? "Ha" : "Yo'q"));
    }
}

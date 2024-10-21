public class Auto {
    private int year;
    private String model;

    public Auto(int year, String model) {
        this.year = year;
        this.model = model;
    }

    public String toString() {
        return "Auto{" +
                "year=" + year +
                ", model='" + model + '\'' +
                '}';
    }

    public void start() {
        System.out.println("VROOOM VROOOM");
    }

}

public class Driver extends Person {
    private Auto auto;

    Driver(String name) {
        super(name);

        auto = Factory.createDacia();
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public String getName() {
        return "Driver: " + super.getName();
    }

    public void drive() {
        System.out.println("Driver: driving ... " + auto);
        auto.start();
    }
}

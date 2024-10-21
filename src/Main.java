class Main {
    public static void printName(Person driver){
        System.out.println(driver.getName());
    }

    public static void drive(Person driver, Auto auto){
        if (driver instanceof Driver){
            ((Driver)driver).drive();
        }
        else throw new RuntimeException("Cannot drive");
    }
    public static void main(String[] args) {
        Person bob = new Driver("Bob");
        Driver dob = new Driver("Dob");
       // Person lob = new Person("Lob");
        Auto dacia = new Auto(1700, "Dacia");

        printName(dob);
        printName(bob);

        //drive(bob, dacia);
//        dob.setAuto(Factory.createDacia());
        dob.drive();
//        drive(lob);

//        dob.drive();
//        ((Driver)bob).drive();

//        System.out.println(bob.getName());
//        System.out.println(dob.getName());
//        System.out.println(john.getName());

        Scanner scanner = new Scanner();
        scanner.scan();
        //scanner.print();
    }
}
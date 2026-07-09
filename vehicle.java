interface Vehicle {
    void start();
}

interface Car extends Vehicle {
    void drive();
}

interface Electric {
    void charge();
}

class ElectricCar implements Car, Electric {

    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void drive() {
        System.out.println("Car is driving.");
    }

    @Override
    public void charge() {
        System.out.println("Battery is charging.");
    }

    void stop() {
        System.out.println("Car stopped.");
    }

    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();

        car.start();
        car.drive();
        car.charge();
        car.stop();
    }
}

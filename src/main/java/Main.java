public class Main {
    public static void main(String[] args) {
        Car first_car = new Car("Audi", 2012, true);
        Car second_car = new Car("BMW", 2001, false);
        Car third_car = new Car("Ford", 2019, true);
        Car fourth_car = new Car("VW", 2005, true);
        Car fifth_car = new Car("Kia", "Benzinium");
        Car sixth_car = new Car("Kia", 2015, false);
        Car seventh_car = new Car("Fiat", 1985, true, "Benzinium");

        fourth_car.carDetails();
        fifth_car.carPetrol();
        sixth_car.carDetails();
        seventh_car.carInfo();
        System.out.println(first_car.getMark());


    }
}

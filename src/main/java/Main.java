public class Main {
    public static void main(String[] args) {
        Car first_car = new Car("Audi", 2012, true);
        Car second_car = new Car("BMW", 2001, false);
        Car third_car = new Car("Ford", 2019, true);
        Car fourth_car = new Car("VW", 2005, true);
        Car fifth_car = new Car("Kia", "Benzinium");
        Car sixth_car = new Car("Kia", 2015, false);
        Car seventh_car = new Car("Fiat", 1985, true, "Benzinium");

//        fourth_car.carDetails();
//        fifth_car.carPetrol();
//        sixth_car.carDetails();
//        seventh_car.carInfo();
//        System.out.println(first_car.getMark());
//        System.out.println(second_car.getProductionYear());
//        System.out.println(third_car.getIsItWork());
//        System.out.println(fifth_car.getPetrol());
//        first_car.carDetails();
//        first_car.setMark("Dacia");
//        first_car.carDetails();
//        second_car.carDetails();
//        second_car.setProductionYear(1998);
//        second_car.carDetails();
//        third_car.carDetails();
//        third_car.setItWork(false);
//        third_car.carDetails();
//        fifth_car.carPetrol();
//        fifth_car.setPetrol("Diesel");
//        fifth_car.carPetrol();

//        third_car.startEngine();
//        third_car.stopEngine();

        Phone phoneOne = new Phone("Oppo", "black", 72, true);
        Phone phoneTwo = new Phone("iPhone", "silver", 10245142, true);
        Phone phoneFour = new Phone("Nokia", "blue and orange", 5210, false);

        System.out.println(phoneOne.getModel());
        phoneFour.setSeries(3210);
        phoneTwo.setColor("white");
        System.out.println(phoneFour.getSeries());
        System.out.println(phoneTwo.getColor());


    }
}

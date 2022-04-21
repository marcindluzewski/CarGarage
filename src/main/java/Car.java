public class Car {
    private String mark; //deklaracja zmiennej
    private int productionYear;
    private boolean isItWork;
    private String petrol;

    public Car(){

    } //bezparametrowy konstruktor klasy Car

    public Car(String mark, int productionYear, boolean isItWork) {// parametrowy konstruktor klasy Car

        this.mark = mark; // uzupełnienie zmiennej
        this.productionYear = productionYear;
        this.isItWork = isItWork;
    }
    public Car(String mark, String petrol) {

        this.mark = mark; // uzupełnienie zmiennej
        this.petrol = petrol;
    }

    public Car(String mark, int productionYear, boolean isItWork, String petrol) {// parametrowy konstruktor klasy Car

        this.mark = mark; // uzupełnienie zmiennej
        this.productionYear = productionYear;
        this.isItWork = isItWork;
        this.petrol = petrol;
    }

    public void carDetails(){System.out.println(mark + " " + productionYear + " " + isItWork);}
    public void carPetrol(){
        System.out.println(mark + " " + petrol);
    }
    public void carInfo(){System.out.println(mark + " " + productionYear + " " + isItWork + " " + petrol);}

    public String getMark(){
        return mark;
    }


}

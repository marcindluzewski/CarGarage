public class Calculator {
    private int variableOne;
    private int variableTwo;

    public Calculator(int variableOne, int variableTwo){
        this.variableOne = variableOne;
        this.variableTwo = variableTwo;
    }
    public void addition(){
        System.out.println(variableOne + variableTwo);
    }

    public void substraction(){
        System.out.println(variableOne - variableTwo);
    }

    public void multiplication(){
        System.out.println(variableOne * variableTwo);
    }

    public void division(){
        System.out.println(variableOne / variableTwo);
    }
}

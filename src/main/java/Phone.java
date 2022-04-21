public class Phone {
    private String model;
    private String color;
    private int series;
    private boolean cameraIn;

    public Phone(String model, String color, int series){
        this.model = model;
        this.color = color;
        this.series = series;
    }

    public Phone(String model, String color, int series, boolean cameraIn){
        this.model = model;
        this.color = color;
        this.series = series;
        this.cameraIn = cameraIn;
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public int getSeries(){
        return series;
    }

    public boolean getCameraIn(){
        return cameraIn;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setSeries(int series){
        this.series = series;
    }

    public void setCameraIn(boolean cameraIn){
        this.cameraIn = cameraIn;
    }
}

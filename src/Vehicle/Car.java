package Vehicle;

public class Car {
    String Model;
    String model;
    int year;

    public Car(String model, String model1, int year) {
        Model = model;
        this.model = model1;
        this.year = year;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public static void main(String[] args) {

    }
}

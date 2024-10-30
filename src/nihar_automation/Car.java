package nihar_automation;

public class Car {

    private String modelName;
    private String owner;
    private int regNumber;

    public Car(String modelName, String owner, int regNumber) {
        this.modelName = modelName;
        this.owner = owner;
        this.regNumber = regNumber;
    }

    public void startEngine(){
        System.out.println(modelName + " Engine is starting...");
    }

    public void accelerate(){
        System.out.println(modelName+ " Car is accelerating...");
    }

    public void stop(){
        System.out.println(modelName + " Car is Stopped.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", owner='" + owner + '\'' +
                ", regNumber=" + regNumber +
                '}';
    }
}

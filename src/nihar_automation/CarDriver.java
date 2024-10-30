package nihar_automation;

public class CarDriver {
    public static void main(String[] args) {
        Car myCar1=new Car("BMW X7","Nihar",3121);
        System.out.println(myCar1);
        myCar1.startEngine();
        myCar1.accelerate();
        myCar1.stop();

        System.out.println("---------------------------");
        Car  myCar2=new Car("BMW X6mSport","Nihar Babu",3321);
        System.out.println(myCar2);
        myCar2.startEngine();
        myCar2.accelerate();
        myCar2.stop();




    }
}

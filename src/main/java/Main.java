import java.util.Scanner;

public class Main {
    public Scanner scanner;


    public static void main(String[] args) {
//        ComputerCreator computerCreator = new ComputerCreator();
//        System.out.println(computerCreator.create());
        ElectricDevice laptop = new Laptop("Test");
        ElectricDevice toster = new Toster();
        ((Toster) toster).cook();

        ((Laptop) laptop).closeLid();

        ElectricDevice[] devices = {laptop, toster};
        for(ElectricDevice device : devices) {
            device.powerOn();
        }

        for(ElectricDevice device : devices) {
            device.powerOff();
        }
    }
}

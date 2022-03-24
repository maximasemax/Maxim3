import model.Computer;
import model.hardware.Ram;
import service.ComputerCreator;

import java.util.Scanner;

public class Main {
    public Scanner scanner;


    public static void main(String[] args) {
        ComputerCreator computerCreator = new ComputerCreator();
        Computer computerHiperpc = computerCreator.createHiperpc();
        Computer computerMediumPc = computerCreator.createMediumPc();
        Computer computerOfficePc = computerCreator.createOfficePc();
        Computer computerMediumPc1 = computerCreator.createMediumPc1();
        System.out.println("Rams with name lol");
        for (Ram ram : computerMediumPc.getRamConfiguration().searchByName("hyperx")){
            System.out.println(ram);
        }
        System.out.println("=============================================================");
        System.out.println("All Rams in model.Computer");
        for (Ram ram : computerMediumPc.getRamConfiguration().getAllItems()){
            System.out.println(ram);
        }
        System.out.println("=============================================================");
        System.out.println(computerMediumPc.equals(computerMediumPc1));

    }





























//        service.ComputerCreator computerCreator = new service.ComputerCreator();
//        System.out.println(computerCreator.create());
//        ElectricDevice laptop = new model.Laptop("Test");
//        ElectricDevice toster = new Toster();
//        ((Toster) toster).cook();
//
//        ((model.Laptop) laptop).closeLid();
//
//        ElectricDevice[] devices = {laptop, toster};
//        for(ElectricDevice device : devices) {
//            device.powerOn();
//        }
//
//        for(ElectricDevice device : devices) {
//            device.powerOff();
//        }
}


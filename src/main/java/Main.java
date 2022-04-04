import model.Computer;
import model.hardware.Hdd;
import model.hardware.Ram;
import service.ComputerCreator;
import service.HaveFan;

import java.util.Scanner;

public class Main {
    public Scanner scanner;


    public static void main(String[] args) {
//        ComputerCreator computerCreator = new ComputerCreator();
//        Computer computerHiperpc = computerCreator.createHiperpc();
//        Computer computerMediumPc = computerCreator.createMediumPc();
//        Computer computerOfficePc = computerCreator.createOfficePc();
//        Computer computerMediumPc1 = computerCreator.createMediumPc1();
//        System.out.println("Rams with name hiperx");
//        for (Ram ram : computerMediumPc.getRamConfiguration().searchByName("hyperx")){
//            System.out.println(ram);
//        }
//        System.out.println("=============================================================");
//        System.out.println("All Rams Computer");
//        for (Ram ram : computerMediumPc.getRamConfiguration().getAllItems()){
//            System.out.println(ram);
//        }
//        System.out.println("=============================================================");
//        System.out.println("Hdds with name baracuda");
//        for (Hdd hdd : computerMediumPc.getHddConfiguration().searchByName("baracuda")){
//            System.out.println(hdd);
//        }
//        System.out.println("=============================================================");
//        System.out.println("All Hdds Computer");
//        for (Hdd hdd : computerMediumPc.getHddConfiguration().getAllItems()){
//            System.out.println(hdd);
//        }
//        System.out.println("=============================================================");
//
//        System.out.println(computerMediumPc.equals(computerMediumPc1));
//
//        System.out.println("=============================================================");
//        Ram newRam = new Ram("gg", 21, 121);
//        if (!computerHiperpc.getRamConfiguration().editRam("gg", 121,newRam )){
//            System.out.println("все х ");
//        }
//        computerHiperpc.getRamConfiguration().addRam(newRam);
//        if (!computerHiperpc.getRamConfiguration().editRam("gg", 121,newRam )){
//            System.out.println("все х ");
//        }

        System.out.println(new HaveFan().snake());

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


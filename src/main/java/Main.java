import java.util.List;
import java.util.Scanner;

public class Main {
    public Scanner scanner;


    public static void main(String[] args) {
        Warehouse computerWarehouse = new ComputerWarehouse();
        ComputerCreator computerCreator = new ComputerCreator();
        Computer computerHiperpc = computerCreator.createHiperpc();
        Computer computerMediumPc = computerCreator.createMediumPc();
        Computer computerOfficePc = computerCreator.createOfficePc();
        Computer computerMediumPc1 = computerCreator.createMediumPc1();
        computerWarehouse.addItem(computerMediumPc1);
        computerWarehouse.addItem(computerHiperpc);
        computerWarehouse.addItem(computerMediumPc);
        computerWarehouse.addItem(computerOfficePc);
        List<Computer> computers = (List<Computer>) computerWarehouse.getAllItems();
        for (Computer computer : computers) {
            System.out.println(computer);
        }
        Computer searchResult = (Computer) computerWarehouse.searchByName("OLOLO");
        System.out.println("найден компьютер по имени ололо: ");
        System.out.println(searchResult);
        Computer searchResultExisting = (Computer) computerWarehouse.searchByName("OfficePc");
        System.out.println("найден компьютер по имени OfficePc: ");
        System.out.println(searchResultExisting);
        System.out.println(computerMediumPc.equals(computerMediumPc1));

    }


//        ComputerCreator computerCreator = new ComputerCreator();
//        System.out.println(computerCreator.create());
//        ElectricDevice laptop = new Laptop("Test");
//        ElectricDevice toster = new Toster();
//        ((Toster) toster).cook();
//
//        ((Laptop) laptop).closeLid();
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


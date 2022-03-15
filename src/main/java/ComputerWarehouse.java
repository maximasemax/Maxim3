import java.util.ArrayList;
import java.util.List;

public class ComputerWarehouse implements Warehouse {
    private List<Computer> computers;

    public ComputerWarehouse() {
        this.computers = new ArrayList<>();
    }

    @Override
    public WarehouseItem searchByName(String name) {
        for (Computer computer : computers){
            if (computer.getName().equalsIgnoreCase(name) ){
                return computer;
            }
        }
        return null;
    }

    @Override
    public void addItem(WarehouseItem warehouseItem) {
        if (warehouseItem instanceof Computer) {
            computers.add((Computer) warehouseItem);
        }
    }

    @Override
    public List<? extends WarehouseItem> getAllItems() {
        return computers;
    }


//    @Override
//    public ArrayList<WarehouseImpl> creator() {
//        ArrayList<WarehouseComputers> warehouses = new ArrayList<>();
//        Computers1 computer1 = new Computers1("powerful", "i9", "rtx3090", "32", "cougar");
//        Computers1 computer2 = new Computers1("medium", "i7", "rtx3060", "16", "dexp");
//        Computers1 computer3 = new Computers1("low", "i5", "gtx1660", "16", "aerocool");
//        Computers1 computer4 = new Computers1("gaming", "i5", "rtx3080 ti", "16", "cougar");
//        Computers1 computer5 = new Computers1("office", "i3", "gtx1030", "8", "aerocool");
//
//        warehouses.add(computer1);
//        warehouses.add(computer2);
//        warehouses.add(computer3);
//        warehouses.add(computer4);
//        warehouses.add(computer5);
////        System.out.println(warehouses.toString());
//        return super.creator();
    //        System.out.println();
//        System.out.println("Если нужно найти компьютер и его характеристики напишите его имя.");
//        System.out.println("Если нужно добавить комьютер и его характеристики напишите слово: add.");






}

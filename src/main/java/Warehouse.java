import java.util.List;

public interface Warehouse {
    WarehouseItem searchByName(String name);
    void addItem(WarehouseItem computer1);
    List<? extends WarehouseItem> getAllItems();

}

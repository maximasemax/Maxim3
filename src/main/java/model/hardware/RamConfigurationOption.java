package model.hardware;

import java.util.List;

public interface RamConfigurationOption {
    void addRam(Ram ram);
    List<Ram> getAllItems();
    void removeRam(String name);
    void editRam(String name, int size, Ram ram);
}

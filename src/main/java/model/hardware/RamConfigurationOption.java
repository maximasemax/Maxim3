package model.hardware;

import java.util.List;

public interface RamConfigurationOption {
    void addRam(Ram ram);

    List<Ram> getAllItems();

    void removeRam(String name);

    boolean editRam(String name, int size, Ram ram);
}

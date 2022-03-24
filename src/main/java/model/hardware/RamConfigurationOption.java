package model.hardware;

import java.util.List;

public interface RamConfigurationOption {
    void addRam(Ram ram);
    List<Ram> getAllItems();
}

package model.hardware;

import java.util.List;

public interface HddConfigurationOption {
    void addHdd(Hdd hdd);
    void removeHdd(String name);
    List<Hdd> getAllItems();
}

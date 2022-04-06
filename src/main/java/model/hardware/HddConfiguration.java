package model.hardware;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
// используется для создания контейнера в компьтере чтобы можно было изменять значения быстро

public class HddConfiguration implements HddConfigurationOption {
    private final List<Hdd> hdds;

    public HddConfiguration() {
        this.hdds = new ArrayList<>();
    }

    @Override
    public List<Hdd> getAllItems() {
        return hdds;
    }

    @Override
    public void addHdd(Hdd hdd) {
        hdds.add(hdd);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        HddConfiguration that = (HddConfiguration) o;
        return Objects.equals(hdds, that.hdds);
    }

    @Override
    public void removeHdd(String name) {
        for (Hdd hdd : hdds) {
            if (hdd.getName().equalsIgnoreCase(name)) {
                hdds.remove(hdd);
            }
        }
    }

    public List<Hdd> searchByName(String name) {
        List<Hdd> result = new ArrayList<>();
        for (Hdd hdd : hdds) {
            if (hdd.getName().equalsIgnoreCase(name)) {
                result.add(hdd);
            }
        }
        return result;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Hdd hdd : hdds) {
            stringBuilder.append(hdd);
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

    public void editHdd(String name, int size, Hdd hdd1) {
        for (Hdd hdd : hdds)
            if (hdd.getName().equalsIgnoreCase(name)
                    || hdd.getSize() == size) {
                hdd.setName(hdd1.getName());
                hdd.setFrequency(hdd1.getFrequency());
                hdd.setSize(hdd1.getSize());
            }
    }

}

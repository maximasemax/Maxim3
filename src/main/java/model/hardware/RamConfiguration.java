package model.hardware;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
// используется для создания контейнера в компьтере чтобы можно было изменять значения быстро


public class RamConfiguration implements RamConfigurationOption {
    private final List<Ram> rams;

    public RamConfiguration() {
        this.rams = new ArrayList<>();
    }

    @Override
    public void addRam(Ram ram) {
        rams.add(ram);

    }

    @Override
    public List<Ram> getAllItems() {
        return rams;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Ram ram : rams) {
            stringBuilder.append(ram);
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

    public List<Ram> searchByName(String name) {
        List<Ram> result = new ArrayList<>();
        for (Ram ram : rams) {
            if (ram.getName().equalsIgnoreCase(name)) {
                result.add(ram);
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass())
            return false;
        RamConfiguration that = (RamConfiguration) o;
        return Objects.equals(rams, that.rams);
    }

    @Override
    public void removeRam(String name) {
        for (Ram ram : rams) {
            if (ram.getName().equalsIgnoreCase(name)) {
                rams.remove(ram);
            }
        }
    }

    @Override
    public boolean editRam(String name, int size, Ram ram1) {
        for (Ram ram : rams) {
            if (ram.getName().equalsIgnoreCase(name)
                    || ram.getSize() == (size)) {
                ram.setName(ram1.getName());
                ram.setSize(ram1.getSize());
                ram.setFrequency(ram1.getFrequency());
                return true;
            }
        }
        return false;
    }
}

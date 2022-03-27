package model.hardware;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public List<Ram> searchByName(String name){
        List<Ram> result = new ArrayList<>();
        for (Ram ram : rams){
            if (ram.getName().equalsIgnoreCase(name)){
                result.add(ram);
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        RamConfiguration that = (RamConfiguration) o;
        return Objects.equals(rams, that.rams);
    }

    @Override
    public void removeRam(String name) {
        for (Ram ram : rams){
            if (ram.getName().equalsIgnoreCase(name)){
                rams.remove(ram);
            }
        }
    }

    @Override
    public void editRam(String name, int size, Ram ram1) {
        for (Ram ram : rams){
            if (ram.getName().equalsIgnoreCase(name)
                || ram.getSize() == (size)) {
                rams.remove(ram);
                rams.add(ram1);
            }
        }
    }
    //TODO сделать equals +
    //TODO сделать редактирование(поиск по заданным параметрам и из всех что нашись берем первоеи заменяем на то что приходит если нету то выводим на экран не нашлось) и удаление(поиск по имени) удаление +, замена+
}

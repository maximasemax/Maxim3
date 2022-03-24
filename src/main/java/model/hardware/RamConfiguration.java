package model.hardware;

import java.util.ArrayList;
import java.util.List;

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
    //TODO сделать equals
    //TODO сделать редактирование(поиск по заданным параметрам и из всех что нашись берем первоеи заменяем на то что приходит если нету то выводим на экран не нашлось) и удаление(поиск по имени)
}

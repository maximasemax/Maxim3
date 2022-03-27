package model.hardware;

public class Hdd {
    private String name;
    private int frequency;
    private int size;

    public Hdd(String name, int frequency, int size) {
        this.name = name;
        this.frequency = frequency;
        this.size = size;

    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nHdd: ");
        stringBuilder.append(this.name);
        stringBuilder.append(".\nCharacteristic: ");
        stringBuilder.append("Frequency: ");
        stringBuilder.append(this.frequency);
        stringBuilder.append(", Size: ");
        stringBuilder.append(this.size);
        stringBuilder.append(".");
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        Hdd otherHdd = (Hdd) obj;
        if (otherHdd == null) {
            return false;
        }
        if (!(obj instanceof Hdd)){
            return false;
        }
        if (!(this.name.equals(otherHdd.name)
                && this.frequency == otherHdd.frequency
                && this.size == otherHdd.size)) {
            System.out.println("Hdd не совпадают");
            return false;
        }
        return true;
    }

    public String getName(){
        return this.name;
    }

    public int getSize() {
        return size;
    }
}

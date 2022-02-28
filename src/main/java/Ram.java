public class Ram {
    private String name;
    private int slots;
    private int frequency;
    private int size;
    private int totalSize;

    public Ram(String name, int slots, int frequency, int size, int totalSize) {
        this.name = name;
        this.slots = slots;
        this.frequency = frequency;
        this.size = size;
        this.totalSize = totalSize;

    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nRam: ");
        stringBuilder.append(this.name);
        stringBuilder.append(".\nCharacteristic: ");
        stringBuilder.append("Slots");
        stringBuilder.append(this.slots);
        stringBuilder.append(", Frequency: ");
        stringBuilder.append(this.frequency);
        stringBuilder.append(", Size: ");
        stringBuilder.append(this.size);
        stringBuilder.append(", Total size: ");
        stringBuilder.append(this.totalSize);
        stringBuilder.append(".");
        return stringBuilder.toString();
        //return "\nRam: " + this.name + ".\nCharacteristic: " + "Slots" + this.slots + ", Frequency: " + this.frequency + ", Size: " + this.size + ", Total size: " + this.totalSize + ".";
    }
}

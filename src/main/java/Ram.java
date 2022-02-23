public class Ram {
    private String name;
    private int slots;
    private int frequency;
    private int size;
    private int totalSize;

    public Ram(String name, int slots, int frequency, int size, int totalSize){
        this.name = name;
        this.slots = slots;
        this.frequency = frequency;
        this.size = size;
        this.totalSize = totalSize;

    }
    public String toString(){
        return "\nRam: " + this.name + ".\nCharacteristic: " + "Slots" + this.slots + ", Frequency: " + this.frequency + ", Size: " + this.size + ", Total size: " + this.totalSize+ ".";
    }
}

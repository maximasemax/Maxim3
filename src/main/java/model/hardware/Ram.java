package model.hardware;

public class Ram {
    private String name;
    private int frequency;
    private int size;


    public Ram(String name, int frequency, int size) {
        this.name = name;
        this.frequency = frequency;
        this.size = size;

    }


    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nRam: ");
        stringBuilder.append(this.name);
        stringBuilder.append(".\nCharacteristic: ");
        stringBuilder.append("Frequency: ");
        stringBuilder.append(this.frequency);
        stringBuilder.append(", Size: ");
        stringBuilder.append(this.size);
        stringBuilder.append(".");
        stringBuilder.append("\n");
        return stringBuilder.toString();
        //return "\nRam: " + this.name + ".\nCharacteristic: " + "Slots" + this.slots + ", Frequency: " + this.frequency + ", Size: " + this.size + ", Total size: " + this.totalSize + ".";
    }

    public boolean equals(Object obj) {
        Ram otherRam = (Ram) obj;
        if (otherRam == null) {
            return false;
        }
        if (!(obj instanceof Ram)) {
            return false;
        }
        if (!(this.name.equals(otherRam.name)
                && this.frequency == otherRam.frequency
                && this.size == otherRam.size)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return size;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

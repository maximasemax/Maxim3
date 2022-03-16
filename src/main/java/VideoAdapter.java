public class VideoAdapter {
    private String name;
    private int coreFrequency;
    private int ram;
    private int ramFrequency;

    public VideoAdapter(String name, int coreFrequency, int ram, int ramFrequency) {
        this.name = name;
        this.coreFrequency = coreFrequency;
        this.ram = ram;
        this.ramFrequency = ramFrequency;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nVideoAdapter: ");
        stringBuilder.append(this.name);
        stringBuilder.append(".\nCharacteristic: ");
        stringBuilder.append("core frequency: ");
        stringBuilder.append(this.coreFrequency);
        stringBuilder.append(", ram: ");
        stringBuilder.append(this.ram);
        stringBuilder.append(", ram frequency: ");
        stringBuilder.append(this.ramFrequency);
        stringBuilder.append(".");
        return stringBuilder.toString();
        //return "\nVideoAdapter: " + this.name + ".\nCharacteristic: " + "core frequency: "  + this.coreFrequency + ", ram: " + this.ram + ", ram frequency: " + this.ramFrequency + ".";
    }
    public boolean equals(Object obj) {
        VideoAdapter otherVideoAdapter = (VideoAdapter) obj;
        if (otherVideoAdapter == null) {
            return false;
        }
        if (!(obj instanceof VideoAdapter)) {

        }
        if (!(this.name.equals(otherVideoAdapter.name)
                && this.coreFrequency == otherVideoAdapter.coreFrequency
                && this.coreFrequency == otherVideoAdapter.coreFrequency)) {
            System.out.println("Видеокарты разные не совпадают");
            return false;
        }
        return true;
    }
}

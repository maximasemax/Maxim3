public class VideoAdapter {
    private String name;
    private int coreFrequency;
    private int ram;
    private int ramFrequency;

    public VideoAdapter(String name, int coreFrequency, int ram, int ramFrequency){
        this.name = name;
        this.coreFrequency = coreFrequency;
        this.ram = ram;
        this.ramFrequency = ramFrequency;
    }

    public String toString(){
        return "\nVideoAdapter: " + this.name + ".\nCharacteristic: " + "core frequency: "  + this.coreFrequency + ", ram: " + this.ram + ", ram frequency: " + this.ramFrequency + ".";
    }

}

public class Laptop extends Computer {
    private int weightGrams;

    private int batteryCapacity;

    public Laptop(String name) {
        super(name);
    }

    public Laptop(String name, VideoAdapter videoAdapter, Cpu cpu, Ram ram, Motherboard motherboard, int weightGrams, int batteryCapacity) {
        super(name, videoAdapter, cpu, ram, motherboard);
        this.weightGrams = weightGrams;
        this.batteryCapacity = batteryCapacity;

    }

    public void closeLid() {
        System.out.println("I'm closed");
    }


    public int getWeightGrams() {
        return weightGrams;
    }

//    public String toString(){
//
//    }
}

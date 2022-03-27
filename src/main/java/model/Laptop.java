package model;

import model.hardware.*;

public class Laptop extends Computer {
    private int weightGrams;

    private int batteryCapacity;
    private RamConfiguration ramConfiguration;
    private HddConfiguration hddConfiguration;

    public Laptop(String name) {
        super(name);
    }

    public Laptop(String name, VideoAdapter videoAdapter, Cpu cpu, RamConfiguration ramConfiguration,HddConfiguration hddConfiguration, Motherboard motherboard, int weightGrams, int batteryCapacity) {
        super(name, videoAdapter, cpu, ramConfiguration, hddConfiguration, motherboard);
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

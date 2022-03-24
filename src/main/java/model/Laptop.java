package model;

import model.hardware.Cpu;
import model.hardware.Motherboard;
import model.hardware.RamConfiguration;
import model.hardware.VideoAdapter;

public class Laptop extends Computer {
    private int weightGrams;

    private int batteryCapacity;
    private RamConfiguration ramConfiguration;

    public Laptop(String name) {
        super(name);
    }

    public Laptop(String name, VideoAdapter videoAdapter, Cpu cpu, RamConfiguration ramConfiguration, Motherboard motherboard, int weightGrams, int batteryCapacity) {
        super(name, videoAdapter, cpu, ramConfiguration, motherboard);
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

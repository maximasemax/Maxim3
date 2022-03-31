package model;

import model.hardware.*;

public class Computer {
    protected String name;
    protected VideoAdapter videoAdapter;
    protected Cpu cpu;
    protected Motherboard motherboard;
    protected RamConfiguration ramConfiguration;
    protected HddConfiguration hddConfiguration;


    public Computer(String name) {
        this.name = name;
    }

    public Computer(String name, VideoAdapter videoAdapter, Cpu cpu, RamConfiguration ramConfiguration, HddConfiguration hddConfiguration, Motherboard motherboard) {
        this.name = name;
        this.videoAdapter = videoAdapter;
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.ramConfiguration = ramConfiguration;
        this.hddConfiguration = hddConfiguration;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String lineBreak = "\n";
        stringBuilder.append(lineBreak);
        stringBuilder.append("Computer name: ");
        stringBuilder.append(this.name);
        stringBuilder.append(".");
        stringBuilder.append(lineBreak);
        stringBuilder.append(this.cpu);
        stringBuilder.append(lineBreak);
        stringBuilder.append(this.videoAdapter);
        stringBuilder.append(lineBreak);
        stringBuilder.append(this.motherboard);
        stringBuilder.append(lineBreak);
        stringBuilder.append("Ram memory");
        stringBuilder.append(ramConfiguration);
        stringBuilder.append(lineBreak);
        stringBuilder.append("Hdd memory: ");
        stringBuilder.append(hddConfiguration);
        stringBuilder.append(lineBreak);
        stringBuilder.append("===========================================");

        return stringBuilder.toString();
    }

    public void powerOn() {
        System.out.println(String.format("model.Computer '%s' is ON", name));
    }


    public void powerOff() {
        System.out.println(String.format("model.Computer '%s' is OFF", name));
    }

    @Override
    public boolean equals(Object obj) {
        Computer otherComputer = (Computer) obj;
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Computer)) {
            return false;
        }
        if (!(this.motherboard.equals(otherComputer.motherboard)
                && this.ramConfiguration.equals(otherComputer.ramConfiguration)
                && this.hddConfiguration.equals(otherComputer.hddConfiguration)
                && this.name.equals(otherComputer.name)
                && this.cpu.equals(otherComputer.cpu)
                && this.videoAdapter.equals(otherComputer.videoAdapter))) {
            System.out.println("Совпадения нету");
            return false;
        }
        return true;
//        boolean equalsName = this.name == otherComputer.name;
//        boolean equalsVideoAdapter = this.videoAdapter == otherComputer.videoAdapter;


    }

    public RamConfiguration getRamConfiguration() {
        return ramConfiguration;
    }

    public HddConfiguration getHddConfiguration() {
        return hddConfiguration;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public VideoAdapter getVideoAdapter() {
        return videoAdapter;
    }

    public Cpu getCpu() {
        return cpu;
    }

}

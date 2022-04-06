package model;

import model.hardware.*;
// используется для создания персонального компьтера

public class PersonalComputer extends Computer {
    private AssemblyIn assemblyIn;

    private final Mouse mouse;
    private final Keyboard keyboard;
    private RamConfiguration ramConfiguration;
    private HddConfiguration hddConfiguration;


    public PersonalComputer(String name, Mouse mouse, VideoAdapter videoAdapter, Cpu cpu, Keyboard keyboard, Motherboard motherboard, RamConfiguration ramConfiguration, HddConfiguration hddConfiguration) {
        super(name, videoAdapter, cpu, ramConfiguration, hddConfiguration, motherboard);
        this.mouse = mouse;
        this.keyboard = keyboard;

    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String lineBreak = "\n";
        stringBuilder.append("Computer type: ");
        stringBuilder.append(assemblyIn.FRAME);
        stringBuilder.append(lineBreak);
        stringBuilder.append(lineBreak);
        stringBuilder.append("Computer name: ");
        stringBuilder.append(this.name);
        stringBuilder.append(".");
        stringBuilder.append(lineBreak);
        stringBuilder.append(this.cpu);
        stringBuilder.append(lineBreak);
        stringBuilder.append(this.videoAdapter);
        stringBuilder.append(lineBreak);
        stringBuilder.append(this.mouse);
        stringBuilder.append(lineBreak);
        stringBuilder.append(this.keyboard);
        stringBuilder.append(lineBreak);
        stringBuilder.append(this.motherboard);
        stringBuilder.append(lineBreak);
        stringBuilder.append(lineBreak);
        stringBuilder.append("Ram memory: ");
        stringBuilder.append(lineBreak);
        stringBuilder.append(ramConfiguration);
        stringBuilder.append(lineBreak);
        stringBuilder.append(lineBreak);
        stringBuilder.append("Hdd memory: ");
        stringBuilder.append(hddConfiguration);
        stringBuilder.append(lineBreak);
        stringBuilder.append("==========================================================================================");

        return stringBuilder.toString();
    }
}










package service;

import model.*;
import model.hardware.*;
// в этом класе мы создаем компьтеры в сборе

public class ComputerCreator {

    public ComputerCreator() {

    }

    public Computer createHiperpc() {
        RamConfiguration ramConfiguration = new RamConfiguration();
        Ram ramHyper1 = new Ram("Hyperx", 3200, 16);
        Ram ramHyper2 = new Ram("Hyperx", 3200, 16);
        ramConfiguration.addRam(ramHyper1);
        ramConfiguration.addRam(ramHyper2);
        HddConfiguration hddConfiguration = new HddConfiguration();
        Hdd baracuda1 = new Hdd("baracuda", 7200, 1000);
        Hdd baracuda2 = new Hdd("baracuda", 7200, 1000);
        hddConfiguration.addHdd(baracuda1);
        hddConfiguration.addHdd(baracuda2);
        Mouse mouse = new Mouse("g304", 800, 100);
        VideoAdapter videoAdapter = new VideoAdapter("RTX 3080", 1300, 12, 16000);
        Cpu cpu = new Cpu("i7 9800k", "lga 2066", "16", "5000");
        Keyboard keyboard = new Keyboard("Readracon", "red");
        Motherboard motherboard = new Motherboard("x299 MSI", "lga 2066", 4, 2, 8);
        return new PersonalComputer("hiperpc", mouse, videoAdapter, cpu, keyboard, motherboard,ramConfiguration, hddConfiguration );

    }

    public Computer createOfficePc() {
        RamConfiguration ramConfiguration = new RamConfiguration();
        Ram ramHyper1 = new Ram("Hyperx", 3200, 4);
        Ram ramHyper2 = new Ram("Hyperx", 3200, 4);
        ramConfiguration.addRam(ramHyper1);
        ramConfiguration.addRam(ramHyper2);
        HddConfiguration hddConfiguration = new HddConfiguration();
        Hdd baracuda1 = new Hdd("baracuda", 7200, 1000);
        Hdd baracuda2 = new Hdd("baracuda", 7200, 1000);
        hddConfiguration.addHdd(baracuda1);
        hddConfiguration.addHdd(baracuda2);
        Mouse mouse = new Mouse("g102", 800, 120);
        VideoAdapter videoAdapter = new VideoAdapter("gtx 1030", 1300, 2, 3500);
        Cpu cpu = new Cpu("i3 10100", "lga 2070", "8", "5000");
        Keyboard keyboard = new Keyboard("Readracon", "red");
        Motherboard motherboard = new Motherboard("h510 MSI", "lga 2070", 2, 2, 8);
        return new PersonalComputer("OfficePc", mouse, videoAdapter, cpu, keyboard, motherboard, ramConfiguration, hddConfiguration);

    }

    public Computer createMediumPc() {
        RamConfiguration ramConfiguration = new RamConfiguration();
        Ram ramHyper1 = new Ram("Hyperx", 3200, 8);
        Ram ramHyper2 = new Ram("Hyperx", 3200, 8);
        ramConfiguration.addRam(ramHyper1);
        ramConfiguration.addRam(ramHyper2);
        HddConfiguration hddConfiguration = new HddConfiguration();
        Hdd baracuda1 = new Hdd("baracuda", 7200, 1000);
        Hdd baracuda2 = new Hdd("baracuda", 7200, 1000);
        hddConfiguration.addHdd(baracuda1);
        hddConfiguration.addHdd(baracuda2);
        Mouse mouse = new Mouse("g304", 800, 100);
        VideoAdapter videoAdapter = new VideoAdapter("RTX 3060", 1300, 8, 16000);
        Cpu cpu = new Cpu("i5 10400f", "lga 2070", "12", "4300");
        Keyboard keyboard = new Keyboard("Readracon", "red");
        Motherboard motherboard = new Motherboard("h610 MSI", "lga 2070", 4, 2, 6);
        Ram ram = new Ram("Hiper", 2868, 8);
        return new PersonalComputer("MediumPc", mouse, videoAdapter, cpu, keyboard, motherboard, ramConfiguration, hddConfiguration);
    }

    public Computer createMediumPc1() {
        RamConfiguration ramConfiguration = new RamConfiguration();
        Ram ramHyper1 = new Ram("Hyperx", 3200, 8);
        Ram ramHyper2 = new Ram("Hyperx", 3200, 8);
        ramConfiguration.addRam(ramHyper1);
        ramConfiguration.addRam(ramHyper2);
        HddConfiguration hddConfiguration = new HddConfiguration();
        Hdd baracuda1 = new Hdd("baracuda", 7200, 1000);
        Hdd baracuda2 = new Hdd("baracuda", 7200, 1000);
        hddConfiguration.addHdd(baracuda1);
        hddConfiguration.addHdd(baracuda2);
        Mouse mouse = new Mouse("g304", 800, 100);
        VideoAdapter videoAdapter = new VideoAdapter("RTX 3060", 1300, 8, 16000);
        Cpu cpu = new Cpu("i5 10400f", "lga 2070", "12", "4300");
        Keyboard keyboard = new Keyboard("Readracon", "red");
        Motherboard motherboard = new Motherboard("h610 MSI", "lga 2070", 4, 2, 6);
        Ram max5 = new Ram("Hiper", 2868, 8);
        return new PersonalComputer("MediumPc", mouse, videoAdapter, cpu, keyboard, motherboard, ramConfiguration, hddConfiguration);
    }

}

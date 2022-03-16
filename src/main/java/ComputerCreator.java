import java.util.Objects;
import java.util.Scanner;

public class ComputerCreator {
    private Cpu cpu;

    public ComputerCreator() {
    }

    public Computer createHiperpc() {
        Mouse max = new Mouse("g304", 800, 100);
        VideoAdapter max1 = new VideoAdapter("RTX 3080", 1300, 12, 16000);
        Cpu max2 = new Cpu("i7 9800k", "lga 2066", "16", "5000");
        Keyboard max3 = new Keyboard("Readracon", "red");
        Motherboard max4 = new Motherboard("x299 MSI", "lga 2066", 4, 2, 8);
        Ram max5 = new Ram("Hiper", 2, 3200, 8, 16);
        PersoneComputer number1 = new PersoneComputer("hiperpc", max, max1, max2, max3, max4, max5);
        return number1;
    }
    public Computer createOfficePc() {
        Mouse max = new Mouse("g102", 800, 120);
        VideoAdapter max1 = new VideoAdapter("gtx 1030", 1300, 2, 3500);
        Cpu max2 = new Cpu("i3 10100", "lga 2070", "8", "5000");
        Keyboard max3 = new Keyboard("Readracon", "red");
        Motherboard max4 = new Motherboard("h510 MSI", "lga 2070", 2, 2, 8);
        Ram max5 = new Ram("Hiper", 2, 2600, 4, 8);
        PersoneComputer number1 = new PersoneComputer("OfficePc", max, max1, max2, max3, max4, max5);
        return number1;
    }
    public Computer createMediumPc() {
        Mouse max = new Mouse("g304", 800, 100);
        VideoAdapter max1 = new VideoAdapter("RTX 3060", 1300, 8, 16000);
        Cpu max2 = new Cpu("i5 10400f", "lga 2070", "12", "4300");
        Keyboard max3 = new Keyboard("Readracon", "red");
        Motherboard max4 = new Motherboard("h610 MSI", "lga 2070", 4, 2, 6);
        Ram max5 = new Ram("Hiper", 2, 2868, 8, 16);
       PersoneComputer number1 = new PersoneComputer("MediumPc", max, max1, max2, max3, max4, max5);
        return number1;
    }


}

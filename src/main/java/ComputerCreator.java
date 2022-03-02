import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ComputerCreator {
    private Cpu cpu;

    public ComputerCreator() {
    }

    public Computer create() {
        Mouse max = new Mouse("g304", 800, 100);
        VideoAdapter max1 = new VideoAdapter("RTX 3080", 1300, 12, 16000);
        //Cpu max2 = new Cpu("i7 9800k", "lga 2066", 16, 5000);

        System.out.println("Введите название процессора: ");
        Scanner sc = new Scanner(System.in);
        String cpuName = sc.nextLine();
        System.out.println("Введите название сокета: ");
        String cpuSocket = sc.nextLine();
        System.out.println("Введите количество потоков: ");
        String cpuCores = sc.nextLine();
        System.out.println("Ведите частоту ядер: ");
        String cpuFrequency = sc.nextLine();
        Cpu cpu1 = new Cpu(cpuName, cpuSocket, cpuCores, cpuFrequency);

        Keyboard max3 = new Keyboard("Readracon", "red");
        Motherboard max4 = new Motherboard("x299 MSI", "lga 2066", 4, 2, 8);
        Ram max5 = new Ram("Hiper", 2, 3200, 8, 16);
        Computer number1 = new Computer("hiperpc", max, max1, cpu1, max3, max4, max5);
        return number1;
    }


}

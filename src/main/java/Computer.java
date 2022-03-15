import java.util.ArrayList;
import java.util.List;

public class Computer extends WarehouseItem implements ElectricDevice {
    protected String name;
    protected VideoAdapter videoAdapter;
    protected Cpu cpu;
    protected Ram ram;
    protected Motherboard motherboard;



    public Computer(String name) {
        this.name = name;
    }

    public Computer(String name, VideoAdapter videoAdapter, Cpu cpu, Ram ram, Motherboard motherboard){
        this.name = name;
        this.videoAdapter = videoAdapter;
        this.cpu = cpu;
        this.ram = ram;
        this.motherboard = motherboard;
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
        stringBuilder.append(this.ram);
        stringBuilder.append(lineBreak);
        stringBuilder.append("===========================================");

        return stringBuilder.toString();
    }
    public void powerOn(){
        System.out.println(String.format("Computer '%s' is ON", name));
    }

    @Override
    public void powerOff() {
        System.out.println(String.format("Computer '%s' is OFF", name));
    }
    @Override
    public boolean equals(Object obj) {
        Computer otherComputer = (Computer) obj;
        if (!this.motherboard.equals(otherComputer.motherboard) | !this.name.equals(otherComputer.name) | !this.ram.equals(otherComputer.ram) | !this.cpu.equals(otherComputer.cpu) | !this.videoAdapter.equals(otherComputer.videoAdapter)){
            return false;
        }
        return  true;

//        boolean equalsName = this.name == otherComputer.name;
//        boolean equalsVideoAdapter = this.videoAdapter == otherComputer.videoAdapter;


    }

}

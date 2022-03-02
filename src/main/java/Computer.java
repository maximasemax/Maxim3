public class Computer implements ElectricDevice {
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
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        stringBuilder.append("Computer name: ");
        stringBuilder.append(this.name);
        stringBuilder.append(".\n");
        stringBuilder.append(this.cpu);
        stringBuilder.append("\n");
        stringBuilder.append(this.videoAdapter);
        stringBuilder.append("\n");
        stringBuilder.append(this.motherboard);
        stringBuilder.append("\n");
        stringBuilder.append(this.ram);

        return stringBuilder.toString();
    }
    public void powerOn(){
        System.out.println(String.format("Computer '%s' is ON", name));
    }

    @Override
    public void powerOff() {
        System.out.println(String.format("Computer '%s' is OFF", name));
    }
}

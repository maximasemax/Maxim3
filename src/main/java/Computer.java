public class Computer {
    private String keyboard;
    private String mouse;
    private String monitor;
    private String cpu;
    private String motherboard;
    private String videoAdapter;
    private String ram;
    private String hdd;
    private String headphones;

    public Computer(String keyboard, String mouse, String monitor, String cpu, String motherboard, String videoAdapter, String ram, String hdd, String headphones) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.videoAdapter = videoAdapter;
        this.ram = ram;
        this.hdd = hdd;
        this.headphones = headphones;

        /*return "keyboard" + this.keyboard + "mouse" + this.mouse + "monitor" + this.monitor + "cpu" + this.cpu + "motherboard" + this.motherboard + "videoAdapter" + this.videoAdapter + "ram" + this.ram + "hdd" + this.hdd + "earphones" + this.earphones */
    }
    public String toString(){
        return "I hope my future computer" + "\ncpu: " + this.cpu + "\nmotherboard: " + this.motherboard + "\nram: " + this.ram + "\nvideoAdapter: " + this.videoAdapter + "\nhdd: " + this.hdd + "\nkeyboard: " + this.keyboard + "\nmouse: " + this.mouse + "\nheadphones: " + this.headphones + "\nmonitor: " + this.monitor;

    }
}




/*

В компе у нас клавиатура, мышь, монитор, проц, мать), оперативная память, видюха, жестач, наушники вроде все


 */
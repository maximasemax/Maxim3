public class Cpu {
    private String name;
    private String socket;
    private int cores;
    private int frequency;

    public Cpu(String name, String socket, int cores, int frequency){
        this.name = name;
        this.socket =socket ;
        this.cores = cores;
        this.frequency = frequency;
    }

    public String toString(){
        return "\nCPU name: " + this.name + ".\nCharacteristic: " + "socket: " + this.socket + ", cores: " + this.cores + ", frequency: " + this.frequency + ".";
    }
}

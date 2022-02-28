public class Cpu {
    private String name;
    private String socket;
    private int cores;
    private int frequency;

    public Cpu(String name, String socket, int cores, int frequency) {
        this.name = name;
        this.socket = socket;
        this.cores = cores;
        this.frequency = frequency;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nCPU name: ");
        stringBuilder.append(this.name);
        stringBuilder.append(".\nCharacteristic: ");
        stringBuilder.append("socket: ");
        stringBuilder.append(this.socket);
        stringBuilder.append(", cores: ");
        stringBuilder.append(this.cores);
        stringBuilder.append(", frequency: ");
        stringBuilder.append(this.frequency);
        stringBuilder.append(".");
        return stringBuilder.toString();


        //return "\nCPU name: " + this.name + ".\nCharacteristic: " + "socket: " + this.socket + ", cores: " + this.cores + ", frequency: " + this.frequency + ".";
    }
}

package model.hardware;

public class  Cpu {
    private String name;
    private String socket;
    private String cores;
    private String frequency;

    public Cpu(String name, String socket, String cores, String frequency) {
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
    public boolean equals(Object obj){
        Cpu otherCpu = (Cpu) obj;
        if (otherCpu == null){
            return false;
        }
        if (!(obj instanceof Cpu)){
            return false;
        }
        if (!(this.name.equals(otherCpu.name)
                && this.socket.equals(otherCpu.socket)
                && this.cores.equals(otherCpu.cores)
                && this.frequency.equals(otherCpu.frequency))){
            System.out.println("Процессоры не совпадают");
            return false;
        }
        return true;
    }

    public String getCores() {
        return cores;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getName() {
        return name;
    }

    public String getSocket() {
        return socket;
    }


    public void setCores(String cores) {
        this.cores = cores;
    }

}

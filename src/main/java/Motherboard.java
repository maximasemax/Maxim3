public class Motherboard {
    private String name;
    private String socket;
    private int ramSlot;
    private int videAdapterSlot;
    private int usbSlot;

    public Motherboard(String name, String socket, int ramSlot, int videAdapterSlot, int usbSlot) {
        this.name = name;
        this.socket = socket;
        this.ramSlot = ramSlot;
        this.videAdapterSlot = videAdapterSlot;
        this.usbSlot = usbSlot;
    }
    public String toString(){
        return "\nMotherboard: " + this.name + ".\nCharacteristic: " + "socket: " + this.socket + ", ram slot: " + this.ramSlot + ", vide adapter slot: " + this.videAdapterSlot + ", usb slot: " + this.usbSlot + ".";
    }
}

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

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nMotherboard: ");
        stringBuilder.append(this.name);
        stringBuilder.append(".\nCharacteristic: ");
        stringBuilder.append("socket: ");
        stringBuilder.append(this.socket);
        stringBuilder.append(", ram slot: ");
        stringBuilder.append(this.ramSlot);
        stringBuilder.append(", vide adapter slot: ");
        stringBuilder.append(this.videAdapterSlot);
        stringBuilder.append(", usb slot: ");
        stringBuilder.append(this.usbSlot);
        stringBuilder.append(".");
        return stringBuilder.toString();
        //return "\nMotherboard: " + this.name + ".\nCharacteristic: " + "socket: " + this.socket + ", ram slot: " + this.ramSlot + ", vide adapter slot: " + this.videAdapterSlot + ", usb slot: " + this.usbSlot + ".";
    }
}
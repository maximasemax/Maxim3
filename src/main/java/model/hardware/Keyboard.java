package model.hardware;

public class Keyboard {
    private String name;
    private String switchs;

    public Keyboard(String name, String switchs) {
        this.name = name;
        this.switchs = switchs;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nmodel.hardware.Keyboard: ");
        stringBuilder.append(this.name);
        stringBuilder.append("\nCharacteristic: ");
        stringBuilder.append("switchs: ");
        stringBuilder.append(this.switchs);
        stringBuilder.append(".");
        return stringBuilder.toString();

        //return "\nKeyboard: " + this.name + "\nCharacteristic: "+ "switchs: " + this.switchs + ".";
    }

}

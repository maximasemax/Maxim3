public class Keyboard {
    private String name;
    private String switchs;

    public Keyboard(String name, String switchs) {
        this.name = name;
        this.switchs = switchs;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nKeyboard: ");
        stringBuilder.append(this.name);
        stringBuilder.append("\nCharacteristic: ");
        stringBuilder.append("switchs: ");
        stringBuilder.append(this.switchs);
        stringBuilder.append(".");
        return stringBuilder.toString();

        //return "\nKeyboard: " + this.name + "\nCharacteristic: "+ "switchs: " + this.switchs + ".";
    }

}

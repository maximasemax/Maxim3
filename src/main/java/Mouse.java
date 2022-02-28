public class Mouse {
    private String name;
    private int dpi;
    private int weight;

    public Mouse(String name, int dpi, int weight) {
        this.name = name;
        this.dpi = dpi;
        this.weight = weight;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nMouse: ");
        stringBuilder.append(this.name);
        stringBuilder.append(".\nCharacteristic: ");
        stringBuilder.append("dpi: ");
        stringBuilder.append(this.dpi);
        stringBuilder.append(", weight: ");
        stringBuilder.append(this.weight);
        stringBuilder.append(".");
        return stringBuilder.toString();
        //return "\nMouse: " + this.name + ".\nCharacteristic: " + "dpi: " + this.dpi + ", weight: " + this.weight + ".";
    }

}

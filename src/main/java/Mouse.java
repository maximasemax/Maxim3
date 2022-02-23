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
        return "\nMouse: " + this.name + ".\nCharacteristic: " + "dpi: " + this.dpi + ", weight: " + this.weight + ".";
    }

}

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

    public boolean equals(Object obj) {
        Mouse otherMouse = (Mouse) obj;
        if (otherMouse == null) {
            return false;
        }
        if (!(obj instanceof Mouse)){
            return false;
        }
        if (!(this.name.equals(otherMouse.name)
                && this.dpi == otherMouse.dpi
                && this.weight == otherMouse.weight)) {
            System.out.println("Мышки не совпадают");
            return false;
        }
        return true;
    }
}
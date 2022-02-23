public class Keyboard {
    private String name;
    private String switchs;

    public Keyboard(String name, String switchs){
        this.name = name;
        this.switchs = switchs;
    }

    public String toString(){
        return "\nKeyboard: " + this.name + "\nCharacteristic: "+ "switchs: " + this.switchs + ".";
    }

}

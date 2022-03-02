public class Toster implements ElectricDevice, Cooker {
    @Override
    public void powerOn() { System.out.println("Toster is ON"); }

    @Override
    public void powerOff() {
        System.out.println("Toster is OFF");
    }

    @Override
    public void cook() {
        System.out.println("I'm making toast");
    }
}

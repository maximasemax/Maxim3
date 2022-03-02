public class PersoneComputer extends Computer{
    private AssemblyIn assemblyIn;

    private Mouse mouse;
    private Keyboard keyboard;



    public PersoneComputer(String name, Mouse mouse, VideoAdapter videoAdapter, Cpu cpu, Keyboard keyboard, Motherboard motherboard, Ram ram) {
        super(name, videoAdapter, cpu, ram, motherboard);
        this.mouse = mouse;
        this.keyboard = keyboard;

    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Computer type: ");
        stringBuilder.append(assemblyIn.FRAME);
        stringBuilder.append("\n\n");
        stringBuilder.append("Computer name: ");
        stringBuilder.append(this.name);
        stringBuilder.append(".\n");
        stringBuilder.append(this.cpu);
        stringBuilder.append("\n");
        stringBuilder.append(this.videoAdapter);
        stringBuilder.append("\n");
        stringBuilder.append(this.mouse);
        stringBuilder.append("\n");
        stringBuilder.append(this.keyboard);
        stringBuilder.append("\n");
        stringBuilder.append(this.motherboard);
        stringBuilder.append("\n");
        stringBuilder.append(this.ram);

        return stringBuilder.toString();

        //return "Computer name: " + this.name + ".\n" + this.cpu + "\n" + this.videoAdapter + "\n" + this.mouse + "\n" + this.keyboard + "\n" + this.motherboard + "\n" + this.ram;
    }
}




/*

В компе у нас клавиатура, мышь, монитор, проц, мать), оперативная память, видюха, жестач, наушники вроде все


 */
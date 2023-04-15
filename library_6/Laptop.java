package library_6;

public class Laptop {
    private String type;
    private int ram;
    private int memory;
    private double frequency;
    private String systemName;
    private String color;

    public Laptop(String type, int ram, int memory, double frequency, String systemName, String color) {
        this.type = type;
        this.ram = ram;
        this.memory = memory;
        this.frequency = frequency;
        this.systemName = systemName;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(Double frequency) {
        this.frequency = frequency;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return type + " " + ram + "Gb" + " " + memory + "Gb" + " " + frequency + "GHz" + " "
                + systemName + " " + color;
    }

}
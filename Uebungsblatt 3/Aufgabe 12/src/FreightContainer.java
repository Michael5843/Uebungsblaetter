public class FreightContainer {
    public static final double EMPTYWEIGHT = 3900.0;
    private double loadWeight = 0;

    public FreightContainer(double loadWeight) {
        this.loadWeight = loadWeight;
    }
    public FreightContainer() {}

    public double getLoadWeight() { return this.loadWeight; }
    public void setCargoWeight(double loadWeight) { this.loadWeight = loadWeight; }

}

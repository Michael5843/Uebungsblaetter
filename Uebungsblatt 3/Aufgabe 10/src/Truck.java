public class Truck extends Vehicle {
    private double maxWeight;

    public Truck(String plateName, double maxWeight) {
        super(plateName);
        this.maxWeight = maxWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    @Override
    public double getRentalPrice() {
        return this.maxWeight * 10;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String toString() {
        return "License plate: " + this.getLicencePlate() + " Maximum weight: " + this.maxWeight + " Rental price: " + this.getRentalPrice();
    }
}

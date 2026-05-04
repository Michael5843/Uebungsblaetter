public abstract class Vehicle {
    private String licencePlate;
    private static int vehicleCount = 0;

    protected Vehicle(String licencePlate) {
        this.licencePlate = licencePlate;
        vehicleCount++;
    }

    public abstract double getRentalPrice();

    public int getVehiclesCount() {
        return vehicleCount;
    }

    public String getLicencePlate() {
        return this.licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }
}

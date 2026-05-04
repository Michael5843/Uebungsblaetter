public abstract class Vehicle {
    private String licencePlate;
    private static int currentVecicles = 0;

    public Vehicle(String licencePlate) {
        this.licencePlate = licencePlate;
        currentVecicles++;
    }


    public abstract void rentValue();

    public String getLicencePlate() { return this.licencePlate; }
    public void setLicencePlate(String licencePlate) { this.licencePlate = licencePlate; }

    public int getVehiclesCount() { return currentVecicles; }
    public void setVehiclesCount (int number) { currentVecicles = number; }

}

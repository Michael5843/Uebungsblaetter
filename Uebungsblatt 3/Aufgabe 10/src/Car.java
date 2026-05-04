public class Car extends Vehicle {
    private int seats;

    public Car(String plateName, int seats) {
        super(plateName);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public double getRentalPrice() {
        return this.seats * 2.5;
    }

    public String toString() {
        return "License plate: " + this.getLicencePlate() + "Number of seats: " + this.getSeats() + " Rental price: " + this.getRentalPrice();
    }
}

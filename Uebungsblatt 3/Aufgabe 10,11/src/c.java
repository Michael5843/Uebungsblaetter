public class c {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];

        vehicles[0] = new Car("A-UA-1234", 4);
        vehicles[1] = new Truck("A-UA-1235", 40.0);

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}

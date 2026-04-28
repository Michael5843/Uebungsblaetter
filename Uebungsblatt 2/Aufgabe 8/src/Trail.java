

public class Trail {
    private String name;
    private double lengthInKm;

    public Trail(String name, double lengthInKm) {
        this.lengthInKm = lengthInKm;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getLengthInKm() {
        return this.lengthInKm;
    }

    public void setLengthInKm(double lengthInKm) {
        this.lengthInKm = lengthInKm;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Hiker {
    private String name;
    public double distanceCovered = 0 ;

    public Hiker(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addTraversedTrail(Trail trail) {
        this.distanceCovered += trail.getLengthInKm();
    }

    public boolean isSuperWanderer() {
        return this.distanceCovered > (double) 10;
    }


}

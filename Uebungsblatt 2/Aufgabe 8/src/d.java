public class d {
    public static void main(String[] args) {
        Trail trail1 = new Trail("Stadtspaziergang zu den Mozarts", 2.5);
        Trail trail2 = new Trail("Wasser an der Stadtmauer", 4);
        Trail trail3 = new Trail("Wertach Vital", 12);

        Hiker hiker1 = new Hiker("Stefan");
        Hiker hiker2 = new Hiker("Aida");

        hiker1.addTraversedTrail(trail1);
        hiker1.addTraversedTrail(trail2);

        trail2.setLengthInKm(6);

        hiker2.addTraversedTrail(trail2);
        hiker2.addTraversedTrail(trail3);

        printHikerInfo(hiker1);
        printHikerInfo(hiker2);
    }

    private static void printHikerInfo(Hiker hiker) {
        System.out.println(
                hiker.getName()
                        + " has hiked "
                        + hiker.distanceCovered + "km + "
                        + "and"
                        + (hiker.isSuperWanderer() ? " is " : " is not ")
                        + "a Super Hiker!");
    }
}

public class Student {
    private String name;
    private int matrikelnummer;
    private int fachSemester;

    public static final int REGELSTUDIENZEIT = 6;

    public Student(String name, int matrikelnummer, int fachSemester) {
        setName(name);
        setMatrikelnummer(matrikelnummer);
        setFachsemester(fachSemester);
    }

    public String getName() { return this.name; }
    public int getMatrikelnummer() { return this.matrikelnummer; }
    public int getFachSemester() { return this.fachSemester; }


    public void setName(String name) {
        if (checkName(name))
            System.err.println("Name can't be blank, Null or empty");
        else
            this.name = name;
    }


    public void setMatrikelnummer(int matrikelnummer) {
        if (checkMatrikelnummer(matrikelnummer))
            this.matrikelnummer = matrikelnummer;
        else
            System.err.println("Matrikelnumber must be between 999_999 and 10_000_000 (7 digit positive integer)");
    }

    public void setFachsemester(int fachSemester) {
        if (checkFachsemester(fachSemester))
            System.err.println("Current semester must be between 1 and 20");
        else
            this.fachSemester = fachSemester;
    }
    private boolean checkName(String name) { return (name != null && !name.isEmpty()); }
    private boolean checkFachsemester(int fachSemester) { return (fachSemester >= 1 && fachSemester <= 20); }
    private boolean checkMatrikelnummer(int matrikelnummer) { return (matrikelnummer >= 1_000_000 && matrikelnummer <= 9_999_999); }

    public boolean isInStandardStudyPeriod() { return getFachSemester() <= Student.REGELSTUDIENZEIT; }

}


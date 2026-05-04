import java.util.Arrays;

public class University {
    public static void main(String[] args) {
        Student s1 = new Student("Mikail Melnyk", 1234567, 3);
        Student s2 = new Student("Lara Yilmaz", 7654321, 8);

        s1.setFachsemester(-1);
        System.out.println("S1 Fachsemester: " + s1.getFachSemester());

        s1.setFachsemester(s1.getFachSemester() + 1);

        System.out.print("S1 ist" + (s1.isInStandardStudyPeriod() ? " " : " nicht ") + "in der Regulaeren Studienzeit");
        System.out.print("S2 ist" + (s2.isInStandardStudyPeriod() ? " " : " nicht ") + "in der Regulaeren Studienzeit");
    }
}

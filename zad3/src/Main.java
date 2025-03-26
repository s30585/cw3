public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Oliwia","Kielak","s30585","s30585@xyz", "xyz");
        Student s2 = new Student("Oliwia","Kielak","s30589","s30585@xyz", "xyz");
        Student s3 = new Student("Oliwia","Kielak","s30580","s30585@xyz", "xyz");
        Student s4 = new Student("Oliwia","Kielak","s30581","s30585@xyz", "xyz");
        Student s5 = new Student("Oliwia","Kielak","s30583","s30585@xyz", "xyz");
        Student s6 = new Student("Oliwia","Kielak","s30582","s30585@xyz", "xyz");
        Student s7 = new Student("Oliwia","Kielak","s30584","s30585@xyz", "xyz");
        Student s8 = new Student("Oliwia","Kielak","s30586","s30585@xyz", "xyz");
        Student s9 = new Student("Oliwia","Kielak","s30578","s30585@xyz", "xyz");
        Student s10 = new Student("Oliwia","Kielak","s30509","s30585@xyz", "xyz");
        Student s11 = new Student("Oliwia","Kielak","s30545","s30585@xyz", "xyz");
        Student s12 = new Student("Oliwia","Kielak","s30562","s30585@xyz", "xyz");
        Student s13 = new Student("Oliwia","Kielak","s30521","s30585@xyz", "xyz");
        Student s14 = new Student("Oliwia","Kielak","s30512","s30585@xyz", "xyz");
        Student s15 = new Student("Oliwia","Kielak","s30532","s30585@xyz", "xyz");
//        Student s16 = new Student("Oliwia","Kielak","s30885","s30585@xyz", "xyz");

        s1.grades(2);
        s1.grades(2.5);
        s1.grades(3);
        s1.grades(3.5);
        s1.grades(4);
        s1.grades(4.5);
        s1.grades(5);
        s1.grades(2);
        s1.grades(2.5);
        s1.grades(3);
        s1.grades(3.5);
        s1.grades(4);
        s1.grades(4.5);
        s1.grades(5);
        s1.grades(2);
        s1.grades(2.5);
        s1.grades(3.5);
        s1.grades(4);
        s1.grades(4.5);
        s1.grades(5);
//        s1.grades(4.5);
//        s1.grades(5);
//        s1.grades(1);

        System.out.println("Średnia ocen studenta " + s1.indexNumber+ ": "+ s1.getAverage());
        Studentgroup grupa = new Studentgroup("Grupa 1");
        grupa.addStudent(s1);
        grupa.addStudent(s2);
        grupa.addStudent(s3);
        grupa.addStudent(s4);
        grupa.addStudent(s5);
        grupa.addStudent(s6);
        grupa.addStudent(s7);
        grupa.addStudent(s8);
        grupa.addStudent(s9);
        grupa.addStudent(s10);
        grupa.addStudent(s11);
        grupa.addStudent(s12);
        grupa.addStudent(s13);
        grupa.addStudent(s14);
        grupa.addStudent(s15);
 //       grupa.addStudent(s16);

        grupa.printStudentGroup();
    }
}

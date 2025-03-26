public class Student {
    public String fname;
    public String lname;
    public String indexNumber;
    public String email;
    public String address;
    double[] grades = new double[20];
    int gradeCount = 0;

    public Student(String fname, String lname, String indexNumber, String email, String address) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
    }
    void grades(double grade) {
        if (grade < 2.0 || grade > 5.0 || (grade *10) % 5 != 0) {
            throw new IllegalArgumentException("Niepoprawna ocena");
        }
        if (gradeCount >= 20) {
            throw new IllegalArgumentException("Maksymalnie student może mieć 20 ocen");
        }
        grades[gradeCount++] = grade;
    }

    double getAverage() {
        if (gradeCount == 0) {
            throw new IllegalArgumentException("Student musi mieć co najmniej jedną ocenę");
        }
        double suma = 0;
        for (int i = 0; i < gradeCount; i++) {
            suma += grades[i];
        }
        return (Math.round((suma/gradeCount)*2))/2.0;
    }
}

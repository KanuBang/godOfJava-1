package f_lab.godOfJava_1.chap8.example;

public class ManageStudent {
    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        Student[] students = manageStudent.addStudent();
        manageStudent.printStudents(students);
    }

    public Student[] addStudent() {
        Student[] students = new Student[3];
        students[0] = new Student("Lim");
        students[1] = new Student("Min");
        students[2] = new Student("Sook", "Seoul", "010XXXXXXXX", "adsf@naver.com");
        return students;
    }

    public void printStudents(Student... students) {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}

package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    Integer number;
    Student leader;
    List<Student> students;

    public Klass(Integer number) {
        this.number = number;
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public void assignLeader(Student student) {
        if (!student.klass.students.contains(student)) {
            System.out.print("It is not one of us.\n");
        } else {
            setLeader(student);
        }
    }

    public void appendMember(Student student) {
        students.add(student);
    }
}

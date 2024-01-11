package domain;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        this.studentList.add(student);
    }
}

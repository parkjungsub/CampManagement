package domain;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        this.studentList.add(student);
    }
    public List<Student> getStudentList(){ //studentList 리턴하는 메소드 (박정섭)
        return studentList;
    }
}

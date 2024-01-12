package domain;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public Student isStudentById(Integer id){
        for (Student student : studentList) {
            if(id == student.getStudentId()) return student;
        }
        return null;
    }
    public Student isStudentByName(String name) {
        for (Student student : studentList) {
            if (name.equals(student.getName())) return student;
        }
        return null;
    }
}

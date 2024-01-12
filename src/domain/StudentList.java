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
    public Student isStudentByName(String name){
        for (Student student : studentList) {
            if(name.equals(student.getName())) return student;
        }
        return null;
    }

    public Student findStudentById(Integer id){
        return studentList.get(id);
    }
    public void showStudentList(){
        if(studentList == null) System.out.println("등록된 학생이 없습니다");
        else {
            for (Student student : studentList) {
                System.out.println(student.getStudentId() + ", " + student.getName());
            }
        }
    }
}

package domain;

public class Student {
    private Integer studentId =0;
    private String name;
    private SubjectList subjectList;

    public Student(String name) {
        this.studentId++;
        this.name = name;
    }
    public void addSubjectToStudent(Subject subject){
        this.subjectList.addSubject(subject);
    }
}

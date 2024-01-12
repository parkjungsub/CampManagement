package domain;

public class Student {
    private static int idSeq = 1;
    private Integer studentId;
    private String name;
    private SubjectList subjectList;

    public Student(String name) {
        this.studentId = idSeq++;
        this.name = name;
    }

    public void addSubjectToStudent(Subject subject){
        this.subjectList.addSubject(subject);
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public SubjectList getSubjectList() {
        return subjectList;
    }
}

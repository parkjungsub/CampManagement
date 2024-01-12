package domain;

public class Student {
    private static int idSeq = 1;
    private Integer studentId =0;
    private String name;
    private SubjectList subjectList;

    public Student(String name) {
        this.studentId = idSeq++;
        this.name = name;
    }

    public Integer getStudentId(){
        return this.studentId;
    }

    public String getName(){
        return this.name;
    }
}

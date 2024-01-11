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
    public Integer getStudentId(){
        return studentId;
    }
    public String getName(){ // 학생의 이름 리턴하는 메소드 (박정섭)
        return name;
    }
    public Integer getStdentId(){ //학생의 고유번호 리턴하는 메소드 (박정섭)
        return studentId;
    }
}

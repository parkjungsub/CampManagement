package domain;


public class Student {
    private static int idSeq = 1;
    private Integer studentId;
    private String name;
    private SubjectList subjectList = new SubjectList();

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


    public void addSubjects(SubjectList subjectList){
        this.subjectList = subjectList;
    }

    public void showSubjectList() {
        System.out.println(name + "의 등록된 과목입니다.");
        if (subjectList == null) {
            System.out.println("등록된 과목이 없습니다");
        } else {
            subjectList.showSubjectList();
        }
    }
}

package data;

import domain.*;

public class InitData {
    private SubjectList subjectList = new SubjectList();
    private StudentList studentList = new StudentList();
    private ScoreList scoreList = new ScoreList();

    public ScoreList scoreList() {
        initScore();
        return scoreList;
    }

    public SubjectList subjectList() {
        initSubjects();
        return subjectList;
    }

    public StudentList studentList() {
        initStudents();
        return studentList;
    }

    private void initSubjects(){
        subjectList.addSubject(new Subject("Java", OptionalRequired.ESSENTIAL));
        subjectList.addSubject(new Subject("객체지향", OptionalRequired.ESSENTIAL));
        subjectList.addSubject(new Subject("Spring", OptionalRequired.ESSENTIAL));
        subjectList.addSubject(new Subject("JPA", OptionalRequired.ESSENTIAL));
        subjectList.addSubject(new Subject("MySQL", OptionalRequired.ESSENTIAL));
        subjectList.addSubject(new Subject("디자인패턴", OptionalRequired.OPTIONAL));
        subjectList.addSubject(new Subject("Spring Security", OptionalRequired.OPTIONAL));
        subjectList.addSubject(new Subject("Redis", OptionalRequired.OPTIONAL));
        subjectList.addSubject(new Subject("MongoDB", OptionalRequired.OPTIONAL));
    }
    private void initStudents(){
        studentList.addStudent(new Student("정진찬"));
        studentList.addStudent(new Student("주준호"));
        studentList.addStudent(new Student("박정섭"));
        studentList.addStudent(new Student("홍세희"));
    }
    private void initScore(){
        scoreList.addScore(new Score(1,1,1,95));

    }


}

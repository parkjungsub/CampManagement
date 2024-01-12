package domain;

import java.util.ArrayList;
import java.util.List;

public class SubjectList {

    private List<Subject> subjectList = new ArrayList<>();

    public void addSubject(Subject subject){
        subjectList.add(subject);
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }


    public void showSubjectList(){
        if(subjectList == null){
            System.out.println("과목이 없습니다.");
        }
        else {
            for (Subject subject : subjectList) {
                System.out.println(subject.getSubjectId() + ", " + subject.getName() + " : " + subject.getOptionalRequired());
            }
        }
    }
    public Subject findSubjectById(Integer id){
        return subjectList.get(id);
    }
}

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
}

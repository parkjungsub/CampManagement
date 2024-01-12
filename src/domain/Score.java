package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Score {
    private Integer subjectId;
    private Integer studentId;
    private Integer testRound;
    private Integer score;
    private String grade;

    public Score(Integer subjectId, Integer studentId, Integer testRound, Integer score){
        this.subjectId = subjectId;
        this.studentId = studentId;
        this.testRound = testRound;
        this.score = score;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public Integer getTestRound() {
        return testRound;
    }

    public Integer getScore() {
        return score;
    }

}

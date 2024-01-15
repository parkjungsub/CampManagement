package domain;



public class Score {
    private Integer subjectId;
    private Integer studentId;
    private Integer testRound;
    private Integer score;
    private String grade;

    public Score() {
    }

    public Score(Integer subjectId, Integer studentId, Integer testRound, Integer score) {
        this.subjectId = subjectId;
        this.studentId = studentId;
        this.testRound = testRound;
        this.score = score;
    }

    public Integer getStudentId() {
        return studentId;
    }


    public Integer getSubjectId() {
        return subjectId;
    }

    public Integer getTestRound() {
        return testRound;
    }

    public Integer getScore() {
        return score;
    }


    public String getGrade() {
        return grade;
    }

    public void updateTestRound(Integer updateTestRoundNumber){
        this.testRound = updateTestRoundNumber;
    }
    public void updateScore(Integer updateScoreNumber){
        this.score = updateScoreNumber;
    }

    public String updateGrade(SubjectList subjectList){
        for (Subject subject : subjectList.getSubjectList()) {
            if(subject.getSubjectId() == subjectId){
                if(subject.getOptionalRequired() == OptionalRequired.ESSENTIAL){
                    if(score>=95) return "A";
                    else if(score >= 90) return "B";
                    else if(score >= 80) return "C";
                    else if(score >= 70) return "D";
                    else return "F";
                }
                else if(subject.getOptionalRequired() == OptionalRequired.OPTIONAL){
                    if(score>=90) return "A";
                    else if(score >= 80) return "B";
                    else if(score >= 70) return "C";
                    else if(score >= 60) return "D";
                    else return "F";
                }
            }
        }
        return "존재하지 않는 과목입니다.";
    }
}

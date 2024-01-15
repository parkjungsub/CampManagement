package domain;



public class Score {
    private Integer subjectId;
    private Integer studentId;
    private Integer testRound;
    private Integer score;
    private String grade ="N";

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
    public void addScore(Integer inputScore){
        score = inputScore;
    }

    public void addGrade(String inputGrade) {
        grade = inputGrade;
    }
    public void showScore(){
        System.out.println(subjectId + " " + studentId + " " +testRound + " " + score + " " + grade);
    }
}

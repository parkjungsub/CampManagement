package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScoreList {
    private List<Score> scoreList;
    private Map<Student, Subject> subjectMap = new HashMap<>();
    private Map<Subject,List<Score>> subjectRoundMap = new HashMap<>();
//    private Map<Integer, Integer> scoreList = new HashMap<>();


    // 회차 등록
    public List<Score> setTestRound(Score testRound){
        List<Score> round = new ArrayList<>();

        round.add(testRound);


        return round;
    }

    // 점수 등록
    public List<Score> setScore(Score score){
        List<Score> scores = new ArrayList<>();

        scores.add(score);


        return  scores;
    }

//    public void setStudentSubject(Student studentId, Subject SubjectId){
//        subjectMap.put(studentId,SubjectId);
//    }
//
//    public void setSubjectRound(Subject subjectId, Integer round){
//        subjectRoundMap.put(subjectId,round);
//    }


    // 회차별 점수 등록
    public void setRoundScore(Subject round, List<Score> score){
        subjectRoundMap.put(round, score);



    }

    // 회차로 점수 조회
//    public Map<Integer,Integer> getScoreByRound(Integer round){
//        List<Integer> roundList = new ArrayList<>();
//        roundList.add(scoreList.get(round));
//
//        return scoreList;
//    }

}

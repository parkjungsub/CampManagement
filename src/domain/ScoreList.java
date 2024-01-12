package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScoreList {
    private List<Score> scoreList = new ArrayList<>();

    public void setScoreList(Score score){
        scoreList.add(score);
    }

    public List<Score> getScoreList(){
        return scoreList;
    }

//    public void print(){
//        for (Score score : scoreList) {
//            System.out.println("이름 : " + score.getStudentId()
//                    + " , 과목 : " + score.getSubjectId()
//                    + " , 회차 : " + score.getTestRound()
//                    + " , 점수 : " + score.getScore());
//            System.out.println("성적이 등록 되었습니다.");
//        }
//    }
}

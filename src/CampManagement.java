import data.InitData;
import domain.*;
import service.ScoreService;

import javax.xml.stream.events.StartDocument;
import domain.ScoreList;
import domain.StudentList;
import domain.SubjectList;
import service.UpdateExamRoundAndScoreByStudentSubject;

import java.util.Scanner;

public class CampManagement {
    public void systemOn(){
        Frame frame = new Frame();
        //Repository
        InitData initData = new InitData();
        final StudentList studentRepository = initData.studentList();
        final SubjectList subjectRepository = initData.subjectList();
        final ScoreList scoreRepository = initData.scoreList();

        //지역 변수
        Scanner input = new Scanner(System.in);
        System.out.println("[ 캠프관리자 ]");
        //할당 부분

        ScoreService scoreService = new ScoreService();

        UpdateExamRoundAndScoreByStudentSubject updateExamRoundAndScoreByStudentSubject = new UpdateExamRoundAndScoreByStudentSubject();

        //campManagement 로직
        while(true){
            frame.mainFrame();
            int click = input.nextInt();
            //수강생 등록
            if(click == 1){

            }
            //수강생 목록
            if(click == 2){

            }
            //수강생 과목별 시험 회차 및 점수 등록
            if(click == 3){
                scoreService.registerScore(studentRepository, subjectRepository);
            }
            //수강생 과목별 시험 회차 및 점수 수정
            if(click == 4){


            }
            //수강생 과목별 시험 회차 및 점수 수정
            if(click == 4){
                updateExamRoundAndScoreByStudentSubject.updateScoreByStudentRound(studentRepository,subjectRepository ,scoreRepository);
            }
            //수강생 특정 회차별 등급 조회
            if(click == 5){

            }
        }
    }
}

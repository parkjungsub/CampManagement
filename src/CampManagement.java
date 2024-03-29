import data.InitData;
import domain.*;
import service.ScoreService;

import javax.xml.stream.events.StartDocument;
import domain.ScoreList;
import domain.StudentList;
import domain.SubjectList;
import service.SubjectManagement;
import service.UpdateExamRoundAndScoreByStudentSubject;
import service.StudentManagement;


import java.util.Scanner;

public class CampManagement {
    public void systemOn(){
        Frame frame = new Frame();
        //Repository
        InitData initData = new InitData();
        final StudentList studentRepository = initData.studentList();
        final SubjectList subjectRepository = initData.subjectList();
        final ScoreList scoreRepository = initData.scoreList();
        StudentManagement studentRegistration = new StudentManagement();
        SubjectManagement subjectManagement =  new SubjectManagement();


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
                studentRegistration.addStudentRegistration(studentRepository, subjectRepository);

            }
            //수강생 목록
            if(click == 2){
                studentRegistration.getStudentRegistration(studentRepository);
            }
            //수강생 과목별 시험 회차 및 점수 등록
            if(click == 3){
                scoreService.registerScore(studentRepository, subjectRepository, scoreRepository);
            }
            //수강생 과목별 시험 회차 및 점수 수정
            if(click == 4){
                updateExamRoundAndScoreByStudentSubject.updateScoreByStudentRound(studentRepository,subjectRepository ,scoreRepository);
            }
            //수강생 특정 회차별 등급 조회
            if(click == 5){
                scoreService.examineStudentGradeBySpecificRound(studentRepository,scoreRepository);
            }
            //수강생 특정 삭제
            if (click == 6){
                studentRegistration.deleteOneStudent(studentRepository);
            }
            //과목을 통해 수강생 조회
            if (click == 7){
                studentRegistration.getOneStudent(studentRepository);

            }
        }
    }
}

import data.InitData;
import domain.ScoreList;
import domain.StudentList;
import domain.SubjectList;
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

        //지역 변수
        Scanner input = new Scanner(System.in);
        System.out.println("[ 캠프관리자 ]");
        //할당 부분
        UpdateExamRoundAndScoreByStudentSubject updateExamRoundAndScoreByStudentSubject = new UpdateExamRoundAndScoreByStudentSubject();

        //campManagement 로직
        while(true){
            frame.mainFrame();
            int click = input.nextInt();
            //수강생 등록
            if(click == 1){
                studentRegistration.addStudentRegistration(studentRepository);
            }
            //수강생 목록
            if(click == 2){
                studentRegistration.getStudentRegistration(studentRepository);
            }
            //수강생 과목별 시험 회차 및 점수 등록
            if(click == 3){

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

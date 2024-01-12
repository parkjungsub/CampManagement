package service;

import domain.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ScoreService {

    ScoreList scoreList = new ScoreList();


    Scanner sc = new Scanner(System.in);

    // 메서드 이름 변경
    public void registerScore(StudentList studentList, SubjectList subjectList) {

        CreateSubjectsThatStudentListening add = new CreateSubjectsThatStudentListening();
        add.createSubjectsThatStudentListening(studentList,subjectList);


        System.out.println("성적을 입력할 학생을 고르세요.");

        for (Student student : studentList.getStudentList()) {
            System.out.println(student.getStudentId() + ". " + student.getName());
        }
        // 성적 입력할 학생 입력
        int studentSelector = sc.nextInt();


        System.out.println("성적을 입력할 과목을 고르세요.");

        // 현재 과목전체를 보여줌 => 수강하고있는 과목만 출력하도록.
        for(Student student : studentList.getStudentList()){
            for(int i=0; i<student.getSubjectList().getSubjectList().size(); i++){
                System.out.println(student.getSubjectList().getSubjectList().get(i).getSubjectId() + ". " + student.getSubjectList().getSubjectList().get(i).getName());
            }
        }
        // 성적 입력할 과목 입력
        int subjectSelector = sc.nextInt();


        // 회차 입력 x => 자동으로 회차 출력, 점수 등록
        // 1회차 점수 등록 : score
        // 2회차 점수 등록 : score
        // 3회차 점수 등록 : score
        // 4회차 점수 등록 : score
        // ...
        List<Integer> score = new ArrayList<>();
        int round = 1;
        for(int i=0; i<10; i++){
            System.out.print(round + "회차 점수 입력 : ");
            score.add(sc.nextInt());

            // Score(subjectId, studentId, testRound, score) 객체를 생성해서 scoreList에 담기
            scoreList.setScoreList(new Score(subjectSelector-1,studentSelector-1,round,score.get(i))); //testRoundSelector를 id로
            round++;
        }


        // scoreList에 들어있는 값 출력
        print(scoreList.getScoreList(),studentList,subjectList,studentSelector-1,subjectSelector-1);

    }

    // id로 student 이름 조회
    public String findStudentNameById(StudentList studentList, int studentId){
        return studentList.getStudentList().get(studentId).getName();
    }

    // id로 subject 이름 조회
    public String findSubjectNameById(SubjectList subjectList, int subjectID){
        return subjectList.getSubjectList().get(subjectID).getName();
    }

    // 입력한 성적 출력
    public void print(List<Score> scoreList, StudentList studentList, SubjectList subjectList , int studentId, int subjectId){
        for (Score score : scoreList) {
            System.out.println("이름 : " + findStudentNameById(studentList,studentId)
                    + " , 과목 : " + findSubjectNameById(subjectList,subjectId)
                    + " , 회차 : " + score.getTestRound()
                    + " , 점수 : " + score.getScore());
        }
        System.out.println("성적이 등록 되었습니다.");

    }

}

package service;

import data.InitData;
import domain.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ScoreService {

    ScoreList scoreList = new ScoreList();

    Scanner sc = new Scanner(System.in);

    public void setScore(StudentList studentList, SubjectList subjectList) {


        System.out.println("성적을 입력할 학생을 고르세요.");

        for (Student student : studentList.getStudentList()) {
            System.out.println(student.getStudentId() + ". " + student.getName());
        }
        // 성적 입력할 학생 입력
        int studentSelector = sc.nextInt();

        System.out.println("성적을 입력할 과목을 고르세요.");
        for (Subject subject : subjectList.getSubjectList()) {
            System.out.println(subject.getSubjectId() + ". " + subject.getName());
        }
        // 성적 입력할 과목 입력
        int subjectSelector = sc.nextInt();

        // 성적 입력할 회차 입력
        System.out.println("성적을 입력할 회차를 고르세요.");
        int testRoundSelector = sc.nextInt();

        // 성적 입력
        System.out.println(testRoundSelector + "회차의 성적을 입력하세요.");
        int testScore = sc.nextInt();

        // Score(subjectId, studentId, testRound, score) 객체를 생성해서 scoreList에 담기
        scoreList.setScoreList(new Score(subjectSelector-1,studentSelector-1,testRoundSelector,testScore));

        // scoreList에 들어있는 값 출력
        print(scoreList.getScoreList(),studentList,subjectList,studentSelector-1,subjectSelector-1);

    }

    // id로 student 이름 조회
    public String findStduentNameById(StudentList studentList, int studentId){
        return studentList.getStudentList().get(studentId).getName();
    }
    // id로 subject 이름 조회
    public String findSubjectNameById(SubjectList subjectList, int subjectID){
        return subjectList.getSubjectList().get(subjectID).getName();
    }

    // 입력한 성적 출력
    public void print(List<Score> scoreList, StudentList studentList, SubjectList subjectList , int studentId, int subjectId){
        for (Score score : scoreList) {
            System.out.println("이름 : " + findStduentNameById(studentList,studentId)
                    + " , 과목 : " + findSubjectNameById(subjectList,subjectId)
                    + " , 회차 : " + score.getTestRound()
                    + " , 점수 : " + score.getScore());
            System.out.println("성적이 등록 되었습니다.");
        }
    }

}

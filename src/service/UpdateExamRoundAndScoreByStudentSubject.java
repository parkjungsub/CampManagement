package service;

import domain.*;

import java.util.Scanner;

public class UpdateExamRoundAndScoreByStudentSubject {

    public void updateScoreByStudentRound(StudentList studentRepository,SubjectList subjectRepository, ScoreList scoreRepository) {
        Scanner input = new Scanner(System.in);
        System.out.print("변경할 학생의 이름을 입력해 주세요 : ");
        String studentName = input.next();
        if(studentRepository.isStudentByName(studentName)==null) System.out.println("그런 학생 없음!");
        else {
            System.out.print("변경할 회차를 입력하세요 : ");
            Integer updateTestRoundNumber = input.nextInt();
            System.out.print("변경할 점수를 입력하세요 : ");
            Integer updateScoreNumber = input.nextInt();
            updateExamRoundAndScoreByStudentSubject(studentRepository.isStudentByName(studentName),subjectRepository, scoreRepository,updateTestRoundNumber,updateScoreNumber);
        }
    }

    private void updateExamRoundAndScoreByStudentSubject(Student student,SubjectList subjectList, ScoreList scoreList, Integer updateTestRound, Integer updateScore){
        if(scoreList.containStudentByScore(student) == -1){
            System.out.println(student.getName() + "의 점수 정보가 없습니다.");
        }
        else {
            for (Score score : scoreList.getScoreList()) {
                if(score.getStudentId() == student.getStudentId()) {
                    score.updateTestRound(updateTestRound);
                    score.updateScore(updateScore);
                    score.updateGrade(subjectList);
                }
            }
            System.out.println(student.getName() + "의 " + updateTestRound + "회차의 점수가 " + updateScore +"로 변경 되었습니다.");
        }
    }

}

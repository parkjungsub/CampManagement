package service;

import domain.*;

import java.util.Scanner;

public class UpdateExamRoundAndScoreByStudentSubject {
    private KeepGrade keepGrade = new KeepGrade();

    public void updateScoreByStudentRound(StudentList studentRepository,SubjectList subjectRepository, ScoreList scoreRepository) {
        Scanner input = new Scanner(System.in);
        studentRepository.showStudentList();
        System.out.print("변경할 학생의 id값을 입력해 주세요 : ");
        int studentId = input.nextInt();
        if(studentRepository.isStudentById(studentId)==null) System.out.println("그런 학생 없음!");
        else {
            Student findStudent = studentRepository.findStudentById(studentId);
            findStudent.showSubjectList();
            System.out.print("변경할 과목의 id값을 입력하세요 : ");
            Integer subjectId = input.nextInt();
            Subject findSubjectByIdIncludeStudent = subjectRepository.findSubjectById(subjectId);
            System.out.print("변경할 회차를 입력하세요 : ");
            Integer updateTestRoundNumber = input.nextInt();
            System.out.print("변경할 점수를 입력하세요 : ");
            Integer updateScoreNumber = input.nextInt();
            updateExamRoundAndScoreByStudentSubject(studentRepository.findStudentById(studentId),scoreRepository,findSubjectByIdIncludeStudent,updateTestRoundNumber,updateScoreNumber);

        }
    }

    private void updateExamRoundAndScoreByStudentSubject(Student student,ScoreList scoreList, Subject subject,Integer testRound, Integer updateScore){
        if(scoreList.containStudentByScore(student) == -1){
            System.out.println(student.getName() + "의 점수 정보가 없습니다.");
        }
        else {
            for (Score score : scoreList.getScoreList()) {
                if(score.getStudentId() == student.getStudentId()&&score.getTestRound() ==testRound &&score.getSubjectId() == subject.getSubjectId()) {
                    score.updateScore(updateScore);
                    keepGrade.keepScore(score, subject);
                }
            }
            System.out.println(student.getName() + "의 " + testRound + "회차의 점수가 " + updateScore +"로 변경 되었습니다.");
        }
    }

}

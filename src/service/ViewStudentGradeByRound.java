package service;

import domain.*;

import java.util.Scanner;

public class ViewStudentGradeByRound {
    public void viewStudentGradeByRound(StudentList studentRepository, SubjectList subjectRepository, ScoreList scoreRepository) {

        Scanner input = new Scanner(System.in);

        System.out.println("조회할 학생의 ID 를 입력해주세요. ");

        // 학생 리스트 출력(id & name)
        studentRepository.showStudentList();

        System.out.println("ID 입력 : ");
        int studentId = input.nextInt();

        if (studentRepository.isStudentById(studentId) == null)  {
            System.out.println("조회하고자 하는 학생의 ID 를 다시 확인해주세요.");
        }
        else {
            Student filteredByIdStudent = studentRepository.isStudentById(studentId);

            // 해당 학생의 수강 과목 리스트 출력
            filteredByIdStudent.showSubjectList();

//            //모든 과목 리스트 출력
//            subjectRepository.showSubjectList();

            System.out.println("그 학생 과목의 ID 를 입력해주세요.");
            int subjectId = input.nextInt();
            if (filteredByIdStudent.getSubjectList() == null) {
                System.out.println("조회하고자 하는 학생의 수강 과목을 다시 확인하여 주세요.");
            }
            else {
                if (scoreRepository.isStudentId(studentId)&& scoreRepository.isSubjectId(subjectId)) {
                    // 해당 과목의 시험 회차 출력
                    System.out.println("해당 과목의 시험 회차 :");
                    System.out.println(scoreRepository.filterByStudentSubjectId(studentId, subjectId).getTestRound());
                    Score filteredBySubjectId = scoreRepository.filterByStudentSubjectId(studentId, subjectId);


                    filteredBySubjectId.updateGrade(subjectRepository);

                    System.out.println("성적을 조회 할 시험 회차를 입력해주세요.");
                    System.out.println(filteredBySubjectId.getGrade());
                }
            }
        }
    }
}

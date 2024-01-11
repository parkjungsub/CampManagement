package service;

import domain.Student;
import domain.StudentList;

import java.util.Scanner;

public class studentRegistration {
    Scanner input = new Scanner(System.in);

    public void addStudentRegistration(StudentList studentRepository){ // 학생 이름 등록하는 메소드
        studentRepository.addStudent(new Student(input.next()));
    }
    public void getStudentRegistration(StudentList studentRepository) { //
        for (int i = 0; i < studentRepository.getStudentList().size();i++){
            System.out.println("수강생: " + studentRepository.getStudentList().get(i).getName() + "\t고유번호: " + studentRepository.getStudentList().get(i).getStudentId());
        }
    }
}

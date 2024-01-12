package service;

import domain.Student;
import domain.StudentList;

import java.util.Scanner;

public class StudentManagement {
    Scanner input = new Scanner(System.in);

    public void addStudentRegistration(StudentList studentRepository){ // 학생 이름 등록하는 메소드
        System.out.println("수강생 이름을 입력하시오.");
        studentRepository.addStudent(new Student(input.next()));
    }
    public void getStudentRegistration(StudentList studentRepository) { // 모든 등록된 학생 출력 메소드
        for (int i = 0; i < studentRepository.getStudentList().size();i++){
            System.out.println("수강생: " + studentRepository.getStudentList().get(i).getName() + "\t고유번호: " + studentRepository.getStudentList().get(i).getStudentId());
        }
    }

    public void getOneStudent(StudentList studentRepository){ // 인덱스를 이용하여 학생만 출력하는 메소드
        int idNum = input.nextInt();
        System.out.println("수강생: " + studentRepository.getStudentList().get(idNum).getName() + "\t고유번호: " + studentRepository.getStudentList().get(idNum).getStudentId());
    }

    public void deleteOneStudent(StudentList studentRepository){// 인덱스를 이용하여 수강생을 삭제하는 메소드
        System.out.println("삭제하고 싶은 수강생을 고유번호를 입력하시오.");
        int idNum = input.nextInt();
        studentRepository.getStudentList().remove(idNum-1);
    }
}

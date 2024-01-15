package service;

import domain.*;

import java.util.Scanner;

public class StudentManagement {
    Scanner input = new Scanner(System.in);
    SubjectManagement subjectManagement = new SubjectManagement();
    Student student;

    public void addStudentRegistration(StudentList studentRepository, SubjectList subjectList){ // 학생 이름 등록하는 메소드
        String regExp = "^[가-힣]*$";
        System.out.println("수강생 이름을 입력하시오.");
        String name = input.next();
        if(name.matches(regExp) == true){ //한글입력만으로 수강생 등록하는 기능
            Student student = new Student(name);
            studentRepository.addStudent(student);
            subjectManagement.addSubject(studentRepository, subjectList);
        } else
            System.out.println("한글이름으로 입력하시오.");
    }

    public void getStudentRegistration(StudentList studentRepository) { // 모든 등록된 학생 출력 메소드
        for (int i = 0; i < studentRepository.getStudentList().size();i++){
            System.out.println("수강생: " + studentRepository.getStudentList().get(i).getName() + "\t고유번호: " + studentRepository.getStudentList().get(i).getStudentId());
            studentRepository.getStudentList().get(i).getSubjectList().showSubjectList(); //해당학생의 과목 출력
        }
    }

    public void deleteOneStudent(StudentList studentRepository){// 학생 고유번호를 이용하여 수강생을 삭제하는 메소드
        getStudentRegistration(studentRepository);
        System.out.println("삭제하고 싶은 수강생을 고유번호를 입력하시오.");
        int idNum = input.nextInt();
                studentRepository.getStudentList().remove(studentRepository.isStudentById(idNum));

    }

    public void getOneStudent(StudentList studentRepository){// 과목명으로 그 과목을 수강하는 수강생 검생기능
        System.out.println("과목을 검색하시오.");
        String subject = input.next();
        for (int i = 0 ;i < studentRepository.getStudentList().size(); i++){
            for (int j = 0;j < studentRepository.getStudentList().get(i).getSubjectList().getSubjectList().size();j++){
                 if (subject.equals(studentRepository.getStudentList().get(i).getSubjectList().getSubjectList().get(j).getName()) == true){
                    System.out.println(studentRepository.getStudentList().get(i).getSubjectList().getSubjectList().get(j).getName());
                    System.out.println("수강생: " + studentRepository.getStudentList().get(i).getName() + "\t고유번호: " + studentRepository.getStudentList().get(i).getStudentId());
                }
            }
        }
    }
}

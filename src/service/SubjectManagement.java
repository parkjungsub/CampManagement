package service;


import domain.*;

import java.util.Scanner;

public class SubjectManagement {
    Scanner input = new Scanner(System.in);

    // 과목 입력 받는 메소드
    public void addSubject(StudentList studentRepository, SubjectList subjectList, Student student){
        System.out.println("과목을 선택해주세요 (띄어쓰기로 구분)");
        subjectList.showSubjectList();
        String numbers = input.nextLine();
        for (int i = 0; i < numbers.length();i++){ //과목을 여러개 입력받아 학생의 과목의 리스트에 넣기
           try {
               int num = Integer.parseInt(numbers.substring(i,i+1));
               studentRepository.getSubjectList(student.getStudentId()-1,studentRepository).addSubject(subjectList.findSubjectById(num -1)); //학생 개체의 안에 있는 과목의 리스트 리턴
           }catch (NumberFormatException e){

           }
        }
    }
}

package service;

import data.InitData;
import domain.*;

import java.util.Scanner;

public class SubjectManagement {
    int studentId = 0;
    Scanner input = new Scanner(System.in);
    public void addSubject(StudentList studentRepository, SubjectList subjectList){ // 과목 입력 받는 메소드
        System.out.println("과목을 선택해주세요");
        subjectList.showSubjectList();
        String numbers = input.nextLine();
        for (int i = 0; i < numbers.length();i++){ //과목을 여러개 입력받아 학생의 과목의 리스트에 넣기
           try {
               Integer.parseInt(numbers.substring(i,i+1));
               int num = Integer.parseInt(numbers.substring(i,i+1));
               studentRepository.getStudentList().get(studentId).getSubjectList().addSubject(subjectList.findSubjectById(num -1)); //학생 개체의 안에 있는 과목의 리스트 리턴
           }catch (NumberFormatException e){

           }
        }
       studentId++;
    }
}

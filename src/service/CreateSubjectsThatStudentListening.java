package service;

import domain.Student;
import domain.StudentList;
import domain.SubjectList;

import java.util.*;

public class CreateSubjectsThatStudentListening {
        private SubjectList subjectList = new SubjectList();

        private Scanner scanner = new Scanner(System.in);
        public void createSubjectsThatStudentListening(StudentList studentRepository, SubjectList subjectRepository) {
            studentRepository.showStudentList();
            System.out.println("과목을 추가할 수강생의 id 값을 입력하세요");
            Integer input = scanner.nextInt();
            Student selectedStudent = studentRepository.findStudentById(input-1);
            selectedStudent.addSubjects(addSubjects(subjectRepository));
        }

        private SubjectList addSubjects(SubjectList subjectRepository){
            subjectRepository.showSubjectList();
            System.out.println("과목의 id값을 입력하세요. ( ,(점)으로 구분)");
            String inputs = scanner.next();
            String[] input = inputs.split(",");
            List<Integer> selectedSubjectNumbers = new ArrayList<>();
            // 필수과목 3가지 이상, 선택과목 2가지 이상 TODO

            for (String s : input) {
                //숫자를 입력하지 않으면 런타임 오류 : 해결해야함
                selectedSubjectNumbers.add((Integer.parseInt(s))-1);
            }
            for (Integer selectedSubjectNumber : selectedSubjectNumbers) {
                subjectList.addSubject(subjectRepository.findSubjectById(selectedSubjectNumber));
            }
            return subjectList;
        }

}


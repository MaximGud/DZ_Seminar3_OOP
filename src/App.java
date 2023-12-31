import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 444);
        Student s5 = new Student("Даша", 23, 171);
        Student s6 = new Student("Лена", 23, 104);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        //System.out.println(group4580);

        // for (Student std : group4580) {
        //     System.out.println(std);
        //}

        // создаем новую группу студентов
        Student s7 = new Student("Катя", 21, 1215);
        Student s8 = new Student("Виктор", 24, 3019);
        Student s9 = new Student("Николай", 21, 1213);
        Student s10 = new Student("Семен", 23, 4444);
        Student s11 = new Student("Игорь", 22, 1571);
        

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);
        listStud2.add(s10);
        listStud2.add(s11);
        

        StudentGroup group4581 = new StudentGroup(listStud2, 4581);
        List<StudentGroup> studentGroups = new ArrayList<StudentGroup>();
        studentGroups.add(group4580);
        studentGroups.add(group4581);

        // новый поток студентов
        StudentSteam steam1 = new StudentSteam(studentGroups, 1);

        //вывести список групп
        for (StudentGroup stm : steam1) {
             System.out.println(stm);
        }

        System.out.println("=========================================================");

        //выводим отсортированные по количеству участников группы
        Collections.sort(steam1.getStudentGroups());

        for (StudentGroup stm : steam1.getStudentGroups()) {
            System.out.println(stm);
        }
    }
}

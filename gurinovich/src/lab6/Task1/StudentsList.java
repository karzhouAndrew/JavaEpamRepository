package lab6.Task1;

import java.util.List;
import java.util.Random;

public class StudentsList {

    public List<Student> listCreation(List<Student> listOfStudents,String[][] firstLastNames){

        Random rand = new Random();
        for (String[] firstLastName : firstLastNames) {
            Student student = new Student();
            student.setFirstName(firstLastName[0]);
            student.setLastName(firstLastName[1]);
            student.setMark(rand.nextInt(10));
            listOfStudents.add(student);
            System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getMark());
        }
        return listOfStudents;
    }

}

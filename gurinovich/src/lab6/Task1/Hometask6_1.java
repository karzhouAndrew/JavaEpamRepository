package lab6.Task1;

/* Описать класс Student (ФИО, оценка и т.д).
   Заполнить рандомно имена, а также оценку. Создать список студентов.
   Удалить из списка всех студентов с неудовлетворительными оценками.
 */

import java.util.ArrayList;
import java.util.List;

public class Hometask6_1 {
    public static void main(String[] args) {
        String[][] firstLastNames = {{"Sasha", "Shaginov"},
                {"Gleb", "Viltovskiy"},
                {"Natasha", "Mishuk"},
                {"Katya", "Nevelskaya"},
                {"Sergey", "Drobysh"}};

        List<Student> listOfStudents = new ArrayList<Student>();
        StudentsList studentsList = new StudentsList();
        listOfStudents = studentsList.listCreation(listOfStudents, firstLastNames);
        System.out.println("");

        for (int i=0; i<listOfStudents.size(); i++){
            Student temp = listOfStudents.get(i);
            if(temp.getMark()<4){
                listOfStudents.remove(i);
                i--;
            }
        }

        for (Student temp : listOfStudents) {
            System.out.println(temp.getFirstName() + " " + temp.getLastName() + " " + temp.getMark());
        }

    }
}

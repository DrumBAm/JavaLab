package Labs.LR_3.controller;

import Labs.LR_3.model.Human;
import Labs.LR_3.model.University;
import Labs.LR_3.model.Faculty;
import Labs.LR_3.model.Department;
import Labs.LR_3.model.Student;
import Labs.LR_3.model.Sex;

public class Run {
    public static void createTypicalUniversity() {
        Human universityHead = new Human("Fabio", "West", "", Sex.MALE);
        University university = new University("University of Technology", universityHead);

        Human facultyHead = new Human("Alexandra ", "Carson", "", Sex.FEMALE);
        Faculty faculty = new Faculty("Faculty of Philosophy", facultyHead);
        university.addFaculty(faculty);

        Human departmentHead = new Human("Denzel", "Kline", "", Sex.MALE);
        Department department = new Department("Faculty of Law", departmentHead);
        faculty.addDepartment(department);

        Student student1 = StudentCreator.createStudent("Kendra", "Schaefer", "", Sex.FEMALE, "Group 101");
        Student student2 = StudentCreator.createStudent("Jana", "Schaefer", "", Sex.FEMALE, "Group 102");
        department.addStudent(student1);
        department.addStudent(student2);

        System.out.println("University: " + university.getName());
        System.out.println("University Head: " + university.getHead().getFullName());
        System.out.println("Faculties: " + university.getFaculties().size());
    }
}


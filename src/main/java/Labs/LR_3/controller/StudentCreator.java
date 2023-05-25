package Labs.LR_3.controller;

import Labs.LR_3.model.Student;
import Labs.LR_3.model.Sex;

public class StudentCreator {
    public static Student createStudent(String firstName, String lastName, String patronymic, Sex sex, String group) {
        return new Student(firstName, lastName, patronymic, sex, group);
    }
}

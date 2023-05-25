package Labs.LR_3.controller;

import Labs.LR_3.model.Faculty;
import Labs.LR_3.model.Human;

public class FacultyCreator {
    public static Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }
}
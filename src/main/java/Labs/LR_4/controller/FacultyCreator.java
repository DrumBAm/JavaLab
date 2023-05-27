package Labs.LR_4.controller;

import Labs.LR_4.model.*;

public class FacultyCreator {
    public static Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }
}
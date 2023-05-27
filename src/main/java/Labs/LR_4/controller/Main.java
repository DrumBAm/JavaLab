package Labs.LR_4.controller;

import Labs.LR_4.model.*;
import Labs.LR_4.controller.*;


public class Main {
    public static void main(String[] args) {
        University oldUniversity = UniversityCreator.createTypicalUniversity();

        JsonManager.saveUniversityToJson(oldUniversity, "university.json");

        University newUniversity = JsonManager.loadUniversityFromJson("university.json");

        boolean isEqual = oldUniversity.equals(newUniversity);
        System.out.println("Are universities equal? " + isEqual);
        System.out.println(oldUniversity.getName());
        System.out.println(newUniversity.getName());
        System.out.println(oldUniversity.getFaculties());
        System.out.println(newUniversity.getFaculties());
    }
}


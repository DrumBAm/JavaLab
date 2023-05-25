package Labs.LR_3.controller;

import Labs.LR_3.model.Human;
import Labs.LR_3.model.Sex;

public class Main {
    public static void main(String[] args) {
        Run.createTypicalUniversity();
        Human me = new Human("Igor","Afanasenko","Nikolaevich", Sex.MALE);
        System.out.printf(me.getFullName());
    }
}

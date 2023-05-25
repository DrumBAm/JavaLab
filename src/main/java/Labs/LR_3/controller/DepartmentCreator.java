package Labs.LR_3.controller;

import Labs.LR_3.model.Department;
import Labs.LR_3.model.Human;

public class DepartmentCreator {
    public static Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }
}

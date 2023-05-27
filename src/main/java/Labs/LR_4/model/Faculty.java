package Labs.LR_4.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private Human head;
    private List<Department> departments;

    public Faculty(String name, Human head) {
        this.name = name;
        this.head = head;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Faculty other = (Faculty) obj;
        return Objects.equals(name, other.name) &&
                Objects.equals(head, other.head) &&
                Objects.equals(departments, other.departments);
    }


}
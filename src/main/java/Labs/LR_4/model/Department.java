package Labs.LR_4.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Human head;
    private List<Student> students;

    public Department(String name, Human head) {
        this.name = name;
        this.head = head;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Department other = (Department) obj;
        return Objects.equals(name, other.name) &&
                Objects.equals(head, other.head) &&
                Objects.equals(students, other.students);
    }


}

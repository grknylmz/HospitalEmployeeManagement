package domain;

/**
 * Created by Gürkan on 25.4.2015.
 */
public class Employee {
    private long id;
    private String name;
    private String department;
    private boolean working;

    public Employee() {
    }

    public Employee(long id, String name, String department, boolean working) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", working=" + working +
                '}';
    }
}

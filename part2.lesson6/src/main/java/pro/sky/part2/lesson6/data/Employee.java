package pro.sky.part2.lesson6.data;

public class Employee {
    private String firstName;
    private String lastname;
    private int department;
    private int salary;

    public Employee(String firstName, String lastname, int department, int salary) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public int getDepartment() {
        return department;
    }

    public String getFullname(){
        return firstName + " " + lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
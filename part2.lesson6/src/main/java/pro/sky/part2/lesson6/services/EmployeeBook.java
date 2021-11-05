package pro.sky.part2.lesson6.services;

import pro.sky.part2.lesson6.data.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeBook {
    Map<String, Employee> getAllEmployee();

    int getSalary();

    Employee getEmployeeMinSalary();

    Employee getEmployeeMaxSalary();

    int getAverageSalary();

    List<String> getFullnames();
}

package springmvc002.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc002.entities.Department;
import springmvc002.entities.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liguohua on 4/21/16.
 */
@Repository
public class EmployeeDAO {
    private static Map<Integer, Employee> employees =new HashMap<>();

    static {
        employees.put(1001, new Employee(1001, "e-1001", "e-1001@qq.com", 0, new Department(101, "D-101")));
        employees.put(1002, new Employee(1002, "e-1002", "e-1002@qq.com", 1, new Department(102, "D-102")));
        employees.put(1003, new Employee(1003, "e-1003", "e-1003@qq.com", 0, new Department(103, "D-103")));
        employees.put(1004, new Employee(1004, "e-1004", "e-1004@qq.com", 0, new Department(104, "D-104")));
        employees.put(1005, new Employee(1005, "e-1005", "e-1005@qq.com", 1, new Department(105, "D-105")));
    }

    @Autowired
    private DepartmentDAO departmentDAO;



    public Collection<Employee> getAll() {
        return employees.values();
    }

    public Employee getByID(int id) {
        return employees.get(id);
    }

    private int initID = 1000;
    public void save(Employee employee) {
        if (employee.getId() == 0) {
            employee.setId(initID++);
        }
        employee.setDemparment(departmentDAO.getDepartment(employee.getDemparment().getId()));
        employees.put(employee.getId(), employee);

    }

    public void delete(int id) {
        employees.remove(id);

    }

    public static Map<Integer, Employee> getEmployees() {
        return employees;
    }

    public static void setEmployees(Map<Integer, Employee> employees) {
        EmployeeDAO.employees = employees;
    }

    public DepartmentDAO getDepartmentDAO() {
        return departmentDAO;
    }

    public void setDepartmentDAO(DepartmentDAO departmentDAO) {
        this.departmentDAO = departmentDAO;
    }
}

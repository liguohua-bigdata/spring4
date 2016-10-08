package springmvc002.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import springmvc002.entities.Department;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liguohua on 4/21/16.
 */
@Repository
public class DepartmentDAO {

    private static Map<Integer, Department> departments = new HashMap<>();

    static {
        departments.put(101, new Department(101, "D-101"));
        departments.put(102, new Department(102, "D-102"));
        departments.put(103, new Department(103, "D-103"));
        departments.put(104, new Department(104, "D-104"));
        departments.put(105, new Department(105, "D-105"));
    }

    public Collection<Department> getAllDepartment() {
        return departments.values();
    }

    public Department getDepartment(int id) {
        return departments.get(id);
    }

    public static void setDepartments(Map<Integer, Department> departments) {
        DepartmentDAO.departments = departments;
    }

    public static Map<Integer, Department> getDepartments() {
        return departments;
    }
}

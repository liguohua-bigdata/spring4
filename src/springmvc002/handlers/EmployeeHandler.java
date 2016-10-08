package springmvc002.handlers;

import com.sun.org.glassfish.gmbal.ParameterNames;
import com.sun.tracing.dtrace.ModuleName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springmvc002.dao.DepartmentDAO;
import springmvc002.dao.EmployeeDAO;
import springmvc002.entities.Employee;

import java.util.Map;

/**
 * Created by liguohua on 4/21/16.
 */
@Controller
public class EmployeeHandler {
    @Autowired
    private EmployeeDAO employeeDAO;
    @Autowired
    private DepartmentDAO departmentDAO;

    @RequestMapping("/employeelist")
    public String list(Map<String, Object> map) {
        //将所有员工放入请求域
        map.put("employees", employeeDAO.getAll());
        return "list";
    }

    @RequestMapping(value = "/emp", method = RequestMethod.GET)
    public String input(Map<String, Object> map) {
        map.put("departments", departmentDAO.getAllDepartment());
        //为了方便spring表单的回显,不加将报错,对应input.jsp中的<form:form action="emp" method="post" modelAttribute="employee">
        map.put("employee", new Employee());
        return "input";
    }

    @RequestMapping(value = "/emp", method = RequestMethod.POST)
    public String save(Employee employee) {
        employeeDAO.save(employee);
        return "redirect:/employeelist";
    }

    @RequestMapping(value = "/emp/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Integer id) {
        employeeDAO.delete(id);
        return "redirect:/employeelist";
    }

    @RequestMapping(value = "/emp/{id}", method = RequestMethod.GET)
    public String input(@PathVariable("id") Integer id, Map<String, Object> map) {
        //为了方便spring表单的回显,不加将报错,对应input.jsp中的<form:form action="emp" method="post" modelAttribute="employee">
        map.put("employee", employeeDAO.getByID(id));
        map.put("departments", departmentDAO.getAllDepartment());
        return "input";
    }

    @RequestMapping(value = "/emp", method = RequestMethod.PUT)
    public String update(Employee employee) {
        employeeDAO.save(employee);
        return "redirect:/employeelist";
    }

    @ModelAttribute
    public void getEmployee(@RequestParam(value = "id", required = false) Integer id, Map<String, Object> map) {
        if (id != null) {
            map.put("employee", employeeDAO.getByID(id));
        }

    }
}

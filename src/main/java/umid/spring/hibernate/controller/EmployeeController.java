package umid.spring.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import umid.spring.hibernate.dao.EmployeeDAO;
import umid.spring.hibernate.entity.Employee;
import umid.spring.hibernate.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model){

        model.addAttribute("all_emp", employeeService.getAllEmployee());

        return "all-employee";
    }

    @RequestMapping("/addEmployee")
    public String addNewEmployee(Model model){

        Employee employee = new Employee();
        model.addAttribute("newEmployee",employee);

        return "addEmployee";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("newEmployee") Employee employee){

        employeeService.saveEmployee(employee);

        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam("empId") int id, Model model){

        model.addAttribute("newEmployee", employeeService.getEmployeeById(id));

        return "addEmployee";
    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("empId") int id){

        employeeService.deleteEmployee(id);

        return "redirect:/";
    }
}

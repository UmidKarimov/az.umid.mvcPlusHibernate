package umid.spring.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import umid.spring.hibernate.dao.EmployeeDAO;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping("/")
    public String getAllEmployee(Model model){

        model.addAttribute("all_emp", employeeDAO.getAllEmployees());

        return "all-employee";
    }
}

package umid.spring.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.service.internal.SessionFactoryServiceRegistryFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import umid.spring.hibernate.entity.Employee;


import java.util.List;

@Repository
@Component
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {

        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Employee", Employee.class);
        List<Employee> list = query.getResultList();
        return list;
    }
}
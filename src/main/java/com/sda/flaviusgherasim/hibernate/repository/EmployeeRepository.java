package com.sda.flaviusgherasim.hibernate.repository;

import com.sda.flaviusgherasim.hibernate.model.Department;
import com.sda.flaviusgherasim.hibernate.model.Employee;
import com.sda.flaviusgherasim.hibernate.model.Project;
import com.sda.flaviusgherasim.hibernate.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeRepository {


    public Employee findById(Integer id)
    {
        Session session = SessionManager.getSessionFactory().openSession();

        //The find method returns the object with the provided id
        Employee employee = session.find(Employee.class, id);

        session.close();

        return employee;
    }

    public void save(Employee employee)

    {
        Session session= SessionManager.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();

        session.save(employee);
        transaction.commit();
        session.close();
    }

    public void delete(Employee employee)
    {
        Session session= SessionManager.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        session.delete(employee);
        transaction.commit();
        session.close();
    }

    public void update(Employee employee)
    {
        Session session= SessionManager.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        session.update(employee);
        transaction.commit();
        session.close();
    }
}

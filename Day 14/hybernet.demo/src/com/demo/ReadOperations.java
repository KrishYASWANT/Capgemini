package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class CrudOperation1 {

	private static SessionFactory sessionFactory = null;
	Transaction transcation = null;
	Integer empployeeid = null;

	// business logic part for insert
	public Integer addEmployee(String firstname, String lastname, String salary) {
		// intilize the session
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();

		// begin transcation

		transcation = session.beginTransaction();
		Employee employee = new Employee(firstname, lastname, salary);
		empployeeid = (Integer) session.save(employee);// this save() will form "insert into table " query
														// automaticall// in db"
		transcation.commit();
		return empployeeid;

	}

	// read the list of employees from table // business logic part for insert
	public void readEmployee() {
		// intilize the session
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();

		// begin transcation
		transcation = session.beginTransaction();

		Query query = session.createQuery("FROM Employee");

		List<Employee> employeelist = query.list();

		for (Employee newlist : employeelist) {

			System.out.println("first name is" + newlist.getFirstname());
			System.out.println("last name is" + newlist.getLastname());
			System.out.println("sal" + newlist.getLastname());

		}

	}
	public void UpdateEmployee() {
		// intilize the session
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();

		// begin transcation
		transcation = session.beginTransaction();

		Query query = session.createQuery(" FROM Employee");
		

		List<Employee> employeelist = query.list();

		for (Employee newlist : employeelist) {

			System.out.println("first name is" + newlist.getFirstname());
			//System.out.println("last name is" + newlist.getLastname());
			//System.out.println("sal" + newlist.getLastname());

		}

	}
}

public class ReadOperations {

	public static void main(String[] args) {

		CrudOperation1 crudOperation1 = new CrudOperation1();

		crudOperation1.readEmployee();
		crudOperation1.UpdateEmployee();

		// update method is ur assignment
		// delete method is ur assignment

		System.out.println("Done....");

	}

}

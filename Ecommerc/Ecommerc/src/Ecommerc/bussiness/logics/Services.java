package Ecommerc.bussiness.logics;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.demo.Product;

public class Services {
	private static SessionFactory sessionFactory = null;
	Transaction transaction = null;
	Session sessiong = null;

	public void addProduct(Product product)
	{
		// initialize the session
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		// begin transaction
		transaction = session.beginTransaction();
		session.save(product);// this save() will form "insert into table " query // automatically// in DB"
		transaction.commit();

	}
	public void getdetailsall()
	{
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		// begin transcation
		transaction = session.beginTransaction();
		Query query = session.createQuery("FROM Product");
		List<Product> employeelist = query.list();
		for (Product newlist : employeelist) {
			System.out.println("Laptop name is" + newlist.getLaptopName());
			System.out.println("colour  is" + newlist.getColor());
			System.out.println("size" + newlist.getsize());
			System.out.println("");
		}
	}
	public Product getdetails(long id )
	{
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		// begin transcation
		transaction = session.beginTransaction();
		Query query = session.createQuery("FROM Product");
		Product product = (Product) session.get(Product.class, id);
		
		product.getColor();
		product.getLaptopName();
		product.getsize();
		product.getModel();
		product.getWeight();
		
		
		
		return product;
		
	}

	public Product updateEmployeById(Product prod, long id) {
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		// begin transaction
		transaction = session.beginTransaction();

		Product product = (Product) session.get(Product.class, id);

		product.setLaptopName(prod.getLaptopName()); // values are coming from client that isMainClas
		product.setColor(prod.getColor());
		product.setWeight(prod.getWeight());
		product.setModel(prod.getModel());
		product.setsize(prod.getsize());
		session.update(product);
		transaction.commit();
		return product;

	}

	public List<Product> getProductDetails( ) {
		// Initialize the session
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();

		// begin transaction
		transaction = session.beginTransaction();

		Query query = session.createQuery("FROM Product");

		List<Product> productList = query.list();

		return productList;

	}
	public String deletall()
	{
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();

		// begin transaction
		transaction = session.beginTransaction();
		Query query = session.createQuery("DELETE FROM Product");
		Integer result = query.executeUpdate();
		
		if ( result >0)
		{
			return "sucessfully deleted all records";
		}
		else
			return "No records found";
	}
	public void deletedetailsByID(long id)
	{
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();

		// begin transaction
		transaction = session.beginTransaction();
		
		Product product = (Product) session.get(Product.class, id);
		Query query = session.createQuery("Delete FROM Product where id ="+id);
		Integer result = query.executeUpdate();
		transaction.commit();
		System.out.println("deleted the required id");
	}

}
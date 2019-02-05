package com.component.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		User user1 = new User(0, "John Doe", "johndoe", "John123", "john@gmail.com",new Account());
		Account account1 = new Account(0, "johnny_doe", "IN",new User());
		user1.setAccount(account1);
		account1.setUser(user1);
		
		User user2 = new User(0, "Jane Doe", "janedoe", "Jane123", "jane@gmail.com",new Account());
		Account account2 = new Account(0, "janie_doe", "US",new User());
		user2.setAccount(account2);
		account2.setUser(user2);

		session.persist(user1);
		session.persist(user2);		

		transaction.commit();
		session.close();
		System.out.println("Saved");

	}
}

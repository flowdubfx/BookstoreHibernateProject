package com.hibernate.project.app;

import org.hibernate.Session;

import com.hibernate.project.sessionfactory.HibernateUtil;

public class App {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		session.close();

	}

}

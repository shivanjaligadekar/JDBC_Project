package it.education.dao;

import java.util.Collection;

import it.education.entity.Course;
//This interface provide a basic template for the DAO pattern
//Its implementation class decides the actual entity type and the ID type
public interface DaoInterface<T, K> {
	Collection<T> retrievAll();
	T retriveOne(K id);
	void create(T t);
	void delete(K id);
	void update(T t);
	
	
}
//customer ID:int --> Integer --->CustomerDao<Customer,Integer>
//Passport ID:String -->PassportDao<passport, string>

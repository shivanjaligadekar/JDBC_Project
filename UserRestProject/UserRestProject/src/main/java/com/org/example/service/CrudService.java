package com.org.example.service;

import java.util.List;

import com.org.example.entity.User;

public interface CrudService<T,K> {
	//add user
	 T create(T t);
	 
	 //getall user
	 List<T> fetchAll();
	 
	 //get user
	 T fetchById(K k);
	 
	 //update user
	 T update(T t1, T t2);
	 
	 //delete user
	 String delete(T t);
}

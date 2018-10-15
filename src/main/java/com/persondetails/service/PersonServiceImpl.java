package com.persondetails.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.persondetails.dao.PersonDao;
import com.persondetails.model.Person;

public class PersonServiceImpl implements PersonService {
	
	private PersonDao personDao;

	public void setPersonDAO(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	@Transactional
	public void addPerson(Person p) {
		this.personDao.addPerson(p);
		
	}

	@Override
	@Transactional
	public void updatePerson(Person p) {
		this.personDao.updatePerson(p);
	}

	@Override
	@Transactional
	public List<Person> listPersons() {
	
		return this.personDao.listPersons();
	}

	@Override
	@Transactional
	public Person getPersonById(int id) {
		return this.personDao.getPersonById(id);
	}

	@Override
	@Transactional
	public void removePerson(int id) {
		this.personDao.removePerson(id);
		
	}

}

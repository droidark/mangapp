package net.virux.mangapp.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.virux.mangapp.dao.GenericDao;
import net.virux.mangapp.model.Title;

@Repository("titleDao")
public class TitleDaoImpl implements GenericDao<Title, Integer>{
	
	@Autowired
	SessionFactory sessionFactory;
	
	private Session session;
	private Transaction tx;

	@Override
	public void add(Title entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveOrUpdate(Title entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Title entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Title entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Title get(Integer key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Title> getAll() {
		this.session = sessionFactory.openSession();
		this.tx = this.session.beginTransaction();
		Criteria cr = session.createCriteria(Title.class);
		List<Title> titles = cr.list();
		this.tx.commit();
		this.session.close();
		return titles;
	}
}

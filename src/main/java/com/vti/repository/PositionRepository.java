package com.vti.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.vti.entity.Position;
import com.vti.utils.HibernateUtils;

@Repository
public class PositionRepository implements IPositionRepository {

	private HibernateUtils hibernateUtils;

	public PositionRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Position> getAllPositions() {
		Session session = null;

		try {
			session = hibernateUtils.openSession();

			Query<Position> query = session.createQuery("FROM Position");
			return query.list();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}

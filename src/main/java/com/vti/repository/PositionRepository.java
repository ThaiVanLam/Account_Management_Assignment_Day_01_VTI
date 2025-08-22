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

	@Override
	public Position getPositionById(int id) {
		Session session = null;

		try {
			session = hibernateUtils.openSession();

			Position position = session.get(Position.class, id);
			return position;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public void createPosition(Position position) {
		Session session = null;

		try {
			session = hibernateUtils.openSession();

			session.beginTransaction();

			session.save(position);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public void updatePosition(Position position) {
		Session session = null;

		try {
			session = hibernateUtils.openSession();

			session.beginTransaction();

			session.update(position);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public void deletePosition(int id) {
		Session session = null;

		try {
			session = hibernateUtils.openSession();

			session.beginTransaction();

			Position position = session.load(Position.class, id);

			session.delete(position);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}

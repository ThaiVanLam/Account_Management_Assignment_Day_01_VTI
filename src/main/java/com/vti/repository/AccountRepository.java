package com.vti.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.vti.entity.Account;
import com.vti.utils.HibernateUtils;

@Repository
public class AccountRepository implements IAccountRepository {

	private HibernateUtils hibernateUtils;

	public AccountRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Account> getAllAccounts() {
		Session session = null;

		try {
			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Account> query = session.createQuery("FROM Account");
			return query.list();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public Account getAccountById(int id) {
		Session session = null;

		try {
			session = hibernateUtils.openSession();

			Account account = session.get(Account.class, id);
			return account;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public void createAccount(Account account) {
		Session session = null;

		try {
			session = hibernateUtils.openSession();
			session.beginTransaction();

			session.save(account);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public void updateAccount(Account account) {
		Session session = null;

		try {
			session = hibernateUtils.openSession();
			session.beginTransaction();

			session.update(account);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public void deleteAccount(int id) {
		Session session = null;

		try {
			session = hibernateUtils.openSession();
			session.beginTransaction();

			Account account = session.load(Account.class, id);

			session.delete(account);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}

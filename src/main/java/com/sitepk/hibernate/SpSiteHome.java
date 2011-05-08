package com.sitepk.hibernate;

// Generated 2010-12-23 3:02:46 by Hibernate Tools 3.3.0.GA

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 * Home object for domain model class SpSite.
 * 
 * @see com.sitepk.hibernate.SpSite
 * @author Hibernate Tools
 */
@Component
public class SpSiteHome {

	private static final Log log = LogFactory.getLog(SpSiteHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SpSite transientInstance) {
		log.debug("persisting SpSite instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SpSite persistentInstance) {
		log.debug("removing SpSite instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SpSite merge(SpSite detachedInstance) {
		log.debug("merging SpSite instance");
		try {
			SpSite result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SpSite findById(String id) {
		log.debug("getting SpSite instance with id: " + id);
		try {
			SpSite instance = entityManager.find(SpSite.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<SpSite> executeQuery(String sql, Object[] params) {
		log.debug("getting SpSite instance with query: " + sql);
		Query q = entityManager.createQuery(sql);
		for (int i = 0; i < params.length; i++) {
			q.setParameter(i + 1, params[i]);
		}
		try {
			List<SpSite> instances = q.getResultList();
			log.debug("get successful");
			return instances;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

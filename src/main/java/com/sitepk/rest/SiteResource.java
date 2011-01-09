package com.sitepk.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sitepk.entity.Site;
import com.sitepk.hibernate.SpSite;

/**
 * Site 相关类
 * 1. /site/google.com 查询和gooogle相关的网站
 * @author hujiag@gmail.com
 *
 */
@Path("/site")
@Component
public class SiteResource {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Path("/{url}")
	@GET
	@Transactional
	@Produces("application/json")
	@SuppressWarnings("unchecked")
	public SpSite[] getSitesByUrl(@PathParam("url") String url) {
		final Session session = sessionFactory.getCurrentSession();
		final Criteria criteria = session.createCriteria(SpSite.class);
		return (SpSite[]) criteria.list().toArray(new SpSite[]{});
	}
}

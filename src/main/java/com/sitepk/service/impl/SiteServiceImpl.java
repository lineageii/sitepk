package com.sitepk.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sitepk.entity.Site;
import com.sitepk.hibernate.SpSite;
import com.sitepk.hibernate.SpSiteHome;
import com.sitepk.service.SiteService;

@Service("siteService")
public class SiteServiceImpl implements SiteService {
	
	@Autowired
	SpSiteHome SpSiteHome;
	
	@Override
	public List<Site> getSitesByUrl(String url) {
		List<Site> sites = new ArrayList<Site>();
		Site site = new Site();
		site.setName("雅虎");
		site.setUrl("yahoo.com");
		sites.add(site);
		
		site.setName("百度");
		site.setUrl("baidu.com");
		sites.add(site);
		return sites;
	}
	
	/**
	 * get site by id
	 * @param id
	 * @return site
	 */
	public SpSite getSitesById(String id){
		return SpSiteHome.findById(id);
	}
}
package com.sitepk.service;

import java.util.List;

import com.sitepk.entity.Site;

public interface SiteService {
	
	public List<Site> readSitesByUrl(String url);
	
	public void addSite(Site site);
}

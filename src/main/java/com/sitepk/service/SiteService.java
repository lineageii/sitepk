package com.sitepk.service;

import java.util.List;

import com.sitepk.entity.Site;

public interface SiteService {
	/**
	 * get all sites by url
	 * @param url google.com
	 * @return baidu.com,yahoo.com,bing.com.etc
	 */
	public List<Site> getSitesByUrl(String url);
	
}

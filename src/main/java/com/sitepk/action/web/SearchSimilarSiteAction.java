package com.sitepk.action.web;

import java.util.List;

import com.sitepk.hibernate.SpSite;

/**
 * search similar site action<p>
 * 1.get the tag of site by site's url from site and tag table
 * 2.get the keyword of site by site's url from site and keword table
 * 3.get similar site by tag and keyword order by rate
 * @author hujiag@gmail.com
 * 2011/05/09
 */
public class SearchSimilarSiteAction {
	
	
	
		List<SpSite> getSimilarSitesBySiteUrl(String siteUrl){
			return null;
		}
		
}

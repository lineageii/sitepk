package com.sitepk.action.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.sitepk.common.R;
import com.sitepk.hibernate.SpSite;
import com.sitepk.service.SiteService;

/**
 * search similar site action
 * <p>
 * 1.get the tag of site by site's url from site and tag table <br>
 * 2.get the keyword of site by site's url from site and keword table <br>
 * 3.get similar site by tag and keyword order by rate<br>
 * 
 * @author hujiag@gmail.com 2011/05/09
 */
public class SearchSimilarSiteAction {
	@Resource(name="siteService") 
	SiteService siteService;
	
	private String siteUrl;
	private List<SpSite> sites;

	public String getSiteUrl() {
		return siteUrl;
	}

	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}

	public List<SpSite> getSites() {
		return sites;
	}

	public void setSites(List<SpSite> sites) {
		this.sites = sites;
	}

	public String execute() throws Exception {
		sites = siteService.getSimilarSitesBySiteUrl(siteUrl);
		return R.SUCCESS;
	}

}

package com.sitepk.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sitepk.entity.Site;

/**
 * Site 相关类
 * 1. /site/google.com 查询和gooogle相关的网站
 * @author hujiag@gmail.com
 *
 */
@Path("/site")
public class SiteAction {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Site> readSitesByUrl(String url) {
		
		return null;
	}
}

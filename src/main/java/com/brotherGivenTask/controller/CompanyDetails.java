package com.brotherGivenTask.controller;

import java.util.List;

public class CompanyDetails {
	
	private List<Employee> userInfo;
	private String siteAddress;
	public List<Employee> getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(List<Employee> userInfo) {
		this.userInfo = userInfo;
	}
	public String getSiteAddress() {
		return siteAddress;
	}
	public void setSiteAddress(String siteAddress) {
		this.siteAddress = siteAddress;
	}

}

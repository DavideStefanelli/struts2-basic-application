package com.sys.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/default")
@ResultPath(value = "/")
@Results({
	@Result(name="success", location = "/success.jsp")
})

public class MyBasicAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Actions({ @Action("/test") })
	@Override
	public String execute() throws Exception {
		
		return "success";
	}
	
}

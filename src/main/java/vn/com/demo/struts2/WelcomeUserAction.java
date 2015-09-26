package vn.com.demo.struts2;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class WelcomeUserAction extends ActionSupport {
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String execute() {
		return "SUCCESS";
	}
}

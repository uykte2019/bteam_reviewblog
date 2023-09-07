package com.teamb.blog.model;

public class APIResponse {
	private String attribute;
	private String message;
	private boolean checked;
	
	public APIResponse(String attribute, String message, boolean checked) {
		this.attribute = attribute;
		this.message = message;
		this.checked = checked;
	}
	
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	} 
}

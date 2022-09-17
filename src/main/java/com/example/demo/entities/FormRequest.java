package com.example.demo.entities;

import org.springframework.stereotype.Component;

@Component
public class FormRequest {

	
	public String formName;

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public FormRequest(String formName) {
		super();
		this.formName = formName;
	}

	public FormRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

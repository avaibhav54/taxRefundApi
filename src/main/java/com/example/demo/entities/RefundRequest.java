package com.example.demo.entities;




import org.springframework.stereotype.Component;
@Component
public class RefundRequest {
	
	public RefundRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FormRequest header;
	public String entityNum;
	@Override
	public String toString() {
		return "RefundRequest [header=" + header + ", entityNum=" + entityNum + ", assmentYear=" + assmentYear + "]";
	}
	public int assmentYear;
	public FormRequest getHeadeRequest() {
		return header;
	}
	public void setHeadeRequest(FormRequest headeRequest) {
		this.header = headeRequest;
	}
	public String getEntityNum() {
		return entityNum;
	}
	public void setEntityNum(String entityNum) {
		this.entityNum = entityNum;
	}
	public int getAssmentYear() {
		return assmentYear;
	}
	public void setAssmentYear(int assmentYear) {
		this.assmentYear = assmentYear;
	}
	public RefundRequest(FormRequest headeRequest, String entityNum, int assmentYear) {
		super();
		this.header = headeRequest;
		this.entityNum = entityNum;
		this.assmentYear = assmentYear;
	}
	

}

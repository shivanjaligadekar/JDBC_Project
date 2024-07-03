package com.org.example.dto;

import java.time.LocalDate;



public class ErrorResponse {
	private String msg;
	private String errDetails;
	private LocalDate timeStamp;
	
	public ErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ErrorResponse(String msg, String errDetails) {
		super();
		this.msg = msg;
		this.errDetails = errDetails;
		this.timeStamp = LocalDate.now();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getErrDetails() {
		return errDetails;
	}

	public void setErrDetails(String errDetails) {
		this.errDetails = errDetails;
	}

	public LocalDate getTimeStamp() {
		return LocalDate.now();
	}

	public void setTimeStamp(LocalDate timeStamp) {
		this.timeStamp = LocalDate.now();
	}

	@Override
	public String toString() {
		return "ErrorResponse [msg=" + msg + ", errDetails=" + errDetails + ", timeStamp=" + timeStamp + "]";
	}
	
	
	
	

}

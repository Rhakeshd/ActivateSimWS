package com.voda.oag.dao;

public class Sim {
	String sim_id ;
	int Customer_Id;
	String Msisdn_Num;
	String Sim_Num;
	String Status;
	String TMcode;
	String Reason;
	
	
	public String getsim_id() {
		return sim_id;
	}
	public void setsim_id(String sim_Id) {
		sim_id = sim_Id;
	}
	public int getCustomer_Id() {
		return Customer_Id;
	}
	public void setCustomer_Id(int customer_Id) {
		Customer_Id = customer_Id;
	}
	public String getMsisdn_Num() {
		return Msisdn_Num;
	}
	public void setMsisdn_Num(String msisdn_Num) {
		Msisdn_Num = msisdn_Num;
	}
	public String getSim_Num() {
		return Sim_Num;
	}
	public void setSim_Num(String sim_Num) {
		Sim_Num = sim_Num;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getTMcode() {
		return TMcode;
	}
	public void setTMcode(String tMcode) {
		TMcode = tMcode;
	}
	public String getReason() {
		return Reason;
	}
	public void setReason(String reason) {
		Reason = reason;
	}
	

}

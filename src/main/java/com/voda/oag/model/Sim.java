package com.voda.oag.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="SIM")
public class Sim {

	@Id
	String sim_id ;
	@Field("Customer_Id")
	int Customer_Id;
	@Field("Msisdn_Num")
	String Msisdn_Num;
	@Field("Sim_Num")
	String Sim_Num;
	@Field("Status")
	String Status;
	
	@Field("TMcode")
	String TMcode;
	@Field("Reason")
	String Reason;
	public String getSim_id() {
		return sim_id;
	}
	public void setSim_id(String sim_id) {
		this.sim_id = sim_id;
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

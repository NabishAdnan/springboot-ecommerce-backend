package com.backend.e_commerce.DTO;

import org.springframework.web.multipart.MultipartFile;

public class CommercialSellerResponseDTO {
	
	private String custId;
	private String businessName;
	private String ownerName;
	private String email;
	private String phone;
	private String gumastaNumber;
	private String gumasFile;
	private String panNumber;
	private String panFile;
	private String businessType;
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGumastaNumber() {
		return gumastaNumber;
	}
	public void setGumastaNumber(String gumastaNumber) {
		this.gumastaNumber = gumastaNumber;
	}
	public String getGumasFile() {
		return gumasFile;
	}
	public void setGumasFile(String gumasFile) {
		this.gumasFile = gumasFile;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getPanFile() {
		return panFile;
	}
	public void setPanFile(String panFile) {
		this.panFile = panFile;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	
	
}

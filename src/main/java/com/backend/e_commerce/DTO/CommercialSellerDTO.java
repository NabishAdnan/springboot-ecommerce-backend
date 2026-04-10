package com.backend.e_commerce.DTO;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.multipart.MultipartFile;

public class CommercialSellerDTO {
	private long id;
	private String custId;
	private String businessName;
	private String ownerName;
	private String email;
	private String phone;
	private String gumastaNumber;
	private MultipartFile gumasFile;
	private String panNumber;
	private MultipartFile panFile;
	private String businessType;
	private boolean isActive;
	 private List<AddressDTO> addresses;
	
	public List<AddressDTO> getAddresses() {
		return addresses;
	}
	 public void setAddresses(List<AddressDTO> addresses) {
		 this.addresses = addresses;
	 }
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public MultipartFile getGumasFile() {
		return gumasFile;
	}
	public void setGumasFile(MultipartFile gumasFile) {
		this.gumasFile = gumasFile;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public MultipartFile getPanFile() {
		return panFile;
	}
	public void setPanFile(MultipartFile panFile) {
		this.panFile = panFile;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	
}

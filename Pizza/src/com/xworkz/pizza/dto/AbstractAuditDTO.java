package com.xworkz.pizza.dto;

import java.time.LocalDateTime;

public abstract class AbstractAuditDTO {

	private String createdBy;
	private LocalDateTime creaatedDate;
	private String updatedBy;
	private LocalDateTime updatedDate;
	
	public AbstractAuditDTO() 
	{
		System.out.println("Running Default const in AbstractAuditDTO");
	}

	@Override
	public String toString() {
		return "AbstractAuditDTO [createdBy=" + createdBy + ", creaatedDate=" + creaatedDate + ", updatedBy="
				+ updatedBy + ", updatedDate=" + updatedDate + "]";
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreaatedDate() {
		return creaatedDate;
	}

	public void setCreaatedDate(LocalDateTime creaatedDate) {
		this.creaatedDate = creaatedDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	
}

package com.mycartservices.model;
import java.sql.Timestamp; 
import java.util.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.ValueGenerationType;

@Entity
@Table(name = "product_view")
public class ProductView {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String name;
	
	@Column
	private float price;
	
	@Column
	private String description;
		
	@Column
	private float discount;

	@Column
	private int categoryId;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date expDate;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date mfdDate;
	
	@Column
	private String brand;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdTs;

	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedTs;
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public Date getMfdDate() {
		return mfdDate;
	}

	public void setMfdDate(Date mfdDate) {
		this.mfdDate = mfdDate;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public ProductView() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getCreatedTs() {
		return createdTs;
	}

	public void setCreatedTs(Date createdTs) {
		this.createdTs = createdTs;
	}

	public Date getModifiedTs() {
		return modifiedTs;
	}

	public void setModifiedTs(Date modifiedTs) {
		this.modifiedTs = modifiedTs;
	}

	public ProductView(String name, float price, String description, float discount, int categoryId, Date expDate,
			Date mfdDate, String brand, Date startDate, Date endDate, Date createdTs, Date modifiedTs) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.discount = discount;
		this.categoryId = categoryId;
		this.expDate = expDate;
		this.mfdDate = mfdDate;
		this.brand = brand;
		this.startDate = startDate;
		this.endDate = endDate;
		this.createdTs = createdTs;
		this.modifiedTs = modifiedTs;
	}

		
		
}
package com.mycartservices.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long uid;
	
	@Column(unique = true)
	private String userName;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private int roleId;
	
	@Column
	private int managerId;
	
	@Column
	private int storeId;
	
	@Column
	private int addrId;
	
	@Column 
	private String isActive;
	
	@Column
	private int modifiedById;
	
	
	@Column
	private String aEmail;

	@Column
	private String phone1;
	
	@Column
	private String phone2;
	
	@Column 
	private String tag;
	
	@Column
	private String pwd;
	@Column
	private String email;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdTs;

	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedTs;

	// public getters and setters
	public long getUid() {
		return uid;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}
	
	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public int getModifiedById() {
		return modifiedById;
	}

	public void setModifiedById(int modifiedById) {
		this.modifiedById = modifiedById;
	}

	public String getaEmail() {
		return aEmail;
	}

	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String firstName, String lastName, int roleId, int managerId, int storeId, int addrId,
			String isActive, int modifiedById, String aEmail, String phone1, String phone2, String tag, String pwd,
			String email, Date createdTs, Date modifiedTs) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.roleId = roleId;
		this.managerId = managerId;
		this.storeId = storeId;
		this.addrId = addrId;
		this.isActive = isActive;
		this.modifiedById = modifiedById;
		this.aEmail = aEmail;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.tag = tag;
		this.pwd = pwd;
		this.email = email;
		this.createdTs = createdTs;
		this.modifiedTs = modifiedTs;
	}
	
	


}

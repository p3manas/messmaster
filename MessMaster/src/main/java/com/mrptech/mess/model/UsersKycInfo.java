package com.mrptech.mess.model;

// Generated Feb 15, 2015 10:58:50 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UsersKycInfo generated by hbm2java
 */
@Entity
@Table(name = "USERS_KYC_INFO")
public class UsersKycInfo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsersKycInfoId id;
	private Users users;
	private String kycDocType;
	private BigDecimal kycDocId;
	private String docTypeDesc;
	private Date createdOn;
	private String createdBy;
	private Date modifiedOn;
	private String modifiedBy;

	public UsersKycInfo() {
	}

	public UsersKycInfo(UsersKycInfoId id, Users users) {
		this.id = id;
		this.users = users;
	}

	public UsersKycInfo(UsersKycInfoId id, Users users, String kycDocType,
			BigDecimal kycDocId, String docTypeDesc, Date createdOn,
			String createdBy, Date modifiedOn, String modifiedBy) {
		this.id = id;
		this.users = users;
		this.kycDocType = kycDocType;
		this.kycDocId = kycDocId;
		this.docTypeDesc = docTypeDesc;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.modifiedOn = modifiedOn;
		this.modifiedBy = modifiedBy;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "kycId", column = @Column(name = "KYC_ID", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "accountId", column = @Column(name = "ACCOUNT_ID", nullable = false, precision = 22, scale = 0)) })
	public UsersKycInfoId getId() {
		return this.id;
	}

	public void setId(UsersKycInfoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ACCOUNT_ID", nullable = false, insertable = false, updatable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "KYC_DOC_TYPE", length = 30)
	public String getKycDocType() {
		return this.kycDocType;
	}

	public void setKycDocType(String kycDocType) {
		this.kycDocType = kycDocType;
	}

	@Column(name = "KYC_DOC_ID", precision = 22, scale = 0)
	public BigDecimal getKycDocId() {
		return this.kycDocId;
	}

	public void setKycDocId(BigDecimal kycDocId) {
		this.kycDocId = kycDocId;
	}

	@Column(name = "DOC_TYPE_DESC", length = 30)
	public String getDocTypeDesc() {
		return this.docTypeDesc;
	}

	public void setDocTypeDesc(String docTypeDesc) {
		this.docTypeDesc = docTypeDesc;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_ON", length = 7)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "CREATED_BY", length = 30)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MODIFIED_ON", length = 7)
	public Date getModifiedOn() {
		return this.modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	@Column(name = "MODIFIED_BY", length = 30)
	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

}

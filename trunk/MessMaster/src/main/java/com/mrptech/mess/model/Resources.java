package com.mrptech.mess.model;

// Generated Feb 15, 2015 10:58:50 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Resources generated by hbm2java
 */
@Entity
@Table(name = "RESOURCES")
public class Resources implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ResourcesId id;
	private String resourceDesc;
	private Date createdOn;
	private String createdBy;
	private Date modifiedOn;
	private String modifiedBy;
	private String resourceType;
	private String url;
	private String moduleCode;
	private BigDecimal sequenceNo;

	public Resources() {
	}

	public Resources(ResourcesId id, String resourceDesc, Date createdOn,
			String createdBy, BigDecimal sequenceNo) {
		this.id = id;
		this.resourceDesc = resourceDesc;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.sequenceNo = sequenceNo;
	}

	public Resources(ResourcesId id, String resourceDesc, Date createdOn,
			String createdBy, Date modifiedOn, String modifiedBy,
			String resourceType, String url, String moduleCode,
			BigDecimal sequenceNo) {
		this.id = id;
		this.resourceDesc = resourceDesc;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.modifiedOn = modifiedOn;
		this.modifiedBy = modifiedBy;
		this.resourceType = resourceType;
		this.url = url;
		this.moduleCode = moduleCode;
		this.sequenceNo = sequenceNo;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "resourceId", column = @Column(name = "RESOURCE_ID", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "locale", column = @Column(name = "LOCALE", nullable = false, length = 8)) })
	public ResourcesId getId() {
		return this.id;
	}

	public void setId(ResourcesId id) {
		this.id = id;
	}

	@Column(name = "RESOURCE_DESC", nullable = false, length = 50)
	public String getResourceDesc() {
		return this.resourceDesc;
	}

	public void setResourceDesc(String resourceDesc) {
		this.resourceDesc = resourceDesc;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_ON", nullable = false, length = 7)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "CREATED_ BY", nullable = false, length = 30)
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

	@Column(name = "RESOURCE_TYPE", length = 30)
	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	@Column(name = "URL", length = 100)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "MODULE_CODE", length = 30)
	public String getModuleCode() {
		return this.moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	@Column(name = "SEQUENCE_NO", nullable = false, precision = 22, scale = 0)
	public BigDecimal getSequenceNo() {
		return this.sequenceNo;
	}

	public void setSequenceNo(BigDecimal sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

}
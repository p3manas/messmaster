package com.mrptech.mess.model;

// Generated Feb 15, 2015 10:58:50 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Hierarchy generated by hbm2java
 */
@Entity
@Table(name = "HIERARCHY")
public class Hierarchy implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nodeCode;
	private String description;
	private String nodeType;
	private String parentNode;
	private Date effectiveDate;
	private Date expirationDate;
	private String status;
	private BigDecimal nodeLevel;
	private Date createdOn;
	private String createdBy;
	private Date modifiedOn;
	private String modifiedBy;
	private Set<RolesHierarchy> rolesHierarchies = new HashSet<RolesHierarchy>(0);

	public Hierarchy() {
	}

	public Hierarchy(String nodeCode) {
		this.nodeCode = nodeCode;
	}


	@Id
	@Column(name = "NODE_CODE", unique = true, nullable = false, length = 30)
	public String getNodeCode() {
		return this.nodeCode;
	}

	public void setNodeCode(String nodeCode) {
		this.nodeCode = nodeCode;
	}

	@Column(name = "DESCRIPTION", length = 30)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "NODE_TYPE", length = 30)
	public String getNodeType() {
		return this.nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	@Column(name = "PARENT_NODE", length = 30)
	public String getParentNode() {
		return this.parentNode;
	}

	public void setParentNode(String parentNode) {
		this.parentNode = parentNode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EFFECTIVE_DATE", length = 7)
	public Date getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPIRATION_DATE", length = 7)
	public Date getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Column(name = "STATUS", length = 30)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "NODE_LEVEL", precision = 22, scale = 0)
	public BigDecimal getNodeLevel() {
		return this.nodeLevel;
	}

	public void setNodeLevel(BigDecimal nodeLevel) {
		this.nodeLevel = nodeLevel;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hierarchy")
	public Set<RolesHierarchy> getRolesHierarchies() {
		return this.rolesHierarchies;
	}

	public void setRolesHierarchies(Set<RolesHierarchy> rolesHierarchies) {
		this.rolesHierarchies = rolesHierarchies;
	}

}
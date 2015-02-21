package com.mrptech.mess.model;

// Generated Feb 15, 2015 10:58:50 PM by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Roles generated by hbm2java
 */
@Entity
@Table(name = "ROLES")
public class Roles implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RolesId id;
	private Product product;
	private String roleDesc;
	private Date createdOn;
	private String createdBy;
	private Date modifiedOn;
	private String modifiedBy;
	private String status;
	private Set<RolesGroupRoles> rolesGroupRoleses = new HashSet<RolesGroupRoles>(0);
	private Set<RolesResources> rolesResourceses = new HashSet<RolesResources>(0);
	private Set<RolesHierarchy> rolesHierarchies = new HashSet<RolesHierarchy>(0);

	public Roles() {
	}

	public Roles(RolesId id, Product product) {
		this.id = id;
		this.product = product;
	}

	

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "roleCode", column = @Column(name = "ROLE_CODE", nullable = false, length = 30)),
			@AttributeOverride(name = "productCode", column = @Column(name = "PRODUCT_CODE", nullable = false, length = 10)) })
	public RolesId getId() {
		return this.id;
	}

	public void setId(RolesId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRODUCT_CODE", nullable = false, insertable = false, updatable = false)
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Column(name = "ROLE_DESC", length = 50)
	public String getRoleDesc() {
		return this.roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
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

	@Column(name = "STATUS", length = 10)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "roles")
	public Set<RolesGroupRoles> getRolesGroupRoleses() {
		return this.rolesGroupRoleses;
	}

	public void setRolesGroupRoleses(Set<RolesGroupRoles> rolesGroupRoleses) {
		this.rolesGroupRoleses = rolesGroupRoleses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "roles")
	public Set<RolesResources> getRolesResourceses() {
		return this.rolesResourceses;
	}

	public void setRolesResourceses(Set<RolesResources> rolesResourceses) {
		this.rolesResourceses = rolesResourceses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "roles")
	public Set<RolesHierarchy> getRolesHierarchies() {
		return this.rolesHierarchies;
	}

	public void setRolesHierarchies(Set<RolesHierarchy> rolesHierarchies) {
		this.rolesHierarchies = rolesHierarchies;
	}

}

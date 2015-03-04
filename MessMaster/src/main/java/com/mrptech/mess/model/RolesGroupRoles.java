package com.mrptech.mess.model;

// Generated Feb 15, 2015 10:58:50 PM by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * RolesGroupRoles generated by hbm2java
 */
@Entity
@Table(name = "ROLES_GROUP_ROLES")
public class RolesGroupRoles implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RolesGroupRolesId id;
	private GroupRoles groupRoles;
	private Roles roles;

	public RolesGroupRoles() {
	}

	public RolesGroupRoles(RolesGroupRolesId id, GroupRoles groupRoles,
			Roles roles) {
		this.id = id;
		this.groupRoles = groupRoles;
		this.roles = roles;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "roleCode", column = @Column(name = "ROLE_CODE", nullable = false, length = 30)),
			@AttributeOverride(name = "groupRoleCode", column = @Column(name = "GROUP_ROLE_CODE", nullable = false, length = 30)),
			@AttributeOverride(name = "productCode", column = @Column(name = "PRODUCT_CODE", nullable = false, length = 10)) })
	public RolesGroupRolesId getId() {
		return this.id;
	}

	public void setId(RolesGroupRolesId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GROUP_ROLE_CODE", nullable = false, insertable = false, updatable = false)
	public GroupRoles getGroupRoles() {
		return this.groupRoles;
	}

	public void setGroupRoles(GroupRoles groupRoles) {
		this.groupRoles = groupRoles;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "ROLE_CODE", referencedColumnName = "ROLE_CODE", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "PRODUCT_CODE", referencedColumnName = "PRODUCT_CODE", nullable = false, insertable = false, updatable = false) })
	public Roles getRoles() {
		return this.roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

}
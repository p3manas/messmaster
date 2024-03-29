package com.mrptech.mess.model;

// Generated Feb 15, 2015 10:58:50 PM by Hibernate Tools 4.0.0

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
 * GroupRoles generated by hbm2java
 */
@Entity
@Table(name = "GROUP_ROLES")
public class GroupRoles implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String groupRoleCode;
	private String description;
	private Date createdOn;
	private String createdBy;
	private Date modifiedOn;
	private String modifiedBy;
	private Set<UsersGroupRoles> usersGroupRoleses = new HashSet<UsersGroupRoles>(0);
	private Set<RolesGroupRoles> rolesGroupRoleses = new HashSet<RolesGroupRoles>(0);

	public GroupRoles() {
	}

	public GroupRoles(String groupRoleCode) {
		this.groupRoleCode = groupRoleCode;
	}


	@Id
	@Column(name = "GROUP_ROLE_CODE", unique = true, nullable = false, length = 30)
	public String getGroupRoleCode() {
		return this.groupRoleCode;
	}

	public void setGroupRoleCode(String groupRoleCode) {
		this.groupRoleCode = groupRoleCode;
	}

	@Column(name = "DESCRIPTION", length = 50)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "groupRoles")
	public Set<UsersGroupRoles> getUsersGroupRoleses() {
		return this.usersGroupRoleses;
	}

	public void setUsersGroupRoleses(Set<UsersGroupRoles> usersGroupRoleses) {
		this.usersGroupRoleses = usersGroupRoleses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "groupRoles")
	public Set<RolesGroupRoles> getRolesGroupRoleses() {
		return this.rolesGroupRoleses;
	}

	public void setRolesGroupRoleses(Set<RolesGroupRoles> rolesGroupRoleses) {
		this.rolesGroupRoleses = rolesGroupRoleses;
	}

}

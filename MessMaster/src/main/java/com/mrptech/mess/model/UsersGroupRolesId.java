package com.mrptech.mess.model;

// Generated Feb 15, 2015 10:58:50 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UsersGroupRolesId generated by hbm2java
 */
@Embeddable
public class UsersGroupRolesId implements java.io.Serializable {

	private BigDecimal accountId;
	private String groupRoleCode;

	public UsersGroupRolesId() {
	}

	public UsersGroupRolesId(BigDecimal accountId, String groupRoleCode) {
		this.accountId = accountId;
		this.groupRoleCode = groupRoleCode;
	}

	@Column(name = "ACCOUNT_ID", nullable = false, precision = 22, scale = 0)
	public BigDecimal getAccountId() {
		return this.accountId;
	}

	public void setAccountId(BigDecimal accountId) {
		this.accountId = accountId;
	}

	@Column(name = "GROUP_ROLE_CODE", nullable = false, length = 30)
	public String getGroupRoleCode() {
		return this.groupRoleCode;
	}

	public void setGroupRoleCode(String groupRoleCode) {
		this.groupRoleCode = groupRoleCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UsersGroupRolesId))
			return false;
		UsersGroupRolesId castOther = (UsersGroupRolesId) other;

		return ((this.getAccountId() == castOther.getAccountId()) || (this
				.getAccountId() != null && castOther.getAccountId() != null && this
				.getAccountId().equals(castOther.getAccountId())))
				&& ((this.getGroupRoleCode() == castOther.getGroupRoleCode()) || (this
						.getGroupRoleCode() != null
						&& castOther.getGroupRoleCode() != null && this
						.getGroupRoleCode()
						.equals(castOther.getGroupRoleCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAccountId() == null ? 0 : this.getAccountId().hashCode());
		result = 37
				* result
				+ (getGroupRoleCode() == null ? 0 : this.getGroupRoleCode()
						.hashCode());
		return result;
	}

}

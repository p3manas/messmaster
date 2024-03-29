package com.mrptech.mess.model;

// Generated Feb 15, 2015 10:58:50 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserAuditTrailId generated by hbm2java
 */
@Embeddable
public class UserAuditTrailId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal auditId;
	private BigDecimal accountId;

	public UserAuditTrailId() {
	}

	public UserAuditTrailId(BigDecimal auditId, BigDecimal accountId) {
		this.auditId = auditId;
		this.accountId = accountId;
	}

	@Column(name = "AUDIT_ID", nullable = false, precision = 22, scale = 0)
	public BigDecimal getAuditId() {
		return this.auditId;
	}

	public void setAuditId(BigDecimal auditId) {
		this.auditId = auditId;
	}

	@Column(name = "ACCOUNT_ID", nullable = false, precision = 22, scale = 0)
	public BigDecimal getAccountId() {
		return this.accountId;
	}

	public void setAccountId(BigDecimal accountId) {
		this.accountId = accountId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserAuditTrailId))
			return false;
		UserAuditTrailId castOther = (UserAuditTrailId) other;

		return ((this.getAuditId() == castOther.getAuditId()) || (this
				.getAuditId() != null && castOther.getAuditId() != null && this
				.getAuditId().equals(castOther.getAuditId())))
				&& ((this.getAccountId() == castOther.getAccountId()) || (this
						.getAccountId() != null
						&& castOther.getAccountId() != null && this
						.getAccountId().equals(castOther.getAccountId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAuditId() == null ? 0 : this.getAuditId().hashCode());
		result = 37 * result
				+ (getAccountId() == null ? 0 : this.getAccountId().hashCode());
		return result;
	}

}

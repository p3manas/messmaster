package com.mrptech.mess.model;

// Generated Feb 15, 2015 10:58:50 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ResourcesId generated by hbm2java
 */
@Embeddable
public class ResourcesId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal resourceId;
	private String locale;

	public ResourcesId() {
	}

	public ResourcesId(BigDecimal resourceId, String locale) {
		this.resourceId = resourceId;
		this.locale = locale;
	}

	@Column(name = "RESOURCE_ID", nullable = false, precision = 22, scale = 0)
	public BigDecimal getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(BigDecimal resourceId) {
		this.resourceId = resourceId;
	}

	@Column(name = "LOCALE", nullable = false, length = 8)
	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ResourcesId))
			return false;
		ResourcesId castOther = (ResourcesId) other;

		return ((this.getResourceId() == castOther.getResourceId()) || (this
				.getResourceId() != null && castOther.getResourceId() != null && this
				.getResourceId().equals(castOther.getResourceId())))
				&& ((this.getLocale() == castOther.getLocale()) || (this
						.getLocale() != null && castOther.getLocale() != null && this
						.getLocale().equals(castOther.getLocale())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getResourceId() == null ? 0 : this.getResourceId()
						.hashCode());
		result = 37 * result
				+ (getLocale() == null ? 0 : this.getLocale().hashCode());
		return result;
	}

}

package com.evry.training.bank.domain;

import java.util.Date;

public class Ev_Loan {
	private String loanId;
	private String userId;
	private String loanType;
	private boolean loanStatus;
	private Date approveDate;
	private Date creditDate;
	private float tenure;
	private double ammount;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((approveDate == null) ? 0 : approveDate.hashCode());
		result = prime * result + ((creditDate == null) ? 0 : creditDate.hashCode());
		result = prime * result + ((loanId == null) ? 0 : loanId.hashCode());
		result = prime * result + (loanStatus ? 1231 : 1237);
		result = prime * result + ((loanType == null) ? 0 : loanType.hashCode());
		result = prime * result + Float.floatToIntBits(tenure);
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ev_Loan other = (Ev_Loan) obj;
		if (approveDate == null) {
			if (other.approveDate != null)
				return false;
		} else if (!approveDate.equals(other.approveDate))
			return false;
		if (creditDate == null) {
			if (other.creditDate != null)
				return false;
		} else if (!creditDate.equals(other.creditDate))
			return false;
		if (loanId == null) {
			if (other.loanId != null)
				return false;
		} else if (!loanId.equals(other.loanId))
			return false;
		if (loanStatus != other.loanStatus)
			return false;
		if (loanType == null) {
			if (other.loanType != null)
				return false;
		} else if (!loanType.equals(other.loanType))
			return false;
		if (Float.floatToIntBits(tenure) != Float.floatToIntBits(other.tenure))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Ev_Loan [loanId=" + loanId + ", userId=" + userId + ", loanType=" + loanType + ", loanStatus="
				+ loanStatus + ", approveDate=" + approveDate + ", creditDate=" + creditDate + ", tenure=" + tenure
				+ "]";
	}
	
	public double getAmmount() {
		return ammount;
	}
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
	public String getLoanId() {
		return loanId;
	}
	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public boolean isLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(boolean loanStatus) {
		this.loanStatus = loanStatus;
	}
	public Date getApproveDate() {
		return approveDate;
	}
	public void setApproveDate(Date approveDate) {
		this.approveDate = approveDate;
	}
	public Date getCreditDate() {
		return creditDate;
	}
	public void setCreditDate(Date creditDate) {
		this.creditDate = creditDate;
	}
	public float getTenure() {
		return tenure;
	}
	public void setTenure(float tenure) {
		this.tenure = tenure;
	}
	
}

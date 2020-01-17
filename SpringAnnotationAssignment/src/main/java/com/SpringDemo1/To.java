package com.SpringDemo1;

public class To {

	private String toName;
	private String toEmail;
	
	public To() {
		// TODO Auto-generated constructor stub
	}
	public String getToName() {
		return toName;
	}
	public void setToName(String toName) {
		this.toName = toName;
	}
	public String getToEmail() {
		return toEmail;
	}
	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((toEmail == null) ? 0 : toEmail.hashCode());
		result = prime * result + ((toName == null) ? 0 : toName.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "ToSender [toName=" + toName + ", toEmail=" + toEmail + "]";
	}
	public To(String toName, String toEmail) {
		super();
		this.toName = toName;
		this.toEmail = toEmail;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		To other = (To) obj;
		if (toEmail == null) {
			if (other.toEmail != null)
				return false;
		} else if (!toEmail.equals(other.toEmail))
			return false;
		if (toName == null) {
			if (other.toName != null)
				return false;
		} else if (!toName.equals(other.toName))
			return false;
		return true;
	}
	
	
}

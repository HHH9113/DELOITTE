package com.SpringDemo1;

public class From {


	private String fromName;
	private String fromEmail;

	
	
	
	public From() {
		// TODO Auto-generated constructor stub
	}
	
	public String getFromName() {
		return fromName;
	}
	public void setFromName(String fromName) {
		this.fromName = fromName;
	}
	public String getFromEmail() {
		return fromEmail;
	}
	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fromEmail == null) ? 0 : fromEmail.hashCode());
		result = prime * result + ((fromName == null) ? 0 : fromName.hashCode());
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
		From other = (From) obj;
		if (fromEmail == null) {
			if (other.fromEmail != null)
				return false;
		} else if (!fromEmail.equals(other.fromEmail))
			return false;
		if (fromName == null) {
			if (other.fromName != null)
				return false;
		} else if (!fromName.equals(other.fromName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "From [fromName=" + fromName + ", fromEmail=" + fromEmail + "]";
	}
	public From(String fromName, String fromEmail) {
		super();
		this.fromName = fromName;
		this.fromEmail = fromEmail;
	}

	
	
	
	
}

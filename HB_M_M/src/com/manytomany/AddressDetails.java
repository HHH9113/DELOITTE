package com.manytomany;

import java.util.Set;

public class AddressDetails {

	private int addressId;
	private String cityName;
	private String stateName;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressDetails other = (AddressDetails) obj;
		if (addressId != other.addressId)
			return false;
		if (cityName == null) {
			if (other.cityName != null)
				return false;
		} else if (!cityName.equals(other.cityName))
			return false;
		if (stateName != other.stateName)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AddressDetails [addressId=" + addressId + ", cityName=" + cityName + ", stateName=" + stateName + "]";
	}
	public AddressDetails(int addressId, String cityName, String stateName) {
		super();
		this.addressId = addressId;
		this.cityName = cityName;
		this.stateName = stateName;
	}
	
}

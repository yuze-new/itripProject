package cn.ekgc.itrip.pojo.entity;


import java.io.Serializable;

/**
 * <b>酒店实体类</b>
 */
public class Hotel implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String hotelName;
	private String countryId;
	private String provinceId;
	private String cityId;
	private String address;
	private String details;
	private String facilities;
	private String hotelPolicy;
	private String hotelType;
	private String hotelLevel;
	private String isGroupPurchase;
	private String redundantCityName;
	private String redundantProvinceName;
	private String redundantCountryName;
	private String redundantHotelStore;
	private String creationDate;
	private String createdBy;
	private String modifyDate;
	private String modifiedBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getFacilities() {
		return facilities;
	}

	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}

	public String getHotelPolicy() {
		return hotelPolicy;
	}

	public void setHotelPolicy(String hotelPolicy) {
		this.hotelPolicy = hotelPolicy;
	}

	public String getHotelType() {
		return hotelType;
	}

	public void setHotelType(String hotelType) {
		this.hotelType = hotelType;
	}

	public String getHotelLevel() {
		return hotelLevel;
	}

	public void setHotelLevel(String hotelLevel) {
		this.hotelLevel = hotelLevel;
	}

	public String getIsGroupPurchase() {
		return isGroupPurchase;
	}

	public void setIsGroupPurchase(String isGroupPurchase) {
		this.isGroupPurchase = isGroupPurchase;
	}

	public String getRedundantCityName() {
		return redundantCityName;
	}

	public void setRedundantCityName(String redundantCityName) {
		this.redundantCityName = redundantCityName;
	}

	public String getRedundantProvinceName() {
		return redundantProvinceName;
	}

	public void setRedundantProvinceName(String redundantProvinceName) {
		this.redundantProvinceName = redundantProvinceName;
	}

	public String getRedundantCountryName() {
		return redundantCountryName;
	}

	public void setRedundantCountryName(String redundantCountryName) {
		this.redundantCountryName = redundantCountryName;
	}

	public String getRedundantHotelStore() {
		return redundantHotelStore;
	}

	public void setRedundantHotelStore(String redundantHotelStore) {
		this.redundantHotelStore = redundantHotelStore;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
}

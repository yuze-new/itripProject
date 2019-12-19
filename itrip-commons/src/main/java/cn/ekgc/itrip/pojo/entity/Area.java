package cn.ekgc.itrip.pojo.entity;

import org.omg.CORBA.StringHolder;

import java.io.Serializable;

public class Area implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String areaNo;
	private String parent;
	private Integer isActivated;
	private Integer isTradingArea;
	private Integer isHot;
	private Integer level;
	private Integer isChina;
	private String pinyin;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAreaNo() {
		return areaNo;
	}

	public void setAreaNo(String areaNo) {
		this.areaNo = areaNo;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public Integer getIsActivated() {
		return isActivated;
	}

	public void setIsActivated(Integer isActivated) {
		this.isActivated = isActivated;
	}

	public Integer getIsTradingArea() {
		return isTradingArea;
	}

	public void setIsTradingArea(Integer isTradingArea) {
		this.isTradingArea = isTradingArea;
	}

	public Integer getIsHot() {
		return isHot;
	}

	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getIsChina() {
		return isChina;
	}

	public void setIsChina(Integer isChina) {
		this.isChina = isChina;
	}

	public String getPinyin() {
		return pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
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

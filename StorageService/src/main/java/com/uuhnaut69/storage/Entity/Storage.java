package com.uuhnaut69.storage.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "storage_tbl")
@DynamicUpdate
@DynamicInsert
public class Storage {

	@Id
	private Long id;
	private String commodityCode;
	private Integer count;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCommodityCode() {
		return commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Storage(Long id, String commodityCode, Integer count) {
		this.id = id;
		this.commodityCode = commodityCode;
		this.count = count;
	}

	public Storage() {
	}

	@Override
	public String toString() {
		return "Storage [id=" + id + ", commodityCode=" + commodityCode + ", count=" + count + "]";
	}

}

package com.uuhnaut69.storage.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "storage_tbl")
@DynamicUpdate
@DynamicInsert
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Storage {

	@Id
	private Long id;
	private String commodityCode;
	private Integer count;

}

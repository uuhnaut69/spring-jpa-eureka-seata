package com.uuhnaut69.storage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uuhnaut69.storage.Entity.Storage;

public interface StorageDAO extends JpaRepository<Storage, String> {

	Storage findByCommodityCode(String commodityCode);

}

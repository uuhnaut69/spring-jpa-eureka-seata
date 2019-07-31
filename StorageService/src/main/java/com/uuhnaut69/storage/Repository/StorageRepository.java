package com.uuhnaut69.storage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uuhnaut69.storage.Entity.Storage;

@Repository
public interface StorageRepository extends JpaRepository<Storage, String> {

	Storage findByCommodityCode(String commodityCode);

}

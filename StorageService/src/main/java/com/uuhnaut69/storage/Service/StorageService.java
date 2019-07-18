package com.uuhnaut69.storage.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uuhnaut69.storage.Entity.Storage;
import com.uuhnaut69.storage.Repository.StorageDAO;

@Service
public class StorageService {

	@Autowired
	private StorageDAO storageDAO;

	@Transactional
	public void deduct(String commodityCode, int count) {
		Storage storage = storageDAO.findByCommodityCode(commodityCode);
		storage.setCount(storage.getCount() - count);

		storageDAO.save(storage);
	}
}

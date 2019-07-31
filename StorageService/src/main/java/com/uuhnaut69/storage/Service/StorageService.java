package com.uuhnaut69.storage.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uuhnaut69.storage.Entity.Storage;
import com.uuhnaut69.storage.Repository.StorageRepository;

@Service
public class StorageService {

	@Autowired
	private StorageRepository storageRepository;

	@Transactional
	public void deduct(String commodityCode, int count) {
		Storage storage = storageRepository.findByCommodityCode(commodityCode);
		storage.setCount(storage.getCount() - count);

		storageRepository.save(storage);
	}
}

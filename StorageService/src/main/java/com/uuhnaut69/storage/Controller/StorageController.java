package com.uuhnaut69.storage.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uuhnaut69.storage.Service.StorageService;

@RestController
public class StorageController {

	@Autowired
	private StorageService storageService;

	@GetMapping(path = "/deduct")
	public Boolean deduct(String commodityCode, Integer count) {
		storageService.deduct(commodityCode, count);
		return true;
	}
}
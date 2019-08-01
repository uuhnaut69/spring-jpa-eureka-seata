package com.uuhnaut69.account.Controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uuhnaut69.account.Service.AccountService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AccountController {

	@Autowired
	private AccountService accountService;

	@RequestMapping("/debit")
	public Boolean debit(String userId, BigDecimal money) {
		log.info("Debit account");
		accountService.debit(userId, money);

		return true;
	}
}
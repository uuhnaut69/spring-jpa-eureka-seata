package com.uuhnaut69.account.Service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uuhnaut69.account.Entity.Account;
import com.uuhnaut69.account.Repository.AccountRepository;

@Service
public class AccountService {

	private static final String ERROR_USER_ID = "1002";
	@Autowired
	private AccountRepository accountRepository;

	@Transactional(rollbackFor = Exception.class)
	public void debit(String userId, BigDecimal num) {
		Account account = accountRepository.findByUserId(userId);
		account.setMoney(account.getMoney().subtract(num));
		accountRepository.save(account);

		if (ERROR_USER_ID.equals(userId)) {
			throw new RuntimeException("account branch exception");
		}
	}
}
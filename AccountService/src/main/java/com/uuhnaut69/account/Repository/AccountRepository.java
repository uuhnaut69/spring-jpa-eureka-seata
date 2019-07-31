package com.uuhnaut69.account.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uuhnaut69.account.Entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

	Account findByUserId(String userId);

}
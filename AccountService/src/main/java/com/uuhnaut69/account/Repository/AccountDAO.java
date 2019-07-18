package com.uuhnaut69.account.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uuhnaut69.account.Entity.Account;

public interface AccountDAO extends JpaRepository<Account, Long> {

    Account findByUserId(String userId);

}
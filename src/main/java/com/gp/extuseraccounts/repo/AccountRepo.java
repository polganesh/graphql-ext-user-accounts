package com.gp.extuseraccounts.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.gp.extuseraccounts.entity.Account;


public interface AccountRepo extends JpaRepository<Account, Integer> {

	List<Account> getByPan(@Param("pan") String pan);
}

package com.gp.extuseraccounts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gp.extuseraccounts.entity.Account;
import com.gp.extuseraccounts.repo.AccountRepo;

@RestController
public class ExtAccountController {

	@Autowired
	private AccountRepo accountRepo;
	
	public ExtAccountController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(value = "/get-accounts-by-pan", method = RequestMethod.GET, produces = {
	"application/json" }, headers = "Accept=application/json")
	public List<Account> getAccountByPan(@RequestParam(name="pan")String pan){
		return accountRepo.getByPan(pan);
	}

}

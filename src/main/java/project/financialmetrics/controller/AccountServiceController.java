
package project.financialmetrics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import project.financialmetrics.model.Account;
import project.financialmetrics.service.AccountService;

@RestController
public class AccountServiceController{

	@Autowired
	AccountService accountService;

	@PostMapping("/accounts/{requestAccountId}")
	private ResponseEntity<Account>  getAccount(@PathVariable int requestAccountId){
		Account responseAccount = accountService.getAccount(requestAccountId);
		return  new ResponseEntity<Account>(responseAccount,HttpStatus.OK);
	//end of method getAccount
	}



	//end of class AccountService
}

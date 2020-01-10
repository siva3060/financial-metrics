package project.financialmetrics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.financialmetrics.model.Account;
import project.financialmetrics.repository.AccountsRepository;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountsRepository accountRepository;

	public Account getAccount(int accountId){

		Account repositoryAccount = accountRepository.findByAccountId(accountId);
		return repositoryAccount;
		//end of method getAccount
	}
	//end of class AccountServiceImpl
}

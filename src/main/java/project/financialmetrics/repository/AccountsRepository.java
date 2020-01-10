package project.financialmetrics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.financialmetrics.model.Account;

@Repository
public interface AccountsRepository extends JpaRepository<Account, Integer>{

	Account findByAccountId(int AccountId);
	//end of interface AccountRepository
}

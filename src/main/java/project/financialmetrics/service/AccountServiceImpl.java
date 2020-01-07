
public class AccountServiceImpl extends AccountService{

	@Autowired
	AccountsRepository AccountRepository;

	public Account getAccount(int accountId){

		Account repositoryAccount = AccountRepository.getById(accountId);
		return repositoryAccount;
		//end of method getAccount
	}
	//end of class AccountServiceImpl
}

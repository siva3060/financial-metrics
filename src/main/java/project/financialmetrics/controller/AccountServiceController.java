

@RestController
public class AccountServiceController{

	@Service
	AccountService accountService;

	@GetMapping("/accounts")
	private account getAccount(int requestAccountId){
		Account responseAccount = accountService.getAccount(requestAccountId);
		return  responseAccount;
	//end of method getAccount
	}
	//end of class AccountService
}



public interface AccountsRepository extends JpaRepository<Coustmer,AccountId>{

	Account findByCoustmerId(int AccountId);
	//end of interface AccountRepository
}

package bakning.application.banking;

import bakning.application.banking.Repository.AccountRepository;
import bakning.application.banking.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;



/**
 * 
 * @author Varadharajan
 *
 */
@Component
@Transactional
public class DataInitializerImpl  {

	@Autowired
	AccountRepository accountRepository;
	public
	 void initData() {

		Account account = new Account();
		accountRepository.save(account);
		
		
	}

	
}

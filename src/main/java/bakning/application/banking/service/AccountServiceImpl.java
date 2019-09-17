package bakning.application.banking.service;

import bakning.application.banking.DTO.AccountRequestDTO;
import bakning.application.banking.DTO.SuccessDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Varadharajan on 2019-09-17 16:10
 * @project name: banking
 */
@Service
@Transactional
public class AccountServiceImpl  implements  AccountService{


    @Override
    public SuccessDTO createAccount(AccountRequestDTO dto) {
        return null;
    }
}

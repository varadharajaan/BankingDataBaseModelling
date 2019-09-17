package bakning.application.banking.service;

import bakning.application.banking.DTO.AccountRequestDTO;
import bakning.application.banking.DTO.SuccessDTO;

/**
 * @author Varadharajan on 2019-09-17 16:08
 * @project name: banking
 */
public interface AccountService {

    SuccessDTO createAccount(AccountRequestDTO dto);
}

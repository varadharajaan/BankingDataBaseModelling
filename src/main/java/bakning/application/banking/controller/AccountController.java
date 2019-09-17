package bakning.application.banking.controller;

import bakning.application.banking.DTO.AccountRequestDTO;
import bakning.application.banking.DTO.SuccessDTO;
import bakning.application.banking.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author Varadharajan on 2019-09-17 16:13
 * @project name: banking
 */
@RestController
@RequestMapping("/accountManagement/v1")
public class AccountController {

    @Autowired
    private AccountService accountService;

    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/createEvent")
    public ResponseEntity<SuccessDTO> createCalenderEvent(@Valid @RequestBody AccountRequestDTO requestDTO) {

        SuccessDTO idDto = accountService.createAccount(requestDTO);
        return new ResponseEntity<>(idDto, HttpStatus.CREATED);
    }


}

package com.codurance.traineeship.katas.feature;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AccountServiceImplShould {

  private AccountService accountService;

  @Mock
  private TransactionRepository transactionRepository;

  @BeforeEach
  void setUp() {
    accountService = new AccountServiceImpl(transactionRepository);
  }

  @Test
  void handle_a_deposit() {
    accountService.deposit(1000);
    verify(transactionRepository).addDeposit(1000);
  }


}

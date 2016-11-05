package org.manlier.core.annotation.biz.service;

import org.manlier.core.annotation.biz.repository.AccountRepository;

/**
 * Created by manlier on 2016/10/22.
 */
public class TransferServiceImpl implements TransferService {

    private AccountRepository accountRepository;

    public TransferServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void transfer(int num, String x, String y) {
        System.out.println("Transfer num: " + num + ", x: " + x + ", y: " + y);
    }
}

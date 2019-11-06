package top.xuxuzhaozhao.service;

import top.xuxuzhaozhao.domain.Account;

public interface IAccountService {
    Account findAccountById(Integer accountId) throws Exception;

    void transfer(Integer sourceId,Integer targetId,Double money) throws Exception;
}

package top.xuxuzhaozhao.dao;

import top.xuxuzhaozhao.domain.Account;

public interface IAccountDao {
    Account findAccountById(Integer accountId) throws Exception;

    void transfer(Integer sourceId,Integer targetId,Double money) throws Exception;

    void updateAccount(Account account);
}

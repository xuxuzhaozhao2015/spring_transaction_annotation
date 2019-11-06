package top.xuxuzhaozhao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.xuxuzhaozhao.dao.IAccountDao;
import top.xuxuzhaozhao.domain.Account;
import top.xuxuzhaozhao.service.IAccountService;

@Service("accountService")
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS) //事务控制了
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    public Account findAccountById(Integer accountId) throws Exception {
        return accountDao.findAccountById(accountId);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void transfer(Integer sourceId, Integer targetId, Double money) throws Exception {
        accountDao.transfer(sourceId,targetId,money);
    }
}

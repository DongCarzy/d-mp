package com.dxp.dmp.sys.service.impl;

import com.dxp.dmp.sys.entity.Account;
import com.dxp.dmp.sys.mapper.AccountMapper;
import com.dxp.dmp.sys.service.AccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 账号表 服务实现类
 * </p>
 *
 * @author dongxinping
 * @since 2021-04-18
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

}

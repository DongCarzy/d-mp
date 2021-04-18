package com.dxp.dmp.sys.service.impl;

import com.dxp.dmp.sys.entity.Customer;
import com.dxp.dmp.sys.mapper.CustomerMapper;
import com.dxp.dmp.sys.service.CustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 客户表 服务实现类
 * </p>
 *
 * @author dongxinping
 * @since 2021-04-18
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

}

package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

/**
 * account账户接口
 */
public interface IAccountDao {

    /**
     *查询所有用户
     * @return
     */
    public List<Account> findAll();

    /**
     * 查询所有账户，并带有账户名和地址值
     * @return
     */

}

package com.neusoft.service.impl;

import java.util.List;

import com.neusoft.bean.AdminUser;
import com.neusoft.dao.AdminUserDao;
import com.neusoft.service.AdminUserService;

/**
 * 管理员
 * @author admin
 *
 */
public class AdminUserServiceImpl implements AdminUserService{
	//业务逻辑层调用数据持久层的接口
	private AdminUserDao adminUserDao;
	//提供一个Set方法注入
	public void setAdminUserDao(AdminUserDao adminUserDao) {
		this.adminUserDao = adminUserDao;
	}

	@Override
	public void saveAdminUser(AdminUser adminUser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAdminUser(AdminUser adminUser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAdminUserById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AdminUser> findAdminUser() {
		//调用数据持久层的findAdminUser()方法
		List<AdminUser> findAdminUser = adminUserDao.findAdminUser();
		return findAdminUser;
	}

}

package com.neusoft.service.impl;

import java.util.List;

import com.neusoft.bean.AdminUser;
import com.neusoft.dao.AdminUserDao;
import com.neusoft.service.AdminUserService;

/**
 * ����Ա
 * @author admin
 *
 */
public class AdminUserServiceImpl implements AdminUserService{
	//ҵ���߼���������ݳ־ò�Ľӿ�
	private AdminUserDao adminUserDao;
	//�ṩһ��Set����ע��
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
		//�������ݳ־ò��findAdminUser()����
		List<AdminUser> findAdminUser = adminUserDao.findAdminUser();
		return findAdminUser;
	}

}
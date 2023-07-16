package com.srisaai.RegistrationLoginApp.service.interfaces;

import java.util.List;

import com.srisaai.RegistrationLoginApp.entity.AdminDetail;

public interface AdminService {

	public int saveAdminDetail(AdminDetail adminDetail);
	
	public int adminLogin(String emailId , String password);
	
	public List<AdminDetail> getAdminData();
}

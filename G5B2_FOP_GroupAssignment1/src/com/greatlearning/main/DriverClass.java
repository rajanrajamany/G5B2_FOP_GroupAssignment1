package com.greatlearning.main;


import com.greatlearning.interfaces.IDisplayDetails;
import com.greatlearning.model.*;
import com.greatlearning.service.DisplayDepartmentDetails;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IDisplayDetails Disp=new DisplayDepartmentDetails();

		AdminDepartment Admin = new AdminDepartment(); 
		Disp.dispAdminDeparment(Admin);

		HrDepartment HR = new HrDepartment();		
		Disp.dispHrDepartment(HR);

		TechDepartment Tech = new TechDepartment();		
		Disp.dispTechDepartment(Tech);
		
		

	}

}

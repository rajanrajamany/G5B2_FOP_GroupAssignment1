package com.greatlearning.service;

import com.greatlearning.interfaces.IDisplayDetails;

import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.HrDepartment;
import com.greatlearning.model.TechDepartment;


public class DisplayDepartmentDetails implements IDisplayDetails{

	public void dispAdminDeparment(AdminDepartment Adm) {
		
		System.out.println("Welcome to " + Adm.departmentName() );
		System.out.println(Adm.getTodaysWork());
		System.out.println(Adm.getWorkDeadline());
		System.out.println(Adm.isTodayAHoliday());
		
	}

	public void dispHrDepartment(HrDepartment Hr) {

		System.out.println("\nWelcome to " + Hr.departmentName() );
		System.out.println(Hr.doActivity());
		System.out.println(Hr.getTodaysWork());
		System.out.println(Hr.getWorkDeadline());
		System.out.println(Hr.isTodayAHoliday());
		
	}

	public void dispTechDepartment(TechDepartment Tech) {
		System.out.println("\nWelcome to " + Tech.departmentName() );
		System.out.println(Tech.getTodaysWork());
		System.out.println(Tech.getWorkDeadline());
		System.out.println(Tech.getTechStackInformation());		
		System.out.println(Tech.isTodayAHoliday());
		
	}
	
	
}

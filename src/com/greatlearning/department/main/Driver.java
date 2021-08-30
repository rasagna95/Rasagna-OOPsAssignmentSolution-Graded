package com.greatlearning.department.main;
import com.greatlearning.department.*;

public class Driver {
		
	public static void main(String[] args) {
		
	SuperDepartment admin = new AdminDepartment();
	SuperDepartment hr = new HrDepartment();
	SuperDepartment tech = new TechDepartment();
	
	 // Display Admin Department functionalities 
	System.out.println("Welcome to "+admin.departmentName());
	System.out.println(admin.getTodaysWork());
	System.out.println(admin.getWorkDeadline());
	System.out.println(admin.isTodayAHoliday());
	
	System.out.println();
	
	 // Display Hr Department functionalities 
	System.out.println("Welcome to "+hr.departmentName());
	System.out.println(((HrDepartment) hr).doActivity());
	System.out.println(hr.getTodaysWork());
	System.out.println(hr.getWorkDeadline());
	System.out.println(hr.isTodayAHoliday());
	
	System.out.println();
	
	 // Display Tech Department functionalities 
	System.out.println("Welcome to "+tech.departmentName());
	System.out.println(tech.getTodaysWork());
	System.out.println(tech.getWorkDeadline());
	System.out.println(((TechDepartment) tech).getTechStackInformation());
	System.out.println(tech.isTodayAHoliday());

	}
}
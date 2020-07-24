package com.cg.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.cg.util.DBUtil;

public class Client {

	public static void main(String[] args) throws Exception {
		
		Scanner  scanner  = new Scanner(System.in);
		System.out.println(" Enter Employee Name ");
		String name = scanner.nextLine();
		System.out.println(" Enter Employee Salary ");
		double  salary = scanner.nextDouble();
		Connection con = DBUtil.getConnection();
		int employeeId=0;
	String  cmd = "insert into employee_tbl values(employee_seq.nextval,?,?)";
	PreparedStatement  pstmt=con.prepareStatement(cmd);
	pstmt.setString(1,name);
	pstmt.setDouble(2, salary);
	pstmt.executeUpdate();	
		
	cmd="select employee_seq.currval from dual ";
	pstmt= con.prepareStatement(cmd);
	ResultSet  rst= pstmt.executeQuery();
	if(rst.next())
	{
		employeeId= rst.getInt(1);
	}
	
		con.close();
		System.out.println("Employee added successfully ");
		System.out.println(" Employee Id generated = "+employeeId);
		
		
	}

}

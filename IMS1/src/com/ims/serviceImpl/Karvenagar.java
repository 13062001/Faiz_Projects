package com.ims.serviceImpl;

import com.ims.service.Cjc;
import com.ims.exception.*;
import com.ims.model.*;
import com.ims.JDBC.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Karvenagar implements Cjc {
Scanner sc = new Scanner(System.in);
	@Override
	public void addCourse() {
		try {
			Connection conn=JDBC.getConn();
			Course c = new Course();
			System.out.println("Enter Coure ID : ");
			c.setCid(sc.nextInt());
			System.out.println("Enter Coure Name : ");
			c.setCname(sc.next()+sc.nextLine());
			String s = "insert into course values ("+c.getCid()+",'"+c.getCname()+"')" ;
			Statement smt = conn.createStatement() ;
			smt.execute(s);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void viewCourse() {
		try {
			Connection conn=JDBC.getConn();
			String s = "Select * from course" ;
			Statement smt = conn.createStatement() ;
			ResultSet rs = smt.executeQuery(s);
			while(rs.next())
			{
				System.out.println("Course ID : "+rs.getInt(1));
				System.out.println("Course Name : "+rs.getString(2));
			}
			smt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void addFaculty() {
		
		try {
			Connection conn=JDBC.getConn();
			Faculty f = new Faculty();
			System.out.println("Enter Faculty ID : ");
			f.setFID(sc.nextInt());
			System.out.println("Enter Faculty Name : ");
			f.setFName(sc.next()+sc.nextLine());
			viewCourse();
			System.out.println("Enter The CourseID you Want To Assign");
			int a = sc.nextInt() ;
			String s = "insert into faculty values ("+f.getFID()+",'"+f.getFName()+"',"+a+")" ;
			Statement smt = conn.createStatement() ;
			smt.execute(s);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void viewFaculty() {
		try {
			Connection conn=JDBC.getConn();
			String s = "Select * from faculty" ;
			Statement smt = conn.createStatement() ;
			ResultSet rs = smt.executeQuery(s);
			while(rs.next())
			{
				System.out.println("Faculty ID : "+rs.getInt(1));
				System.out.println("Faculty Name : "+rs.getString(2));
				String s1 = "select * from course where id=?" ;
				PreparedStatement ps = conn.prepareStatement(s1);
				ps.setInt(1, rs.getInt(3));
				ResultSet rs1 = ps.executeQuery();
				if(rs1.next())
				{
					System.out.println("Course ID : "+rs1.getInt(1));
					System.out.println("Course Name : "+rs1.getString(2));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addBatch() {
		
		try {
			Connection conn=JDBC.getConn();
			Batch b = new Batch();
			System.out.println("Enter Batch ID : ");
			b.setBid(sc.nextInt());
			System.out.println("Enter Batch Name : ");
			b.setBname(sc.next()+sc.nextLine());
			viewFaculty();
			System.out.println("Enter The FacultyID you Want To Assign");
			int a = sc.nextInt();
			String s = "insert into batch values ("+b.getBid()+",'"+b.getBname()+"',"+a+")" ;
			Statement smt = conn.createStatement() ;
			smt.execute(s);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void viewBatch() {
		try {
			Connection conn=JDBC.getConn();
			String s = "select * from batch" ;
			Statement smt = conn.createStatement() ;
			ResultSet rs = smt.executeQuery(s);
			while(rs.next())
			{
				System.out.println("Batch ID : "+rs.getInt(1));
				System.out.println("Batch Name : "+rs.getString(2));
				String s1 = "select * from faculty where Id=?" ;
				PreparedStatement ps = conn.prepareStatement(s1);
				ps.setInt(1, rs.getInt(3));
				ResultSet rs1 = ps.executeQuery();
				if(rs1.next())
				{
					System.out.println("Faculty ID : "+rs1.getInt(1));
					System.out.println("Faculty Name : "+rs1.getString(2));
					String s2 = "select * from course where id=?" ;
					PreparedStatement ps1 = conn.prepareStatement(s2);
					ps1.setInt(1, rs1.getInt(3));
					ResultSet rs2 = ps1.executeQuery();
					if(rs2.next())
					{
						System.out.println("Course ID : "+rs2.getInt(1));
						System.out.println("Course Name : "+rs2.getString(2));
					}
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addStudent() {
		
		try {
			Connection conn=JDBC.getConn();
			Student st = new Student();
			System.out.println("Enter Student ID : ");
			st.setSid(sc.nextInt());
			System.out.println("Enter Student Name : ");
			st.setSname(sc.next()+sc.nextLine());
			viewBatch();
			System.out.println("Enter the BatchID");
			int a=sc.nextInt();
			String s = "insert into student values ("+st.getSid()+",'"+st.getSname()+"',"+a+")" ;
			Statement smt = conn.createStatement() ;
			smt.execute(s);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void viewStudent() {
		try {
			Connection conn=JDBC.getConn();
			String s = "select * from student" ;
			Statement smt = conn.createStatement() ;
			ResultSet rs = smt.executeQuery(s);
			while(rs.next())
			{
				System.out.println("Student ID : "+rs.getInt(1));
				System.out.println("Student Name : "+rs.getString(2));
				String s1 = "select * from batch where Id=?" ;
				PreparedStatement ps = conn.prepareStatement(s1);
				ps.setInt(1, rs.getInt(3));
				ResultSet rs1 = ps.executeQuery();
				if(rs1.next())
				{
					System.out.println("Batch ID : "+rs1.getInt(1));
					System.out.println("Batch Name : "+rs1.getString(2));
					String s2 = "select * from faculty where Id=?" ;
					PreparedStatement ps1 = conn.prepareStatement(s2);
					ps1.setInt(1, rs1.getInt(3));
					ResultSet rs2 = ps1.executeQuery();
					if(rs2.next())
					{
						System.out.println("Faculty ID : "+rs2.getInt(1));
						System.out.println("Faculty Name : "+rs2.getString(2));
						String s3 = "select * from course where id=?" ;
						PreparedStatement ps2 = conn.prepareStatement(s3);
						ps2.setInt(1, rs1.getInt(3));
						ResultSet rs3 = ps2.executeQuery();
						if(rs3.next())
						{
							System.out.println("Faculty ID : "+rs3.getInt(1));
							System.out.println("Faculty Name : "+rs3.getString(2));
						}
					}
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

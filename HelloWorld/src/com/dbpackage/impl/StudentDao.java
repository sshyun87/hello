package com.dbpackage.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dbpackage.common.Dao;
import com.dbpackage.model.Student;

public class StudentDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public List<Student> getStudentList(){
		conn = Dao.getConnect();
		String sql = "select * from student";
		List<Student> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Student st = new Student();
				st.setsNo(rs.getInt("stu_numb"));
				st.setsName(rs.getString("stu_name"));
				st.setsMajor(rs.getString("major"));
				list.add(st);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public void insertStudent(Student student) {
		conn = Dao.getConnect();
		String sql = "insert into student values(?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, student.getsNo());
			pstmt.setString(2, student.getsName());
			pstmt.setString(3, student.getsMajor());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}

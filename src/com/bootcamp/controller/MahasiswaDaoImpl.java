package com.bootcamp.controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bootcamp.application.Mahasiswa;
import com.mysql.jdbc.Buffer;

public class MahasiswaDaoImpl implements MahasiswaDao {
	
	static final String JBDC_DRIVER = "com.mysql.jdbc.Driver" ;
	static final String DB_URL = "jdbc:mysql://localhost/dao" ;
	static final String USER = "root" ;
	static final String PASS = "" ;
	
	static Connection connect ;
	static Statement stmt ;
	static ResultSet rs ;
	private PreparedStatement ps = null ;
	static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	static BufferedReader input = new BufferedReader(inputStreamReader) ;	
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		if(connect == null || connect.isClosed()) {
			Class.forName(JBDC_DRIVER);
	        connect = DriverManager.getConnection(DB_URL,USER,PASS);
	        stmt = connect.createStatement();
		}
		return connect;
	}
	
	
		public String insert(Mahasiswa mhs) throws Exception {
			try {
				ps = getConnection().prepareStatement("INSERT INTO mhs VALUES (?,?,?)");
				ps.setString(1, mhs.getId());
				ps.setString(2, mhs.getName());
				ps.setString(3, mhs.getAddress());
				
				ps.executeUpdate() ;
				
				return "Berhasil" ;
				
			} catch (Exception e) {
				return "Gagal" ;
			}
		}
}
  
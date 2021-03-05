package com.ia.addrApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ia.addrApp.model.AddrBook;

public class MySQLHandler {
	Connection con;
	Statement state;
	final String USER_ID = "root";
	final String USER_PW = "1126";
	final String DBNAME = "test0224";
	
	String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	String dbUrl = "jdbc:mysql://127.0.0.1/"+ DBNAME + "?autoReconnect=true&serverTimezone=UTC&testOnBorrow=True&validationQuery=select 1";
//	static String dbUrl = "jdbc:mysql://loclahost/"+ DBNAME + "?autoReconnect=true&useSSL=false";
//	jdbc:mysql://localhost:3306/test?autoReconnect=true"
	
	public MySQLHandler() {
		connectDB();
	}
	
	public void connectDB() {
		try {
			Class.forName(jdbcDriver).newInstance();
			con = DriverManager.getConnection(dbUrl,USER_ID,USER_PW);
			if(con != null) {
				state = con.createStatement();
				System.out.println("DB 접속 성공!");
			}
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	public void closeDB() {
		try {
				con.close();
				System.out.println("DB 접속 해제");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void createTable() {
//		System.out.println("테이블 명을 입력해주세요 : ");
//		Scanner s = new Scanner(System.in);
//		String tname = s.nextLine();
		String query = "create table addrbook (id INT(10) NOT NULL AUTO_INCREMENT, "
				+ "name VARCHAR(10) NOT NULL, age INT(3) NOT NULL, tel VARCHAR(20) NOT NULL,"
				+ "addr VARCHAR(40) NOT NULL, email VARCHAR(30) NULL, date DATETIME NOT NULL,"
				+ "PRIMARY KEY(id))";
		try {
			state.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//			System.out.println(e.getErrorCode());
//			System.out.println(e.getCause());
//			e.printStackTrace();
			checkError(e);
		}
	}
	
	public void insertDB(AddrBook ab) {
		String query2 = String.format("insert into addrbook (name, age, tel, addr, email, date)"
	            +" values('%s',%d,'%s','%s','%s', now())",
	            ab.getName(),ab.getAge(),ab.getTel(),ab.getAddress(),ab.getEmail());

		try {
			state.executeUpdate(query2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
			System.out.println(e.getCause());
			checkError(e);
		}
	}
	
	public void showDB() {
		String query = "select * from addrbook ";
		try {
			ResultSet rs = state.executeQuery(query);
			if(rs != null) {
				rs = state.getResultSet();
				int count = 1;
				while (rs.next()) {
					System.out.print(rs.getString("id")+ "\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("age")+"\t");
					System.out.print(rs.getString("email")+"\t");
					System.out.print(rs.getString("tel")+"\t");
					System.out.print(rs.getString("addr")+"\t");
					System.out.println(rs.getString(7));
					count++;
				}
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void dropTB() {
		String query = "drop table addrbook ";
		try {
			state.executeUpdate(query);
		} catch (SQLException e) {
			checkError(e);
		}
	}
	
	public void checkError(SQLException e) {
		switch(e.getErrorCode()) {
		case 1050 :
			System.out.println("테이블이 이미 존재합니다.");
//			String query = "SELECT TABLE_NAME FROM information schema.TABLES ";
//			try {
//				state.executeUpdate(query);
//			} catch (SQLException e) {
//				checkError(e);
//			}
			break;
		case 1051:
			System.out.println("삭제할 테이블이 존재하지 않습니다.");
			break;
		}
	}
	
	 public void randData()
     {
         String[] name = { "홍길동", "김길동", "이길동", "박길동", "최길동" };
         int[] age = {20, 30, 40, 50, 60};
         String[] tel = { "010-1111-1111", "010-2222-2222", "010-3333-3333", "010-4444-4444", "010-5555-5555" };
         String[] addr = { "대구시 동구 신암동", "서울시 동구 신암동", "대전시 동구 신암동", "부산시 동구 신암동", "광주시 동구 신암동" };
         String[] email = { "hong@naver.com", "kim@naver.com", "lee@naver.com", "park@naver.com", "choi@naver.com" };

         //Random r = new Random();
         for (int i = 0; i < 5; i++)
         {
        	 String que = String.format("insert into addrbook (id,name,age,tel,addr,email,date)"
     	            +" values(0,'%s',%d,'%s','%s','%s',now())",name[(int) (Math.random()*5)],age[(int) (Math.random()*5)], 
     	            tel[(int) (Math.random()*5)], addr[(int) (Math.random()*5)],email[(int) (Math.random()*5)]);
        	 
        	 try {
     			state.executeUpdate(que);
     		} catch (SQLException e) {
     			// TODO Auto-generated catch block
//     			e.printStackTrace();
     			System.out.println(e.getMessage());
     			System.out.println(e.getErrorCode());
     			System.out.println(e.getCause());
     			checkError(e);
     		}
         }
     }
}

package jdbc0226;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcTest {
	static Connection con;
	static Statement state;
	static final String USER_ID = "root";
	static final String USER_PW = "1126";
	static final String DBNAME = "test0224";
	
	static String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	static String dbUrl = "jdbc:mysql://127.0.0.1/"+ DBNAME + "?autoReconnect=true&serverTimezone=UTC&testOnBorrow=True&validationQuery=select 1";
//	static String dbUrl = "jdbc:mysql://loclahost/"+ DBNAME + "?autoReconnect=true&useSSL=false";
//	jdbc:mysql://localhost:3306/test?autoReconnect=true"
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		connectDB();
		insertDB();
		showDB();
		closeDB();
	}

	public static void connectDB() {
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
	
	public static void closeDB() {
		try {
				con.close();
				System.out.println("DB 접속 해제");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insertDB() {
		String query = "insert into t_user values " + 
				   "(0,'홍길동',100,'hong@naver.com','010-1234-1234','조선한양홍대감댁',now())";
				   
				      
	      String name = "전우치";
	      int age = 200;
	      String email = "jon@kakao.com";
	      String tel = "010-111-1234";
	      String addr = "조선 두메 산골";
	      String query2 = String.format("insert into t_user(user_nm,user_age,email,user_phone,user_addr)"
	            +" values('%s',%d,'%s','%s','%s')",name,age,email,tel,addr);

		try {
			state.executeUpdate(query2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void showDB() {
		String query = "select * from t_user";
		try {
			ResultSet rs = state.executeQuery(query);
			if(rs != null) {
				rs = state.getResultSet();
				int count = 0;
				while (rs.next()) {
					System.out.print(count+ "\t");
					System.out.print(rs.getString("user_nm")+"\t");
					System.out.print(rs.getString("user_age")+"\t");
					System.out.print(rs.getString("email")+"\t");
					System.out.print(rs.getString("user_phone")+"\t");
					System.out.print(rs.getString("user_addr")+"\t");
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
	
}

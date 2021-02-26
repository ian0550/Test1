package jdbc0226;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcTest {
	static Connection con;
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
		closeDB();
	}

	public static void connectDB() {
		try {
			Class.forName(jdbcDriver).newInstance();
			con = DriverManager.getConnection(dbUrl,USER_ID,USER_PW);
			if(con != null) {
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
	
}

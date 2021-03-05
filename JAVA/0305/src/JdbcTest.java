import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcTest {
	static final int CREATE_TABLE = 1;
	static final int DEL_TABLE = 2;
	static final int INSERT_DATA = 3;
	static final int VIEW_DATA = 4;
	static final int RANDOM_DATA = 5;
	static final int UPDATE_DATA = 6;
	static final int DEL_DATA = 7;
	static final int MAIN_EXIT = 8;
	static Connection con;
	static Statement state;
	static final String USER_ID = "root";
	static final String USER_PW = "1126";
	static final String DBNAME = "test0224";
	
	static String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	static String dbUrl = "jdbc:mysql://127.0.0.1/"+ DBNAME + "?autoReconnect=true&serverTimezone=UTC&testOnBorrow=True&validationQuery=select 1";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		MyConnect c = new MyConnect();
//		connectDB();
		c.connectDB();
		while (true) {
			switch (menu(s)) {
			case CREATE_TABLE:
				c.createTable();
				break;
			case DEL_TABLE:
				c.dropTB();
				break;
			case INSERT_DATA:
				c.insertDB();
				break;
			case VIEW_DATA:
				c.showDB();
				break;
			case RANDOM_DATA:
				c.randData();
				break;
			case UPDATE_DATA:
				break;
			case DEL_DATA:
				break;
			case MAIN_EXIT:
				System.out.println("");
				c.closeDB();
				s.close();
				System.exit(0);
				break;
			}
		}
		
	}
	
	private static void connectDB() {
		// TODO Auto-generated method stub
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
	
	public static void createTB() {
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
			checkError(e);
		}
	}

	public static int menu(Scanner s) {
		System.out.println("--------------------");
		System.out.println(" MySQL DB 관리 v1.0 ");
		System.out.println("--------------------");
		System.out.println("1. 테이블 생성");
		System.out.println("2. 테이블 삭제");
		System.out.println("3. 데이터 추가");
		System.out.println("4. 데이터 보기");
		System.out.println("5. 랜덤 데이터 추가");
		System.out.println("6. 데이터 수정");
		System.out.println("7. 데이터 삭제");
		System.out.println("8. 프로그램 종료");
		System.out.println("--------------------");
		System.out.println("메인 메뉴 선택");
		return s.nextInt();
	}
	
	public static void dropTB() {
		String query = "drop table addrbook ";
		try {
			state.executeUpdate(query);
		} catch (SQLException e) {
			checkError(e);
		}
	}
	
	public static void checkError(SQLException e) {
		switch(e.getErrorCode()) {
		case 1050 :
			System.out.println("테이블이 이미 존재합니다.");
			break;
		case 1051:
			System.out.println("삭제할 테이블이 존재하지 않습니다.");
			break;
		}
	}

}

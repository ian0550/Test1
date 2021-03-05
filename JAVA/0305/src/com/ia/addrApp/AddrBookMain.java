package com.ia.addrApp;

import java.util.Scanner;

import com.ia.addrApp.dao.MySQLHandler;
import com.ia.addrApp.model.AddrBook;
import com.ia.addrApp.util.Menu;
import com.ia.addrApp.util.RandData;

public class AddrBookMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MySQLHandler db = new MySQLHandler();
		Menu me = new Menu();
//		connectDB();
//		db.connectDB();
		while (true) {
			switch (me.mainMenu(s)) {
			case Menu.CREATE_TABLE:
				db.createTable();
				break;
			case Menu.DEL_TABLE:
				db.dropTB();
				break;
			case Menu.INSERT_DATA:
				db.insertDB(me.addMenu(s));
				break;
			case Menu.VIEW_DATA:
				db.showDB();
				break;
			case Menu.RANDOM_DATA:
				RandData data = new RandData();
				db.insertDB(data.getABook());
				break;
			case Menu.UPDATE_DATA:
				break;
			case Menu.DEL_DATA:
				break;
			case Menu.MAIN_EXIT:
				System.out.println("");
				db.closeDB();
				s.close();
				System.exit(0);
				break;
			}
		}
	}

}

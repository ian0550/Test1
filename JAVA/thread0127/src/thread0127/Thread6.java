package thread0127;

import java.io.File;
import java.io.IOException;

public class Thread6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileDir fileDir = new FileDir();
		fileDir.start();
	}

}

class FileDir extends Thread {
	public void run()	{ //오버라이딩
		subDirList("C:\\Program Files");
	}
	public void subDirList(String source) {
		File dir = new File(source);
		File[] fileList = dir.listFiles();
		
		for (int i = 0; i < fileList.length; i++) {
			File file = fileList[i];
			if (file.isFile()) {
				String name = file.getName();
				System.out.println("\t 파일: " + name);
			}else if(file.isDirectory()) {
				System.out.println("폴더 : " + file.getName());
				try {
					subDirList(file.getCanonicalPath().toString());
					Thread.sleep(100);
				} catch (IOException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NullPointerException e) {
					System.out.println("시스템 폴더 제한");
				}
			}
		}
	}
}
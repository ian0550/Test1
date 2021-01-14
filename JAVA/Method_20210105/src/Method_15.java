import java.util.Random;

public class Method_15 {

	public static void main(String[] args) {
		int hap = 0;
		int avg = 0;
		int arr[][] = getScore();
        for (int i = 0; i < arr.length; i++) {
        	for (int j = 0; j < arr[i].length; j++) {
        		System.out.print(arr[i][j] + " ");
        		hap += arr[i][j];
        	}
        	System.out.print("총점 : " + hap);
        	avg = hap / 3;
        	System.out.print(" 평균 : " + avg);
        	if (avg <= 100 && avg >= 90) {
        		System.out.print(" A학점");
        	}
        	else if (avg <= 89 && avg >= 80) {
        		System.out.print(" B학점");
        	}
        	else if (avg <= 79 && avg >= 70) {
        		System.out.print(" C학점");
        	}
        	else if (avg <= 69 && avg >= 60) {
        		System.out.print(" D학점");
        	}
        	else if (avg <= 59 && avg >= 50) {
        		System.out.print(" E학점");
        	}
        	else {
        			System.out.print(" F학점");
        		}
        	hap = avg = 0;
        	System.out.println();
        }
	}
	public static int[][] getScore() {
		Random r = new Random();
		int arr[][] = new int[5][3];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = r.nextInt(101);
				//System.out.print(arr[i][j] + " ");
			}
			//System.out.println();
		}
		return arr;
	}

}

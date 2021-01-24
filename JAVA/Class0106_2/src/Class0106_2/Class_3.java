package Class0106_2;

public class Class_3 {
	
	
	public static void main(String[] args) {
       Matchname s = new Matchname();
       s.setName("2020 NATIONAL LEAGUE CHAMPIONSHIP SERIES");
       s.setTeam1("LA DODGERS");
       s.setTeam2("ATLANTA BRAVES");
       s.setDate("2020. 10. 13 ~ 2020. 10. 19");
       s.setResult("LA DODGERS WINS NATIONAL LEAGUE CHAMPIONSHIP SERIES 4-3");
       
       System.out.println("´ëÈ¸¸í : " + s.getName());
       System.out.println("NLDS1 ½Â¸®ÆÀ : " + s.getTeam1());
       System.out.println("NLDS2 ½Â¸®ÆÀ : " + s.getTeam2());
       System.out.println("±â°£ : " + s.getDate());
       System.out.println("½Ã¸®Áî °á°ú : " + s.getResult());
       System.out.println(Matchname.category);
	}

}
class Matchname {
	static String category = "LA ´ÙÀú½ºÀÇ 2020 NLCS ½Â¸®";
	
	private String name;
	private String team1;
	private String team2;
	private String date;
	private String result;
	public static String getCategory() {
		return category;
	}
	public static void setCategory(String category) {
		Matchname.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
}

	
	



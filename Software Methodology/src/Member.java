import java.util.Date;

public class Member implements Comparable<Member>{
	
	private String fname;
	private String lname;
	private Date dob;
	private Date expire;
	private Location location;
	
	@Override
	public String toString() {
		return null;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		return false;
	}
	
	@Override
	public int compareTo(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}

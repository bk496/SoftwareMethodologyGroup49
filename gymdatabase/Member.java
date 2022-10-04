package gymdatabase;
/*
 *  @author Bradley Kolczynkski
 */

import java.util.Date;


public class Member implements Comparable<Member>{
	
	private String fname;
	private String lname;
	private String dob;
	private String expire;
	private String location;
	
	
	public Member(String fname, String lname, String date, String ex) {
		this.fname = fname;
		this.lname = lname;
		this.dob = date;
		this.expire = ex;
		//this.location = location;
	}
	
	public String getFname() {
		return this.fname;
	}
	
	public String getLname() {
		return this.lname;
	}
	
	public String getDob() {
		return this.dob;
	}
	
	
	@Override
	public String toString() {
		return getFname() + " " + getLname() + ", DOB: " + dob + ", Membership expires " + expire + ", " + location;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		return false;
	}
	
	@Override
	public int compareTo(Member member) {
		// TODO Auto-generated method stub
		
		String first = this.fname;
		String last = this.lname;
		String dob = this.dob;
		
		String fCom = member.fname;
		String lCom = member.fname;
		String dobCom = member.dob;
		
		if(first.equals(fCom) == true && last.equals(lCom) == true && dob.compareTo(dobCom) == 0) {
			
			return 0;
		}
		else {
			return -1;
		}
		
		
	
	}
	
	

}
package gymdatabase;
/*
 *  @author Bradley Kolczynkski
 */


public class MemberDatabase {
	
	private Member [] mlist = new Member[4];
	private int size;
	
	private int find(Member member) {
		for(int i=0; i < mlist.length; i++) {
			if(member.equals(mlist[i])) {
				return i;
			}
		}
		return -1;
		
	}
	private void grow() {
		
		Member[] newM = new Member[mlist.length + 4];
		for(int i =0; i < newM.length;i++) {
			
			if(i < mlist.length) {
				newM[i] = mlist[i];
				
			}
		}
		
		mlist = newM;
	}
	
	public boolean add(Member member) {
		
			
		
		return false;
		
	}
	public boolean remove(Member member) {
		return false;
		
	}
	//print array contents as is
	public void print () {
		if(mlist.length == 0) {
			System.out.println("Member Database is empty");
			return;
		}
		System.out.println("-list of members-");
		for(int i =0; i < mlist.length; i++) {
			System.out.println(mlist[i].toString());
		}
	}
	//Sort by county and then zip code
	public void printByCountry() {
		
	}
	
	//sort by the expiration date
	public void printByExpirationDate() {
		
	}
	
	//sort by last name and then first
	public void printByName() {
		
	}
	
	
	
}
package gymMembership;


// child class to construct a member with a single club membership
public class SingleClubMember extends Member {
	
	private int club;
	
	public SingleClubMember(char pMemberType, int pMemberID, String pName, double pFees, int pClub) {
		
		super(pMemberType, pMemberID, pName, pFees);
		club = pClub;
	}

	public int getClub() {
		return club;
	}

	public void setClub(int pClub) {
		club = pClub;
	}
	
	public String toString() {
		return super.toString() + ", " + club;
	}
}

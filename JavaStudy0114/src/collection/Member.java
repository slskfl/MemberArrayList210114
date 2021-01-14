package collection;

public class Member {

	private int memberId;		//회원 아이디
	private String memberName;	//회원 이름
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//매개변수로 받은 회원 아이디가 자신의 회원 아이디가 같다면 true로 반환합니다.
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(this.memberId==member.memberId) {
				return true;
			}else {
				
			}
		}
		return false;
	}

	public Member(int memberid, String memberName) {
		this.memberId = memberid;
		this.memberName = memberName;
	}

	public int getMemberid() {
		return memberId;
	}

	public void setMemberid(int memberid) {
		this.memberId = memberid;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

}

package collection;

public class Member {

	private int memberId;		//ȸ�� ���̵�
	private String memberName;	//ȸ�� �̸�
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return memberName + "ȸ������ ���̵�� " + memberId + "�Դϴ�.";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//�Ű������� ���� ȸ�� ���̵� �ڽ��� ȸ�� ���̵� ���ٸ� true�� ��ȯ�մϴ�.
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

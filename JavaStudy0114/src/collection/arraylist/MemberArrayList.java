package collection.arraylist;

import java.util.ArrayList;

import collection.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		// TODO Auto-generated constructor stub
		arrayList = new ArrayList<Member>();
	}

	// 회원을 추가하는 메서드
	public void addMember(Member member) {
		arrayList.add(member);
	}

	// 회원을 삭제하는 메서드
	public boolean remove(int memberId) {

		for (int i = 0; i < arrayList.size(); i++) {
			// get() 메서드로 회원을 순차적으로 가져옵니다.
			Member member = arrayList.get(i);
			int tempId = member.getMemberid();

			// 회원 아이디가 매개 변수와 일치하면
			if (tempId == memberId) {
				// 해당 회원을 삭제합니다.
				arrayList.remove(i);
				return true;
			}
		}
		// 반복문이 끝날때까지 해당 아이디를 찾지 못한 경우 메시지를 출력합니다.
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	// 전체 회원을 출력하는 메서드
	public void showAllMembers() {

		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	//아이디 중복확인 메서드
	public boolean checkMemberId(int memberId) {
			
			boolean used = false;	//사용중인지 여부 판단
			
			for(Member member:arrayList) {
				int tempId = member.getMemberid();
				if(tempId == memberId) {
					used = true;
					break;
				}
			}
			return used;
		}


}

package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {

		// ArrayListMember를 생성합니다.
		MemberArrayList memberArrayList = new MemberArrayList();

		// 새로운 인스턴스를 생성합니다.
		Member memberA = new Member(1001, "라이언");
		Member memberB = new Member(1001, "어피치");
		Member memberC = new Member(1003, "무지");

		// 회워을 memberArrayList에 추가합니다.
		memberArrayList.addMember(memberA);
		memberArrayList.addMember(memberB);
		memberArrayList.addMember(memberC);

		// 전체 회원을 출력합니다.
		memberArrayList.showAllMembers();

		// 어피치 회원을 삭제합니다.
		memberArrayList.remove(memberB.getMemberid());

		// 전체 회원을 출력합니다.
		memberArrayList.showAllMembers();

		// 아이디가 중복된 회원을 추가합니다.
		Member memberD = new Member(1003, "콘");
		boolean result = memberArrayList.checkMemberId(memberD.getMemberid());
		if(result) {
			System.out.println(memberD.getMemberid() + "이라는 아이디가 사용중입니다.");
		}else {
			memberArrayList.addMember(memberD);
		}

		
		memberArrayList.addMember(memberD);

		// 전체 회원을 출력합니다.
		memberArrayList.showAllMembers();

	}

}

package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {

		// ArrayListMember�� �����մϴ�.
		MemberArrayList memberArrayList = new MemberArrayList();

		// ���ο� �ν��Ͻ��� �����մϴ�.
		Member memberA = new Member(1001, "���̾�");
		Member memberB = new Member(1001, "����ġ");
		Member memberC = new Member(1003, "����");

		// ȸ���� memberArrayList�� �߰��մϴ�.
		memberArrayList.addMember(memberA);
		memberArrayList.addMember(memberB);
		memberArrayList.addMember(memberC);

		// ��ü ȸ���� ����մϴ�.
		memberArrayList.showAllMembers();

		// ����ġ ȸ���� �����մϴ�.
		memberArrayList.remove(memberB.getMemberid());

		// ��ü ȸ���� ����մϴ�.
		memberArrayList.showAllMembers();

		// ���̵� �ߺ��� ȸ���� �߰��մϴ�.
		Member memberD = new Member(1003, "��");
		boolean result = memberArrayList.checkMemberId(memberD.getMemberid());
		if(result) {
			System.out.println(memberD.getMemberid() + "�̶�� ���̵� ������Դϴ�.");
		}else {
			memberArrayList.addMember(memberD);
		}

		
		memberArrayList.addMember(memberD);

		// ��ü ȸ���� ����մϴ�.
		memberArrayList.showAllMembers();

	}

}

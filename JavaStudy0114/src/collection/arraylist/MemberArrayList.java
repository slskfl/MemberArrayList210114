package collection.arraylist;

import java.util.ArrayList;

import collection.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		// TODO Auto-generated constructor stub
		arrayList = new ArrayList<Member>();
	}

	// ȸ���� �߰��ϴ� �޼���
	public void addMember(Member member) {
		arrayList.add(member);
	}

	// ȸ���� �����ϴ� �޼���
	public boolean remove(int memberId) {

		for (int i = 0; i < arrayList.size(); i++) {
			// get() �޼���� ȸ���� ���������� �����ɴϴ�.
			Member member = arrayList.get(i);
			int tempId = member.getMemberid();

			// ȸ�� ���̵� �Ű� ������ ��ġ�ϸ�
			if (tempId == memberId) {
				// �ش� ȸ���� �����մϴ�.
				arrayList.remove(i);
				return true;
			}
		}
		// �ݺ����� ���������� �ش� ���̵� ã�� ���� ��� �޽����� ����մϴ�.
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}

	// ��ü ȸ���� ����ϴ� �޼���
	public void showAllMembers() {

		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	//���̵� �ߺ�Ȯ�� �޼���
	public boolean checkMemberId(int memberId) {
			
			boolean used = false;	//��������� ���� �Ǵ�
			
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

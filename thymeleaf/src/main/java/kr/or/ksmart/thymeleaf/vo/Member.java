package kr.or.ksmart.thymeleaf.vo;

public class Member {
	
	private String memberId;
	private String memberPw;
	private String memberLevel;
	private String memberName;
	private String memberEmail;
	
	public Member(String memberId, String memberPw, String memberLevel, String memberName, String memberEmail) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberLevel = memberLevel;
		this.memberName = memberName;
		this.memberEmail = memberEmail;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberLevel() {
		return memberLevel;
	}
	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPw=" + memberPw + ", memberLevel=" + memberLevel
				+ ", memberName=" + memberName + ", memberEmail=" + memberEmail + "]";
	}
}

package study.spring.project.model;

import lombok.Data;

@Data
public class Member {
	/** 회원 일련번호 */
	private int id;
	/** 유저 아이디 */
	private String userId;
	/** 유저 비밀번호 */
	private String userPw;
	/** 유저 회원명 */
	private String userName;
	/** 우편번호 */
	private String postcode;
	/** 기본주소 */
	private String addr1;
	/** 상세주소 */
	private String addr2;
	/** 유저 연락처 */
	private String userTel;
	/** 유저 이메일 */
	private String userEmail;
	/** 유저 환불계좌 */
	private String userAcc;
	/** 유저 생년월일 */
	private String userBirthdate;
	/** 유저 성별 */
	private String gender;
	/** 탈퇴여부 */
	private String isOut;
	/** 회원타입 */
	private String type;
	/** 가입일시 */
	private String regDate;
	/** 최종변경일시 */
	private String editDate;
}

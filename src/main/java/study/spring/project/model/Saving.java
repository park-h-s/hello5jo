package study.spring.project.model;

import lombok.Data;

@Data
public class Saving {
	/** 적립금 일련번호 */
	private int id;
	/** 구매후 적립되는 상품명 */
	private String productName;
	/** 적립금액 */
	private int saving;
	/** 적립금 사용금액 */
	private int use;
	/** 등록일시 */
	private String regDate;
	/** 최종변경일시 */
	private String editDate;
	/** 적립금 유효일시(6개월) */
	private String limitDate;
	/** 회원 일련번호 */
	private int memberId;

}

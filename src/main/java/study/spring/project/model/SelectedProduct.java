package study.spring.project.model;

import lombok.Data;

@Data
public class SelectedProduct {
	/** 장바구니 일련번호 */
	private int id;
	/** 장바구니와 결제완료의 타입 */
	private String type;
	/** 유저가 선택한 상품수량 */
	private int ea;
	/** 등록일시 */
	private String regDate;
	/** 최종변경일시 */
	private String editDate;
	/** 상품번호 */
	private int productId;
	/** 회원 일련번호 */
	private int memberId;
	/** 주문 테이블의 일련번호 */
	private Integer payId;

}

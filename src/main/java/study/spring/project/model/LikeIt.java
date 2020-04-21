package study.spring.project.model;

import lombok.Data;

@Data
public class LikeIt {
	/** 좋아요 일련번호 */
	private int id; 
	/** 좋아요 한 등록일시 */
	private String regDate;
	/** 상품 일련번호 */
	private int productId;
	/** 회원 일련번호 */
	private int memberId;
}

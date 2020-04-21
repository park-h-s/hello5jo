package study.spring.project.model;

import lombok.Data;

@Data
public class Review {
	/** 리뷰 일련번호 */
	private int id;
	/** 이벤트 댓글인지 상품리뷰인지 판별해주는 칼럼 */
	private String type;
	/** 별점 */
	private Integer rating;
	/** 리뷰의 내용 */
	private String comment;
	/** 리뷰 좋아요 갯수 */
	private int likeCount;
	/** 이벤트 댓글 등록일시 */
	private String regDate;
	/** 최종변경일시 */
	private String editDate;
	/** 리뷰를 작성한 유저의 일련번호 */
	private Integer memberId;
	/** 부모의 일련번호 */
	private int parentId;

}

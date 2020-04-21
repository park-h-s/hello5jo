package study.spring.project.model;

import lombok.Data;

@Data
public class Tag {
	/** 태그 일련번호 */
	private int id;
	/** 태그 이름 */
	private String name;
	/** 등록 일시 */
	private String regDate;
	/** 상품 일련번호 */
	private int productId;
}

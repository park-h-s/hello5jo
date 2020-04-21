package study.spring.project.model;

import lombok.Data;

@Data
public class Option {
	/** 색상 일련번호 */
	private int id;
	/** 등록일시 */
	private String regDate;
	/** 최종변경일시 */
	private String editDate;
	/** 사이즈인지 색상인지 판별해주는 컬럼 */
	private String type;
	/** 상품의 옵션 타입별 이름 . */
	private String optionName;
	/** 상품의 일련번호 */
	private int productId;
}

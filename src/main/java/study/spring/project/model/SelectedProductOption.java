package study.spring.project.model;

import lombok.Data;

@Data
public class SelectedProductOption {
	/** 유저가 선택한 상품의 옵션 일련번호 */
	private int id;
	/** 사이즈인지 색상인지 판별해주는 컬럼 */
	private String type;
	/** 상품의 옵션 타입별 이름 */
	private String optionName;
	/** 선택한 상품 일련번호 */
	private int selectedProductId;
}

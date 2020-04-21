package study.spring.project.model;

import lombok.Data;

@Data
public class Product {
	/** 상품 일련번호 */
	private int id;
	/** 상품 홍보문구 */
	private String title;
	/** 상품명 */
	private String name;
	/** 상품가격 */
	private int price;
	/** 할인율 */
	private int sale;
	/** 상품타입 */
	private String type;
	/** 상품 상세타입 */
	private String subtype;
	/** 상품 성별 */
	private String gender;
	/** 상품 조회 수 */
	private int hit;
	/** 상품 판매 수 */
	private int sellCount;
	/** 상품 입고지연날짜 */
	private String delay;
	/** 등록일시 */
	private String regDate;
	/** 최종변경일시 */
	private String editDate;
}

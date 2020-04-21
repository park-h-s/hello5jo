package study.spring.project.model;

import lombok.Data;

@Data
public class Image {
	/** 이미지 일련번호 */
	private int id;
	/** 이미지 파일 원본이름 */
	private String originName;
	/** 이미지 저장경로 */
	private String filePath;
	/** 이미지 파일 형식 */
	private String contentType;
	/** 이미지 파일 용량 */
	private int fileSize;
	/** 이미지 타입 */
	private String imgType;
	/** 등록일시 */
	private String regDate;
	/** 최종변경일시 */
	private String editDate;
	/** 타입이 슬라이드일 때 이동항 url을 적용 */
	private String url;
	/** 부모의 일련번호 */
	private int parentId;
}

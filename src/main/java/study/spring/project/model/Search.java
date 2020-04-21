package study.spring.project.model;

import lombok.Data;

@Data
public class Search {
	/** 검색 일련번호 */
	private int id;
	/** 검색어 조회수 */
	private int count;
	/** 검색어의 전 순위 */
	private Integer bRanking;
	/** 검색 단어 */
	private String word;
	/** 회원 일련번호 */
	private int memberId;

}

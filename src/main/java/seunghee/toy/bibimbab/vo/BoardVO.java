package seunghee.toy.bibimbab.vo;

public class BoardVO {
	
	// Variable
	private String TOC_PK;			// 글 번호
	private String TOC_TITLE;			// 제목
	private String TOC_CONTENTS;		// 내용
	private String TOC_REG_ID;			// 작성자
	private String TOC_REG_DATE;		// 작성일
	private String TOC_VISIT;			// 방문수
	private String TOC_DEL_YN;			// 삭제여부
	private String TOC_PASSWD;		// 등록 비밀번호

	// Constructor
	public BoardVO() { }
	
	public BoardVO(String TOC_PK, String TOC_TITLE, String TOC_REG_ID, String TOC_REG_DATE, String TOC_VISIT) {
		this.TOC_PK = TOC_PK;
		this.TOC_TITLE = TOC_TITLE;
		this.TOC_REG_ID = TOC_REG_ID;
		this.TOC_REG_DATE = TOC_REG_DATE;
		this.TOC_VISIT = TOC_VISIT;
	}
	
	public BoardVO(String TOC_PK, String TOC_TITLE, String TOC_CONTENTS, String TOC_REG_ID, String TOC_REG_DATE, String TOC_VISIT, String TOC_DEL_YN, String TOC_PASSWD) {
		this.TOC_PK = TOC_PK;
		this.TOC_TITLE = TOC_TITLE;
		this.TOC_CONTENTS = TOC_CONTENTS;
		this.TOC_REG_ID = TOC_REG_ID;
		this.TOC_REG_DATE = TOC_REG_DATE;
		this.TOC_VISIT = TOC_VISIT;
		this.TOC_DEL_YN = TOC_DEL_YN;
		this.TOC_PASSWD = TOC_PASSWD;
	}
	
	// Getter and Setter
	public String getTOC_PASSWD() {
		return TOC_PASSWD;
	}
	public void setTOC_PASSWD(String TOC_PASSWD) {
		this.TOC_PASSWD = TOC_PASSWD;
	}
	public String getTOC_DEL_YN() {
		return TOC_DEL_YN;
	}
	public void setTOC_DEL_YN(String TOC_DEL_YN) {
		this.TOC_DEL_YN = TOC_DEL_YN;
	}
	public String getTOC_PK() {
		return TOC_PK;
	}
	public void setTOC_PK(String TOC_PK) {
		this.TOC_PK = TOC_PK;
	}
	public String getTOC_TITLE() {
		return TOC_TITLE;
	}
	public void setTOC_TITLE(String TOC_TITLE) {
		this.TOC_TITLE = TOC_TITLE;
	}
	public String getTOC_CONTENTS() {
		return TOC_CONTENTS;
	}
	public void setTOC_CONTENTS(String TOC_CONTENTS) {
		this.TOC_CONTENTS = TOC_CONTENTS;
	}
	public String getTOC_REG_ID() {
		return TOC_REG_ID;
	}
	public void setTOC_REG_ID(String TOC_REG_ID) {
		this.TOC_REG_ID = TOC_REG_ID;
	}
	public String getTOC_REG_DATE() {
		return TOC_REG_DATE;
	}
	public void setTOC_REG_DATE(String TOC_REG_DATE) {
		this.TOC_REG_DATE = TOC_REG_DATE;
	}
	public String getTOC_VISIT() {
		return TOC_VISIT;
	}
	public void setTOC_VISIT(String TOC_VISIT) {
		this.TOC_VISIT = TOC_VISIT;
	}
}

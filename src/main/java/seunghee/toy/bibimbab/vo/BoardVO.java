package seunghee.toy.bibimbab.vo;

public class BoardVO {
	
	// Variable
	private String TB_PK;			// 글 번호
	private String TB_TITLE;			// 제목
	private String TB_CONTENTS;		// 내용
	private String TB_REG_ID;			// 작성자
	private String TB_REG_DATE;		// 작성일
	private String TB_VISIT;			// 방문수
	private String TB_DEL_YN;			// 삭제여부
	private String TB_PASSWD;		// 등록 비밀번호

	// Constructor
	public BoardVO() { }
	
	public BoardVO(String TB_PK, String TB_TITLE, String TB_REG_ID, String TB_REG_DATE, String TB_VISIT) {
		this.TB_PK = TB_PK;
		this.TB_TITLE = TB_TITLE;
		this.TB_REG_ID = TB_REG_ID;
		this.TB_REG_DATE = TB_REG_DATE;
		this.TB_VISIT = TB_VISIT;
	}
	
	public BoardVO(String TB_PK, String TB_TITLE, String TB_CONTENTS, String TB_REG_ID, String TB_REG_DATE, String TB_VISIT, String TB_DEL_YN, String TB_PASSWD) {
		this.TB_PK = TB_PK;
		this.TB_TITLE = TB_TITLE;
		this.TB_CONTENTS = TB_CONTENTS;
		this.TB_REG_ID = TB_REG_ID;
		this.TB_REG_DATE = TB_REG_DATE;
		this.TB_VISIT = TB_VISIT;
		this.TB_DEL_YN = TB_DEL_YN;
		this.TB_PASSWD = TB_PASSWD;
	}
	
	// Getter and Setter
	public String getTB_PASSWD() {
		return TB_PASSWD;
	}
	public void setTB_PASSWD(String TB_PASSWD) {
		this.TB_PASSWD = TB_PASSWD;
	}
	public String getTB_DEL_YN() {
		return TB_DEL_YN;
	}
	public void setTB_DEL_YN(String TB_DEL_YN) {
		this.TB_DEL_YN = TB_DEL_YN;
	}
	public String getTB_PK() {
		return TB_PK;
	}
	public void setTB_PK(String TB_PK) {
		this.TB_PK = TB_PK;
	}
	public String getTB_TITLE() {
		return TB_TITLE;
	}
	public void setTB_TITLE(String TB_TITLE) {
		this.TB_TITLE = TB_TITLE;
	}
	public String getTB_CONTENTS() {
		return TB_CONTENTS;
	}
	public void setTB_CONTENTS(String TB_CONTENTS) {
		this.TB_CONTENTS = TB_CONTENTS;
	}
	public String getTB_REG_ID() {
		return TB_REG_ID;
	}
	public void setTB_REG_ID(String TB_REG_ID) {
		this.TB_REG_ID = TB_REG_ID;
	}
	public String getTB_REG_DATE() {
		return TB_REG_DATE;
	}
	public void setTB_REG_DATE(String TB_REG_DATE) {
		this.TB_REG_DATE = TB_REG_DATE;
	}
	public String getTB_VISIT() {
		return TB_VISIT;
	}
	public void setTB_VISIT(String TB_VISIT) {
		this.TB_VISIT = TB_VISIT;
	}
}

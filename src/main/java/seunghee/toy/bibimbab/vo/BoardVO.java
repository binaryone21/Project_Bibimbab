package seunghee.toy.bibimbab.vo;

public class BoardVO {
	
	// Variable
	private String SEQNO;			// 글 번호
	private String TITLE;			// 제목
	private String CONTENTS;		// 내용
	private String REG_ID;			// 작성자
	private String REG_DATE;		// 작성일
	private String VISIT;			// 방문수
	private String DEL_YN;			// 삭제여부
	private String SECRET_NO;		// 등록 비밀번호

	// Constructor
	public BoardVO() { }
	
	public BoardVO(String SEQNO, String TITLE, String REG_ID, String REG_DATE, String VISIT) {
		this.SEQNO = SEQNO;
		this.TITLE = TITLE;
		this.REG_ID = REG_ID;
		this.REG_DATE = REG_DATE;
		this.VISIT = VISIT;
	}
	
	public BoardVO(String SEQNO, String TITLE, String CONTENTS, String REG_ID, String REG_DATE, String VISIT, String DEL_YN, String SECRET_NO) {
		this.SEQNO = SEQNO;
		this.TITLE = TITLE;
		this.CONTENTS = CONTENTS;
		this.REG_ID = REG_ID;
		this.REG_DATE = REG_DATE;
		this.VISIT = VISIT;
		this.DEL_YN = DEL_YN;
		this.SECRET_NO = SECRET_NO;
	}
	
	// Getter and Setter
	public String getSECRET_NO() {
		return SECRET_NO;
	}
	public void setSECRET_NO(String sECRET_NO) {
		SECRET_NO = sECRET_NO;
	}
	public String getDEL_YN() {
		return DEL_YN;
	}
	public void setDEL_YN(String dEL_YN) {
		DEL_YN = dEL_YN;
	}
	public String getSEQNO() {
		return SEQNO;
	}
	public void setSEQNO(String sEQNO) {
		SEQNO = sEQNO;
	}
	public String getTITLE() {
		return TITLE;
	}
	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}
	public String getCONTENTS() {
		return CONTENTS;
	}
	public void setCONTENTS(String cONTENTS) {
		CONTENTS = cONTENTS;
	}
	public String getREG_ID() {
		return REG_ID;
	}
	public void setREG_ID(String rEG_ID) {
		REG_ID = rEG_ID;
	}
	public String getREG_DATE() {
		return REG_DATE;
	}
	public void setREG_DATE(String rEG_DATE) {
		REG_DATE = rEG_DATE;
	}
	public String getVISIT() {
		return VISIT;
	}
	public void setVISIT(String vISIT) {
		VISIT = vISIT;
	}
}

package seunghee.toy.bibimbab.vo;

public class MenuVO {

	// Variable
	private String SEQNO;		// 매장 번호
	private String KIND;		// 메뉴 종류
	private String IMG;			// 이미지 경로
	private String NAME;		// 메뉴 명
	private String PRICE;		// 메뉴 가격
	private String REG_DATE;	// 출시 일
	private String DEL_YN;		// 삭제여부
	
	// Constructor
	public MenuVO() { }
	
	public MenuVO(String SEQNO, String IMG, String NAME) {
		this.SEQNO = SEQNO;
		this.IMG = IMG;
		this.NAME = NAME;
	}

	public MenuVO(String SEQNO, String KIND, String IMG, String NAME, String PRICE, String REG_DATE, String DEL_YN) {
		this.SEQNO = SEQNO;
		this.KIND = KIND;
		this.IMG = IMG;
		this.NAME = NAME;
		this.PRICE = PRICE;
		this.REG_DATE = REG_DATE;
		this.DEL_YN = DEL_YN;
	}

	// Getter and Setter
	public String getSEQNO() {
		return SEQNO;
	}

	public void setSEQNO(String sEQNO) {
		SEQNO = sEQNO;
	}

	public String getKIND() {
		return KIND;
	}

	public void setKIND(String kIND) {
		KIND = kIND;
	}

	public String getIMG() {
		return IMG;
	}

	public void setIMG(String iMG) {
		IMG = iMG;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getPRICE() {
		return PRICE;
	}

	public void setPRICE(String pRICE) {
		PRICE = pRICE;
	}

	public String getREG_DATE() {
		return REG_DATE;
	}

	public void setREG_DATE(String rEG_DATE) {
		REG_DATE = rEG_DATE;
	}

	public String getDEL_YN() {
		return DEL_YN;
	}

	public void setDEL_YN(String dEL_YN) {
		DEL_YN = dEL_YN;
	}
}

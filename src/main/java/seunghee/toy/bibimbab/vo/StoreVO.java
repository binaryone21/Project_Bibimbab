package seunghee.toy.bibimbab.vo;

public class StoreVO {

	// Variable
	private String SEQNO;		// 매장 번호
	private String AREA1;		// 시
	private String AREA2;		// 구 
	private String AREA3;		// 동
	private String AREA;		// 시 구 동
	private String REG_DATE;	// 작성일
	private String DEL_YN;		// 삭제여부
	private String BRAND;		// 브랜드
	
	// Constructor
	public StoreVO() { }
	
	public StoreVO(String SEQNO, String AREA, String BRAND) {
		this.SEQNO = SEQNO;
		this.AREA = AREA;
		this.BRAND = BRAND;
	}

	public StoreVO(String SEQNO, String AREA1, String AREA2, String AREA3, String AREA, String REG_DATE, String DEL_YN, String BRAND) {
		this.SEQNO = SEQNO;
		this.AREA1 = AREA1;
		this.AREA2 = AREA2;
		this.AREA3 = AREA3;
		this.AREA = AREA;
		this.REG_DATE = REG_DATE;
		this.DEL_YN = DEL_YN;
		this.BRAND = BRAND;
	}

	// Getter and Setter
	public String getSEQNO() {
		return SEQNO;
	}

	public void setSEQNO(String sEQNO) {
		SEQNO = sEQNO;
	}

	public String getAREA1() {
		return AREA1;
	}

	public void setAREA1(String aREA1) {
		AREA1 = aREA1;
	}

	public String getAREA2() {
		return AREA2;
	}

	public void setAREA2(String aREA2) {
		AREA2 = aREA2;
	}

	public String getAREA3() {
		return AREA3;
	}

	public void setAREA3(String aREA3) {
		AREA3 = aREA3;
	}

	public String getAREA() {
		return AREA;
	}
	
	public void setAREA(String aREA) {
		AREA = aREA;
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

	public String getBRAND() {
		return BRAND;
	}

	public void setBRAND(String bRAND) {
		BRAND = bRAND;
	}

}

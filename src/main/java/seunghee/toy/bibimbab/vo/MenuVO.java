package seunghee.toy.bibimbab.vo;

public class MenuVO {

	// Variable
	private String TM_PK;			// 매장 번호
	private String TM_KIND;		// 메뉴 종류
	private String TM_IMG;			// 이미지 경로
	private String TM_NAME;		// 메뉴 명
	private String TM_PRICE;		// 메뉴 가격
	private String TM_REG_DATE;	// 출시 일
	private String TM_DEL_YN;		// 삭제여부
	
	// Constructor
	public MenuVO() { }
	
	public MenuVO(String TM_PK, String TM_IMG, String TM_NAME) {
		this.TM_PK = TM_PK;
		this.TM_IMG = TM_IMG;
		this.TM_NAME = TM_NAME;
	}

	public MenuVO(String TM_PK, String TM_KIND, String TM_IMG, String TM_NAME, String TM_PRICE, String TM_REG_DATE, String TM_DEL_YN) {
		this.TM_PK = TM_PK;
		this.TM_KIND = TM_KIND;
		this.TM_IMG = TM_IMG;
		this.TM_NAME = TM_NAME;
		this.TM_PRICE = TM_PRICE;
		this.TM_REG_DATE = TM_REG_DATE;
		this.TM_DEL_YN = TM_DEL_YN;
	}

	// Getter and Setter
	public String getTM_PK() {
		return TM_PK;
	}

	public void setTM_PK(String TM_PK) {
		this.TM_PK = TM_PK;
	}

	public String getTM_KIND() {
		return TM_KIND;
	}

	public void setTM_KIND(String TM_KIND) {
		this.TM_KIND = TM_KIND;
	}

	public String getTM_IMG() {
		return TM_IMG;
	}

	public void setTM_IMG(String TM_IMG) {
		this.TM_IMG = TM_IMG;
	}

	public String getTM_NAME() {
		return TM_NAME;
	}

	public void setTM_NAME(String TM_NAME) {
		this.TM_NAME = TM_NAME;
	}

	public String getTM_PRICE() {
		return TM_PRICE;
	}

	public void setTM_PRICE(String TM_PRICE) {
		this.TM_PRICE = TM_PRICE;
	}

	public String getTM_REG_DATE() {
		return TM_REG_DATE;
	}

	public void setTM_REG_DATE(String TM_REG_DATE) {
		this.TM_REG_DATE = TM_REG_DATE;
	}

	public String getTM_DEL_YN() {
		return TM_DEL_YN;
	}

	public void setTM_DEL_YN(String TM_DEL_YN) {
		this.TM_DEL_YN = TM_DEL_YN;
	}
}

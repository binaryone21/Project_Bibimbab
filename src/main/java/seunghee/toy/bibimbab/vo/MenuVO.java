package seunghee.toy.bibimbab.vo;

public class MenuVO {

	// Variable
	private String TMI_PK;			// 매장 번호
	private String TMI_KIND;		// 메뉴 종류
	private String TMI_IMG;			// 이미지 경로
	private String TMI_NAME;		// 메뉴 명
	private String TMI_PRICE;		// 메뉴 가격
	private String TMI_REG_DATE;	// 출시 일
	private String TMI_DEL_YN;		// 삭제여부
	
	// Constructor
	public MenuVO() { }
	
	public MenuVO(String TMI_PK, String TMI_IMG, String TMI_NAME) {
		this.TMI_PK = TMI_PK;
		this.TMI_IMG = TMI_IMG;
		this.TMI_NAME = TMI_NAME;
	}

	public MenuVO(String TMI_PK, String TMI_KIND, String TMI_IMG, String TMI_NAME, String TMI_PRICE, String TMI_REG_DATE, String TMI_DEL_YN) {
		this.TMI_PK = TMI_PK;
		this.TMI_KIND = TMI_KIND;
		this.TMI_IMG = TMI_IMG;
		this.TMI_NAME = TMI_NAME;
		this.TMI_PRICE = TMI_PRICE;
		this.TMI_REG_DATE = TMI_REG_DATE;
		this.TMI_DEL_YN = TMI_DEL_YN;
	}

	// Getter and Setter
	public String getTMI_PK() {
		return TMI_PK;
	}

	public void setTMI_PK(String TMI_PK) {
		this.TMI_PK = TMI_PK;
	}

	public String getTMI_KIND() {
		return TMI_KIND;
	}

	public void setTMI_KIND(String TMI_KIND) {
		this.TMI_KIND = TMI_KIND;
	}

	public String getTMI_IMG() {
		return TMI_IMG;
	}

	public void setTMI_IMG(String TMI_IMG) {
		this.TMI_IMG = TMI_IMG;
	}

	public String getTMI_NAME() {
		return TMI_NAME;
	}

	public void setTMI_NAME(String TMI_NAME) {
		this.TMI_NAME = TMI_NAME;
	}

	public String getTMI_PRICE() {
		return TMI_PRICE;
	}

	public void setTMI_PRICE(String TMI_PRICE) {
		this.TMI_PRICE = TMI_PRICE;
	}

	public String getTMI_REG_DATE() {
		return TMI_REG_DATE;
	}

	public void setTMI_REG_DATE(String TMI_REG_DATE) {
		this.TMI_REG_DATE = TMI_REG_DATE;
	}

	public String getTMI_DEL_YN() {
		return TMI_DEL_YN;
	}

	public void setTMI_DEL_YN(String TMI_DEL_YN) {
		this.TMI_DEL_YN = TMI_DEL_YN;
	}
}

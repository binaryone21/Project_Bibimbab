package seunghee.toy.bibimbab.vo;

public class StoreVO {

	// Variable
	private String TSI_PK;		// 매장 번호
	private String TSI_AREA1;		// 시
	private String TSI_AREA2;		// 구 
	private String TSI_AREA3;		// 동
	private String TSI_AREA;		// 시 구 동
	private String TSI_REG_DATE;	// 작성일
	private String TSI_DEL_YN;		// 삭제여부
	private String TSI_BRAND;		// 브랜드
	
	// Constructor
	public StoreVO() { }
	
	public StoreVO(String TSI_PK, String TSI_AREA, String TSI_BRAND) {
		this.TSI_PK = TSI_PK;
		this.TSI_AREA = TSI_AREA;
		this.TSI_BRAND = TSI_BRAND;
	}

	public StoreVO(String TSI_PK, String TSI_AREA1, String TSI_AREA2, String TSI_AREA3, String TSI_AREA, String TSI_REG_DATE, String TSI_DEL_YN, String TSI_BRAND) {
		this.TSI_PK = TSI_PK;
		this.TSI_AREA1 = TSI_AREA1;
		this.TSI_AREA2 = TSI_AREA2;
		this.TSI_AREA3 = TSI_AREA3;
		this.TSI_AREA = TSI_AREA;
		this.TSI_REG_DATE = TSI_REG_DATE;
		this.TSI_DEL_YN = TSI_DEL_YN;
		this.TSI_BRAND = TSI_BRAND;
	}

	// Getter and Setter
	public String getTSI_PK() {
		return TSI_PK;
	}

	public void setTSI_PK(String TSI_PK) {
		this.TSI_PK = TSI_PK;
	}

	public String getTSI_AREA1() {
		return TSI_AREA1;
	}

	public void setTSI_AREA1(String TSI_AREA1) {
		this.TSI_AREA1 = TSI_AREA1;
	}

	public String getTSI_AREA2() {
		return TSI_AREA2;
	}

	public void setTSI_AREA2(String TSI_AREA2) {
		this.TSI_AREA2 = TSI_AREA2;
	}

	public String getTSI_AREA3() {
		return TSI_AREA3;
	}

	public void setTSI_AREA3(String TSI_AREA3) {
		this.TSI_AREA3 = TSI_AREA3;
	}

	public String getTSI_AREA() {
		return TSI_AREA;
	}
	
	public void setAREA(String TSI_AREA) {
		this.TSI_AREA = TSI_AREA;
	}
	
	public String getTSI_REG_DATE() {
		return TSI_REG_DATE;
	}

	public void setTSI_REG_DATE(String TSI_REG_DATE) {
		this.TSI_REG_DATE = TSI_REG_DATE;
	}

	public String getTSI_DEL_YN() {
		return TSI_DEL_YN;
	}

	public void setTSI_DEL_YN(String TSI_DEL_YN) {
		this.TSI_DEL_YN = TSI_DEL_YN;
	}

	public String getTSI_BRAND() {
		return TSI_BRAND;
	}

	public void setTSI_BRAND(String TSI_BRAND) {
		this.TSI_BRAND = TSI_BRAND;
	}
}

package seunghee.toy.bibimbab.vo;

public class StoreVO {

	// Variable
	private String TS_PK;		// 매장 번호
	private String TS_AREA1;		// 시
	private String TS_AREA2;		// 구 
	private String TS_AREA3;		// 동
	private String TS_AREA;		// 시 구 동
	private String TS_REG_DATE;	// 작성일
	private String TS_DEL_YN;		// 삭제여부
	private String TS_BRAND;		// 브랜드
	
	// Constructor
	public StoreVO() { }
	
	public StoreVO(String TS_PK, String TS_AREA, String TS_BRAND) {
		this.TS_PK = TS_PK;
		this.TS_AREA = TS_AREA;
		this.TS_BRAND = TS_BRAND;
	}

	public StoreVO(String TS_PK, String TS_AREA1, String TS_AREA2, String TS_AREA3, String TS_AREA, String TS_REG_DATE, String TS_DEL_YN, String TS_BRAND) {
		this.TS_PK = TS_PK;
		this.TS_AREA1 = TS_AREA1;
		this.TS_AREA2 = TS_AREA2;
		this.TS_AREA3 = TS_AREA3;
		this.TS_AREA = TS_AREA;
		this.TS_REG_DATE = TS_REG_DATE;
		this.TS_DEL_YN = TS_DEL_YN;
		this.TS_BRAND = TS_BRAND;
	}

	// Getter and Setter
	public String getTS_PK() {
		return TS_PK;
	}

	public void setTS_PK(String TS_PK) {
		this.TS_PK = TS_PK;
	}

	public String getTS_AREA1() {
		return TS_AREA1;
	}

	public void setTS_AREA1(String TS_AREA1) {
		this.TS_AREA1 = TS_AREA1;
	}

	public String getTS_AREA2() {
		return TS_AREA2;
	}

	public void setTS_AREA2(String TS_AREA2) {
		this.TS_AREA2 = TS_AREA2;
	}

	public String getTS_AREA3() {
		return TS_AREA3;
	}

	public void setTS_AREA3(String TS_AREA3) {
		this.TS_AREA3 = TS_AREA3;
	}

	public String getTS_AREA() {
		return TS_AREA;
	}
	
	public void setAREA(String TS_AREA) {
		this.TS_AREA = TS_AREA;
	}
	
	public String getTS_REG_DATE() {
		return TS_REG_DATE;
	}

	public void setTS_REG_DATE(String TS_REG_DATE) {
		this.TS_REG_DATE = TS_REG_DATE;
	}

	public String getTS_DEL_YN() {
		return TS_DEL_YN;
	}

	public void setTS_DEL_YN(String TS_DEL_YN) {
		this.TS_DEL_YN = TS_DEL_YN;
	}

	public String getTS_BRAND() {
		return TS_BRAND;
	}

	public void setTS_BRAND(String TS_BRAND) {
		this.TS_BRAND = TS_BRAND;
	}
}

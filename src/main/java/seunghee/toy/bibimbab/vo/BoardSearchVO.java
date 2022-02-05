package seunghee.toy.bibimbab.vo;

public class BoardSearchVO {
	
	// Variable
	private String searchType;	// 검색 유형
	private String searchText;	// 검색 내용
	
	// Constructor
	public BoardSearchVO() {}
	public BoardSearchVO(String searchType, String searchText) {
		this.searchType = searchType;
		this.searchText = searchText;
	}
	
	// Getter and Setter
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getSearchText() {
		return searchText;
	}
	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}
}
package kr.co.bibimbab.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bibimbab.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	private BoardDao bdDao;
	
	/* 해당하는 조건의 Board List 조회 */
	public List<BoardVO> listVOBoard(String searchType, String searchText, String pageNO) {
		Map<String, String> param = new HashMap<>();
		String startNO = String.valueOf((Integer.parseInt(pageNO)-1)*10);
		param.put("searchType", searchType);
		param.put("searchText", searchText);
		param.put("startNO", startNO);
		return bdDao.listVOBoard(param);
	}
	
	/* 선택한 Board 정보를 조회 */
	public BoardVO selectBoard(String SEQNO) {
		updateBoardVisitPlus(SEQNO);
		return bdDao.selectBoard(SEQNO);
	}

	/* 입력한 Board 정보를 추가 */
	public int insertBoard(BoardVO boardVO) {
		return bdDao.insertBoard(boardVO);
	}
	
	/* 입력한 Board 정보를 수정 */
	public int updateBoard() {
		return bdDao.updateBoard();
	}
	
	/* 선택한 Board 정보를 삭제 */
	public int deleteBoard() {
		return bdDao.deleteBoard();
	}
	
	/* List - 해당하는 조건의 Board 갯수를 Count */
	public String selectBoardSeqnoCount(String searchType, String searchText) {
		Map<String, String> param = new HashMap<>();
		param.put("searchType", searchType);
		param.put("searchText", searchText);
		return bdDao.selectBoardSeqnoCount(param);
	}
	
	
	/* View - 선택한 Board 정보에 조회수 증가 */
	public int updateBoardVisitPlus(String SEQNO) {
		return bdDao.updateBoardVisitPlus(SEQNO);
	}
	
}

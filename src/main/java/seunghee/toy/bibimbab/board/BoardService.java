package seunghee.toy.bibimbab.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import seunghee.toy.bibimbab.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	private BoardDao bdDao;
	
	/* 해당하는 조건의 Board List 조회 */
	public List<BoardVO> listVOBoard(String searchType, String searchText, String pageNO) {
		Map<String, String> param = new HashMap<>();
		System.out.println(pageNO);
		System.out.println((Integer.valueOf(pageNO)));
		System.out.println((Integer.parseInt(pageNO)));
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
	public boolean insertBoard(BoardVO boardVO) {
		return bdDao.insertBoard(boardVO) > 0;
	}
	
	/* 입력한 Board 정보를 수정 */
	public boolean updateBoard(BoardVO boardVO) {
		return bdDao.updateBoard(boardVO) > 0;
	}
	
	/* 선택한 Board 정보를 삭제 */
	public boolean deleteBoard(String SEQNO) {
		return bdDao.deleteBoard(SEQNO) > 0;
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
